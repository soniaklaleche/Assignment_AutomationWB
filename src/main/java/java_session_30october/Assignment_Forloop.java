package java_session_30october;

public class Assignment_Forloop {

	public static int i;
	public static int j;
	public static int n;

	public static void main(String[] args) {

		S1();
		S2();
		S3();
		// S4();
		S5();
		// S6();
		S7();
		// S8();
		// S9();
		S10();

	}

	// WAP to print the first 20 even numbers
	static void S1() {

		for (i = 2; i <= 40; i = i + 2) {

			System.out.print(i + " ");

		}
		System.out.println("");
		System.out.println("----------------------------");
	}

	// WAP to print the first 10 multiples of 5
	static void S2() {
		for (i = 5; i <= 10 * 5; i = i + 5) {

			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------------------------");

	}

	// WAP to print the first 10 multiples of 5
	static void S3() {

		for (i = 100; i >= 50; i = i - 1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------------------------");
	}

	static void S4() {
		for (i = 200; i >= 100; i = i - 5) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------------------------");

	}

	static void S5() {
		int l = 100;
		int sum = 0;
		for (i = 1; i <= l; ++i) {
			sum = sum + i;

		}
		System.out.print("the Sum is : " + sum);
		System.out.println();
		System.out.println("----------------------------");

	}

	// WAP to print the sum of first 100 natural numbers
	static void S6() {
		int n, c, sum = 0;
		for (n = 0; n <= 10; n++) {
			c = 0;
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					c++;
					// break;
				}
			}
			if (c == 0 && n != 1) {
				sum = sum + n;
			}
		}
		System.out.println("\n The Sum of Prime Numbers from 1 to 10 = " + sum);
		System.out.println();
		System.out.println("----------------------------");

	}

	static void S7() {
		for (int r = 1; r <= 5; r++) {
			for (int col = 1; col <= r; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("----------------------------");

	}

	static void S8() {

		int r = 5;

		for (int i = 1; i <= r; ++i) {

			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("----------------------------");
	}

	static void S9() {
		int r = 5;

		for (int i = 1; i <= r; ++i) {

			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		System.out.println("----------------------------");

	}

	static void S10() {
		int d = 10;
		for (int i = 0; i <= d - 1; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(" i");
			}
			System.out.println("0");
		}

		for (int i = d - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {

				System.out.print("");
			}
			System.out.println("");

			
		}
	}

}
