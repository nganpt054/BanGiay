package bean;

public class hoadonbean {
	private int MaHoaDon;
	private String makh;
	private String NgayMua;
	private String damua;
	public hoadonbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hoadonbean(int maHoaDon, String makh, String ngayMua, String damua) {
		super();
		this.MaHoaDon = maHoaDon;
		this.makh = makh;
		this.NgayMua = ngayMua;
		this.damua = damua;
	}
	public int getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.MaHoaDon = maHoaDon;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(String ngayMua) {
		this.NgayMua = ngayMua;
	}
	public String getDamua() {
		return damua;
	}
	public void setDamua(String damua) {
		this.damua = damua;
	}
	
}
