package Java_OOP_practice_quanLyDanhSachSinhVien;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		danhSach ds = new danhSach();
		int luaChon = 0;
		do {
			System.out.println("Chương trình quản lý danh sách sinh viên");
			System.out.println("===MENU===");
			System.out.println(
					  "1. thêm sinh viên vào danh sách\r\n"
					+ "2. In danh sách sinh viên ra màn hình\r\n"
					+ "3. kiểm tra danh sách có rỗng hay không\r\n"
					+ "4. Lấy ra số lượng sinh viên có trong danh sách\r\n"
					+ "5. Xóa danh sách sinh viên hiện tại\r\n"
					+ "6. kiểm tra sinh viên có tồn tại trong danh sách hay không dựa trên mã sinh viên\r\n"
					+ "7. xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên\r\n"
					+ "8. Tìm kiếm sinh viên dựa trên tên\r\n"
					+ "9. xuất ra danh sách sinh viên có điểm từ cao đến thấp\r\n"
					+ "0. exit");
			System.out.println("Đưa ra lựa chọn của bạn: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch (luaChon) {
			case 1:
				System.out.println("Mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Họ và tên sinh viên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Điểm trung bình: ");
				double diemTrungBinh = sc.nextDouble();
				sinhVien sv = new sinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				ds.themSinhVien(sv);
				System.out.println("Sinh viên đã được thêm vào danh sách");
				break;
				
			case 2:
				System.out.println("Danh sách sinh viên hiện tại: ");
				ds.inDanhSach();	
				break;
				
			case 3:
				System.out.println("Kiểm tra danh sách rỗng: " +ds.kiemTraDanhSachRong());
				break;
				
			case 4:
				System.out.println("Số lượng sinh viên có trong danh sách: " +ds.soLuongSinhVien());
				break;
				
			case 5:
				ds.xoaDanhSach();
				System.out.println("Đã xóa danh sách sinh viên hiện tại");
				break;
				
			case 6:
				System.out.println("Nhập mã sinh viên: ");
				maSinhVien = sc.nextLine();
				sv = new sinhVien(maSinhVien);
				System.out.println("mã sinh viên này có tồn tại: " +ds.kiemTraSinhVienTonTai(sv));
				break;
				
			case 7:
				System.out.println("Nhập mã sinh viên: ");
				maSinhVien = sc.nextLine();
				sv = new sinhVien(maSinhVien);
				ds.xoaSinhVien(sv);
				break;
				
			case 8:
				System.out.println("Họ và tên sinh viên: ");
				hoVaTen = sc.nextLine();
				System.out.println("kết quả tìm kiếm: ");
				ds.timSinhVien(hoVaTen);
				break;
				
			case 9:
				System.out.println("danh sách sinh viên có điểm từ cao đến thấp: ");
				ds.sapXepSinhVienGiamDanTheoDiem();
				ds.inDanhSach();
				break;

			default:
				break;
			}
		} while (luaChon != 0);
	}
}
