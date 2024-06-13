package methodemo;

import java.util.Scanner;

public class Shape {

	public static void rectangle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");

		int lenght = sc.nextInt();

		System.out.println("breadth=:");

		int breadth = sc.nextInt();

		int area = lenght * breadth;

		System.out.println("The area of the rectnagle is=:" + area);

	}
	
	
	

	public static void main(String[] args) {

		Shape.rectangle();

	}

}
