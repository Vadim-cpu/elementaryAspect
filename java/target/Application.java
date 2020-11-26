package target;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
//		int result = mult(10,20) + mult(20, 30);
		int result = randomBsht();
		System.out.println("DONE! >>" + result);
		
		
	}

	
	public static int randomBsht() {
		int x = 0;
		Random r = new Random();
		
		for (int i = 0; i < 1000000; i++) {
			x += mult(r.nextInt(), r.nextInt()) + div(r.nextInt(),10);
		}
		
		return x;
	}
	
	
	
	public static int div(int a, int b) {
		return a/b;
		
	}
	public static int mult(int a, int b) {
		return a * b;
	}
}
