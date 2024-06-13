package methodemo;

import java.util.Scanner;

public class Calculator {

	public static void sum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int sum = num + num1;

		System.out.println("The Sum=:" + sum);

	}

	public static void sub() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int sub = num - num1;

		System.out.println("The sub=:" + sub);

	}

	public static void mul() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int mul = num * num1;

		System.out.println("The mul=:" + mul);

	}

	public static void div() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int div = num / num1;

		System.out.println("The div=:" + div);

	}

	public static void main(String[] args) {

		Calculator.sub();

		System.out.println(" ");

		Calculator.div();

		System.out.println(" ");

		Calculator.sum();

		System.out.println(" ");

		Calculator.mul();
	}

}
