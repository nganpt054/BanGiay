package bean;

public class CTHDbean {
	private int MaChiTietHD;
	private String pid;
	private int SoLuongMua;
	private int MaHoaDon;
	private String DaMua;
	public CTHDbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTHDbean(int maChiTietHD, String pid, int soLuongMua, int maHoaDon, String daMua) {
		super();
		this.MaChiTietHD = maChiTietHD;
		this.pid = pid;
		this.SoLuongMua = soLuongMua;
		this.MaHoaDon = maHoaDon;
		this.DaMua = daMua;
	}
	public int getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(int maChiTietHD) {
		this.MaChiTietHD = maChiTietHD;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.SoLuongMua = soLuongMua;
	}
	public int getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.MaHoaDon = maHoaDon;
	}
	public String getDaMua() {
		return DaMua;
	}
	public void setDaMua(String daMua) {
		this.DaMua = daMua;
	}
	
}
