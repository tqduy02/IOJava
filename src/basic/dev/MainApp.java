package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Thong tin mot sinh vien:");
		System.out.print("Ten: ");
		String tenSv = sc.nextLine();
		System.out.print("Ma sinh vien: ");
		int msv = sc.nextInt();
		System.out.print("Can cuoc cong dan: ");
		long cccd = sc.nextLong();
		System.out.print("Ten lop: ");
		String className = sc.next();
		System.out.print("Ten truong: ");
		String schoolName = sc.next();
		System.out.print("Diem trung binh: ");
		float dtb = sc.nextFloat();
		System.out.println(" Thong tin cong nhan");
		System.out.print("Ten: ");
		String tenCn = sc.next();
		System.out.print("Dia chi: ");
		String dc = sc.next();
		System.out.print("So dien thoai: ");
		long sdt = sc.nextLong();
		System.out.print("He so luong: ");
		float hsl = sc.nextFloat();
		System.out.println(" Thong tin mot chiec xe");
		System.out.print("Ten: ");
		String tenXe = sc.next();
		System.out.print("Hang: ");
		String hangXe = sc.next();
		System.out.print("Gia: ");
		long giaXe = sc.nextLong();
		System.out.print("Mau son:");
		String mauXe = sc.next();
	}
}