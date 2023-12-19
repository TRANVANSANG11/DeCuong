package Muc1;

import java.util.Scanner;

public class nhapsonguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int songuyenchan = 0, songuyenle = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen thu nhat: ");
		int a = sc.nextInt();
		System.out.print("Nhap so nguyen thu hai: ");
		int b = sc.nextInt();
		System.out.print("Nhap so nguyen thu ba: ");
		int c = sc.nextInt();
		System.out.print("Nhap so nguyen thu tu: ");
		int d = sc.nextInt();
		if(a % 2 == 0) {
			songuyenchan++;
		}else {
			songuyenle++;
		}
		if(b % 2 == 0) {
			songuyenchan++;
		}else {
			songuyenle++;
		}
		if(c % 2 == 0) {
			songuyenchan++;
		}else {
			songuyenle++;
		}
		if(d % 2 == 0) {
			songuyenchan++;
		}else {
			songuyenle++;
		}
		System.out.println("So luong so nguyen chan la: "+songuyenchan);
		System.out.println("So luong so nguyen le la: "+songuyenle);
	}

}
