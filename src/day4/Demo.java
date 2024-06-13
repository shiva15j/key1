package day4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Operator=:");

		String opr = sc.next();

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		switch (opr) {
		case "+":

			int sum = num + num1;
			System.out.println("The sum=:" + sum);
			break;

		case "-":

			int sub = num - num1;
			System.out.println("The sub=:" + sub);

			break;

		case "/":

			int div = num / num1;
			System.out.println("The div=:" + div);

			break;
		case "*":

			int mul = num * num1;
			System.out.println("The mul=:" + mul);

			break;
		case "%":
			int mod = num % num1;
			System.out.println("The mod=:" + mod);

			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
