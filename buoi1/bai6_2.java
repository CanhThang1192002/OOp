package bai6;

import java.util.Scanner;

public class bai6_2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("what's your name?");
		String strname = keyboard.nextLine();
		System.out.println("how old are you?");
		int iage = keyboard.nextInt();
		System.out.println("how tall are you (m)?");
		double dheight = keyboard.nextDouble();
		System.out.println("mrs/ms. " + strname + ", " + iage + " years old. " + "youur height is " + dheight + ".");
		;
	}
}
