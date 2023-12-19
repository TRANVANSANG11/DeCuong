package Muc1;

import java.util.Scanner;
import java.lang.*;

public class tinhchuvidientichtamgiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		float p, S, C;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		if(a <= 0 || b <= 0 || c <= 0) {
		System.out.println("Ban da nhap sai!.Hay nhap lai");
		}
		}while(a <= 0 || b <= 0 || c <= 0);
			p = (a + b + c) / 2;
			S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("Dien tich cua tam giac la: "+S);
			C = ( a + b + c);
			System.out.println("Chu vi cua tam giac la: "+C);
	}
}
