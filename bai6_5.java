package bai6;

import java.util.Scanner;

import java.util.Arrays;  
public class bai6_5 {
	public static void main(String[] args) {
		int n, sum = 0, tempSort;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap vao so phan tu cua mang: ");
			n = scanner.nextInt();
		} while (n < 0);
		int array[] = new int[n];
		System.out.println("nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu thu " + i + ": ");
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); 
		
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}
		System.out.println("\ntong cac phan tu trong mang = " + sum);
	}
}
