package BJ.Level01;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();	//472
		b = sc.nextInt();	//385
		
		//1의 자리
		System.out.println(a * (b%10));
		//10의 자리
		System.out.println(a * (((b%100) - (b%10)) / 10));
		//100의 자리
		System.out.println(a * (b / 100));
		
		System.out.println(a * b);
	}
}
