package Collection.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
	static ArrayList<KySu> dsKySu = new ArrayList<KySu>();
	static ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
	static ArrayList<CongNhan> dsCN = new ArrayList<CongNhan>();

	public static boolean nhapGioitinh() {
		while (true) {
			try {
				int sex = Integer.parseInt(sc.nextLine());
				if (sex == 0) {
					return true;
				} else if (sex == 1) {
					return false;
				} else {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException ex) {
				System.out.println("Bạn nhập sai mời nhập lại");
			}
		}
	}

	public static void ThemCanBo() {
		System.out.println("Mời bạn chọn chức vụ để thêm");
		System.out.println("1. Kỹ sư");
		System.out.println("2. Công mhân");
		System.out.println("3. Nhâm viên");
		int cv = sc.nextInt();
		if (cv == 1) {

			System.out.println("Mời bạn nhập thông tin kỹ sư : ");
			System.out.print("Họ và tên: ");
			Scanner nameinput = new Scanner(System.in);
			String name = nameinput.nextLine();
			System.out.print("Ngày sinh: ");
			String date = nameinput.nextLine();
			System.out.print("Giới tính(Nam[0]và Nữ[1]): ");
			boolean gioiTinh = nhapGioitinh();
			System.out.print("Địa Chỉ: ");
			String accress = nameinput.nextLine();
			System.out.print("Ngành: ");
			String nganh = nameinput.nextLine();
			String chuv = "Kỹ Sư";

			KySu kysu = new KySu(name, date, gioiTinh, accress, chuv, nganh);
			dsKySu.add(kysu);
			CanBo canBo = new CanBo(name, date, gioiTinh, accress, chuv);
			dsCanBo.add(canBo);

		} else if (cv == 2) {

			System.out.println("Mời bạn nhập thông tin công nhân : ");
			System.out.print("Họ và tên: ");
			Scanner nameinput = new Scanner(System.in);
			String name = nameinput.nextLine();
			System.out.print("Ngày sinh: ");
			String date = nameinput.nextLine();
			System.out.print("Giới tính(Nam[0]và Nữ[1]): ");
			boolean gioiTinh = nhapGioitinh();
			System.out.print("Địa Chỉ: ");
			String accress = nameinput.nextLine();
			System.out.print("Bậc: ");
			String bac = nameinput.nextLine();
			String chuv = "Công nhân";
			CanBo canBo = new CanBo(name, date, gioiTinh, accress, chuv);
			dsCanBo.add(canBo);
			CongNhan cn = new CongNhan(name, date, gioiTinh, accress, chuv, bac);
			dsCN.add(cn);

		} else if (cv == 3) {

			System.out.println("Mời bạn nhập thông tin nhân viên: ");
			System.out.print("Họ và tên: ");
			Scanner nameinput = new Scanner(System.in);
			String name = nameinput.nextLine();
			System.out.print("Ngày sinh: ");
			String date = nameinput.nextLine();
			System.out.print("Giới tính(Nam[0]và Nữ[1]): ");
			boolean gioiTinh = nhapGioitinh();
			System.out.print("Địa chỉ: ");
			String accress = nameinput.nextLine();
			System.out.print("công việc: ");
			String job = nameinput.nextLine();
			String chuv = "Nhân viên";

			NhanVien nv = new NhanVien(name, date, gioiTinh, accress, chuv, job);
			dsNV.add(nv);
			CanBo canBo = new CanBo(name, date, gioiTinh, accress, chuv);
			dsCanBo.add(canBo);

		}

	}

	public static void XuatCanBo() {
		if (dsCanBo.size() == 0) {
			System.out.println("Danh sách rỗng");
		} else {
			System.out.println("------------------------------DANH SÁCH CÁN BỘ------------------------------------");
			System.out.printf("%-14s %-24s %-19s %-19s %-19s %-19s", "Họ và tên", "Năm sinh", "Giới tính", "Địa chỉ", "Chức vụ", "Chi tiết chức vụ");
			System.out.println();
			for (CanBo cb : dsCanBo) {
				System.out.printf("%-15d", cb.getName());
				System.out.printf("%-25s", cb.getDate());
				if (cb.isSex() == true) {
					System.out.printf("%-20s", "Nam");
				} else {
					System.out.printf("%-20s", "Nữ");
				}
				System.out.printf("%-20s", cb.getAccress());
				System.out.printf("%-20s", cb.getChucvu());
				if (cb.getChucvu().equalsIgnoreCase("Kỹ Sư")) {
					for (KySu ks : dsKySu)
						if(ks.getName()==cb.getName()) {
							System.out.printf("%-20s", ks.getNganh());
						}
						
				} else if (cb.getChucvu().equalsIgnoreCase("Công Nhân")) {
					for (CongNhan cn : dsCN) {
						if(cn.getName()==cb.getName()) {
							System.out.printf("%-20s", cn.getBac());
						}
						
					}
				} else if (cb.getChucvu().equalsIgnoreCase("Nhân Viên")) {
					for (NhanVien nv : dsNV) {
						if(nv.getName()==nv.getName()) {
							System.out.printf("%-20s", nv.getJob());
						}
						
					}
				}
			}

		}

	}
	public static void timKiem() {
		
	}

}
