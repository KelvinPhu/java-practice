package Java_OOP_practice_quanLyDanhSachSinhVien;

public class sinhVien implements Comparable<sinhVien> {
	private String maSinhVien, hoVaTen;
	private int namSinh;
	private double diemTrungBinh;
	
	// constructor
	public sinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	

	public sinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}


	// Getter & setter
	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	// toString()
	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
	public int compareTo(sinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}


	// hashCode & equal
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diemTrungBinh);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hoVaTen == null) ? 0 : hoVaTen.hashCode());
		result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
		result = prime * result + namSinh;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhVien other = (sinhVien) obj;
		if (Double.doubleToLongBits(diemTrungBinh) != Double.doubleToLongBits(other.diemTrungBinh))
			return false;
		if (hoVaTen == null) {
			if (other.hoVaTen != null)
				return false;
		} else if (!hoVaTen.equals(other.hoVaTen))
			return false;
		if (maSinhVien == null) {
			if (other.maSinhVien != null)
				return false;
		} else if (!maSinhVien.equals(other.maSinhVien))
			return false;
		if (namSinh != other.namSinh)
			return false;
		return true;
	}
	
	
	
}
