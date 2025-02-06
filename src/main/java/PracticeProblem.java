import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String s = in.nextLine();
		System.out.println(s.charAt(0));
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean b = in.nextBoolean();
		in.nextLine();
		System.out.println(!b);
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int n = in.nextInt();
		in.nextLine();
		System.out.println(n > 5);
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.println(-2 <= d && d <= 2);
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String s = in.nextLine();
		System.out.println(s.equals("Hello World"));
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int a = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int b = in.nextInt();
		in.nextLine();
		System.out.println(a <= b);
	}

	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double a = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		double b = in.nextInt();
		in.nextLine();
		System.out.println(a > b);
	}

}
