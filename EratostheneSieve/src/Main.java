public class Main {
    public static void main(String[] args) {

        int maxInt = Integer.parseInt(args[0]);
        if (maxInt <= 2) {
            return;
        }

        boolean[] numbers = new boolean[maxInt];

        for (int i = 0; i <= maxInt - 1; i++) {
            numbers[i] = true;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 2; i * i < maxInt; i++) {
            if (numbers[i]) {
                for (int k = i * i; k < maxInt; k += i) {
                    numbers[k] = false;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long delta = endTime - startTime;
        float dt = delta / 1000f;

        if (Boolean.parseBoolean(args[1])) {
            for (int i = 2; i < maxInt; i++) {
                if (numbers[i]) {
                    System.out.print(i);
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        System.out.println("Program executed in " + String.valueOf(dt) + " Seconds");
    }
}