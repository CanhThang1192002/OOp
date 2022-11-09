package bai6;

import java.util.Scanner;

public class bai6_3 {
public static void main(String[] args) {
	Scanner nhap = new Scanner(System.in);
	System.out.println("nhap n = ");
	int n = nhap.nextInt();
	int i,j;
	for(i = 0; i < n; i++) {
		for(j = 1; j <= 2*n+1; j++) {
			if(j <= n-i-1 || j >= n+i+1 ) System.out.format(" ");
			else System.out.format("*");
		}
		System.out.format("\n");
	}
}
}
