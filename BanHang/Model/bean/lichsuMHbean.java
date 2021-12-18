package bean;

public class lichsuMHbean {
	private long MaChiTietHD;
	private String user;
	private String namesp;
	private int  SoLuongMua;
	private int gia;
	private int ThanhTien;
	private String damua;
	public lichsuMHbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsuMHbean(long MaChiTietHD, String user, String namesp, int soLuongMua, int gia, int thanhTien, String damua) {
		super();
		this.MaChiTietHD = MaChiTietHD;
		this.user = user;
		this.namesp = namesp;
		this.SoLuongMua = soLuongMua;
		this.gia = gia;
		this.ThanhTien = thanhTien;
		this.damua = damua;
	}
	public long getuID() {
		return MaChiTietHD;
	}
	public void setuID(long uID) {
		this.MaChiTietHD = uID;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getNamesp() {
		return namesp;
	}
	public void setNamesp(String namesp) {
		this.namesp = namesp;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.SoLuongMua = soLuongMua;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.ThanhTien = thanhTien;
	}
	public String getDamua() {
		return damua;
	}
	public void setDamua(String damua) {
		this.damua = damua;
	}
	
}
