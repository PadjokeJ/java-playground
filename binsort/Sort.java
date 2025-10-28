import java.util.*;
import java.time.Instant;
import java.time.Duration;
import java.lang.Math;

class Sort {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> number2 = new ArrayList<Integer>();
    int maxInt = 100000;
    for (int i = 0; i < maxInt; i++) {
      numbers.add(i);
      number2.add(i);
    }
    Collections.shuffle(numbers);
    Collections.shuffle(number2);

    var now = Instant.now();
    binSort(numbers);
    System.out.print("elapsed ");
    System.out.println(Duration.between(now, Instant.now()).toMillis());
    
    now = Instant.now();
    number2.sort(null);
    System.out.print("elapsed ");
    System.out.println(Duration.between(now, Instant.now()).toMillis());
    
    Collections.shuffle(numbers);
    now = Instant.now();
    stalinSort(numbers);
    System.out.print("elapsed ");
    System.out.println(Duration.between(now, Instant.now()).toMillis());

    Collections.shuffle(numbers);
    now = Instant.now();
    gaslightSort(numbers);
    System.out.print("elapsed ");
    System.out.println(Duration.between(now, Instant.now()).toMillis());

  }

  static void binSort(ArrayList<Integer> nums) {
    int passes = Integer.SIZE;
    

    for (int pass = 0; pass < passes; pass++) {
      int mask = 1 << pass;

      ArrayList<Integer> step = new ArrayList<Integer>();
      int size = nums.size();
      for (int i = 0; i < size; i++) {
        if ((mask & nums.get(i)) != 0) {
          int temp = nums.remove(i);
          nums.add(temp);
          i--;
          size--;
        }
      }
          
    }
  }

  static void stalinSort(ArrayList<Integer> nums) {
    for (int i = 1; i < nums.size(); i++) {
      if(nums.get(i - 1) > nums.get(i)) {
        int temp = nums.remove(i);
        i--;
      }
    }
  }

  static void gaslightSort(ArrayList<Integer> nums) {
    ArrayList<Integer> real = new ArrayList<Integer>();
    for (int i = 0; i < nums.size(); i++) {
      real.add(i);
    }
  }
}

