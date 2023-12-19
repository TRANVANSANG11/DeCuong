package Muc1;

import java.util.Scanner;

public class tinhtiendien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số chữ điện đã dùng: ");
		int Sochudien = sc.nextInt();
		int Dongia = 0;
		if (Sochudien <= 100) {
			Dongia = 1800;
		} else if (Sochudien <= 200) {
			Dongia = 2500;
		} else {
			Dongia = 3000;
		}
		int Sotien = Sochudien * Dongia;
		System.out.println("Số tiền phải trả la: " + Sotien);

	}

}
