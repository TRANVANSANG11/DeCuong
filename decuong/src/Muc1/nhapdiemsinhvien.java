package Muc1;

import java.util.Scanner;

public class nhapdiemsinhvien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap diem cua sinh vien: ");
		float n = sc.nextFloat();
		if(n >= 8 && n <= 10) {
			System.out.println("Hoc luc gioi");
		}else if(n >= 6.5 && n < 8) {
			System.out.println("Hoc luc kha");
		}else if(n < 6.5) {
			System.out.println("Hoc luc trung binh");
		}else {
			System.out.println("Khong co diem nay");
		}
	}

}
