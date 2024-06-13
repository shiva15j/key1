package day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Side=:");

		int side = sc.nextInt();

		int area = side * side * side;

		System.out.println("The area of the cube=:" + area);

	}

}
