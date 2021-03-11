
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("I rule this world");
		int x = 3;
		String name = "Jerry";
		x = x * 17;
		double d = Math.random();
		// Verify the value x
		while (x > 12) {
			x = x - 1;
		}
		for (int i = 0; i < 8; i = i + 1) {
			System.out.println("i is now" + i);
		}
		if (x == 10) {
			System.out.println("x must be 10");
		}
		else {
			System.out.println("x isn't 10");
		}
		if ((x < 30) & (name.equals("Jerry"))) {
			System.out.println("Yes so what?");
		}
		System.out.println("great info to master");
	}
}
