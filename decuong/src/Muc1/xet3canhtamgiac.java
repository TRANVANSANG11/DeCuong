package Muc1;

import java.util.Scanner;

public class xet3canhtamgiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();
		if(a + b > c && b + c > a && c + a > b) {
			System.out.println("Day la ba canh cua tam giac");
		}else {
			System.out.println("Day khong phai ba canh cua tam giac");
		}
			
	}

}
