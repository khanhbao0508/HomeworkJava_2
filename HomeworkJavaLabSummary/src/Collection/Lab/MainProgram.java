package Collection.Lab;

import java.util.Scanner;

public class MainProgram {
	static Scanner sc = new Scanner(System.in);
	static QuanLyCanBo qlcb = new QuanLyCanBo();

	public static void menu() {
		System.out.println("1.Thêm cán bộ");
		System.out.println("2.Xem cán bộ");
		System.out.println("3.Tìm kiếm cán bộ");
		int chon = sc.nextInt();
		switch (chon) {
		case 1:
			qlcb.ThemCanBo();
			break;
		case 2:
			qlcb.XuatCanBo();
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			menu();
		}
	}

}
