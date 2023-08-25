package Java_OOP_practice_quanLyDanhSachSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhSach {
	public ArrayList<sinhVien> danhSach;
	
	// constructor
	public danhSach(ArrayList<sinhVien> danhSach) {
		super();
		this.danhSach = danhSach;
	}
	
	// constructor rỗng
	public danhSach() {
		this.danhSach = new ArrayList<sinhVien>();
	}



	// 1. thêm sinh viên vào danh sách
	public void themSinhVien(sinhVien sv) {
		this.danhSach.add(sv);
	}
	
	//2. In danh sách sinh viên ra màn hình
	public void inDanhSach() {
		for (sinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
	// 3. kiểm tra danh sách có rỗng hay không
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	
	// 4. Lấy ra số lượng sinh viên có trong danh sách
	public int soLuongSinhVien() {
		return this.danhSach.size();
	}
	
	// 5. làm rỗng danh sách sinh viên
	public void xoaDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	
	//6. kiểm tra sinh viên có tồn tại trong danh sách hay không dựa trên mã sinh viên
	public boolean kiemTraSinhVienTonTai(sinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
	// 7. xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public void xoaSinhVien(sinhVien sv) {
		this.danhSach.remove(sv);
	}
	
	//8. Tìm kiếm sinh viên dựa trên tên
	public void timSinhVien(String ten) {
			for (sinhVien sinhVien : danhSach) {
				if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
					System.out.println(sinhVien);
				}
			}
	}
	
	// 9. xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<sinhVien>() {

			@Override
			public int compare(sinhVien sv1, sinhVien sv2) {
				if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				}else if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
}
