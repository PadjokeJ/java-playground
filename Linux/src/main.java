import java.io.InputStreamReader;
import java.io.BufferedReader;

public class main {
	public static void main(String[] args) {
		String s;
		Process p;

		try {
			p = Runtime.getRuntime().exec("echo 'Hello World!'");
			BufferedReader br = new BufferedReader(
				new InputStreamReader(p.getInputStream()));

			while ((s = br.readLine()) != null)
				System.out.println(s);
			p.waitFor();
			System.out.println(p.exitValue());
			p.destroy();
		} catch (Exception e) {}
	}
}
