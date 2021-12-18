package bean;

public class giohangbean {
	private String idsp;
	private String namesp;
	private Long dongia;
	private Long slmua;
	private Long thanhtien;
	private String image;

	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
public giohangbean(String idsp, String namesp, Long dongia, Long slmua, String image) {
	super();
	this.idsp = idsp;
	this.namesp = namesp;
	this.dongia = dongia;
	this.slmua = slmua;
	this.thanhtien = dongia*slmua;
	this.image = image;
}
public String getIdsp() {
	return idsp;
}
public void setIdsp(String idsp) {
	this.idsp = idsp;
}
public String getNamesp() {
	return namesp;
}
public void setNamesp(String namesp) {
	this.namesp = namesp;
}
public Long getDongia() {
	return dongia;
}
public void setDongia(Long dongia) {
	this.dongia = dongia;
}
public Long getSlmua() {
	return slmua;
}
public void setSlmua(Long slmua) {
	this.slmua = slmua;
}
public Long getThanhtien() {
	return slmua*dongia;
}
public void setThanhtien(Long thanhtien) {
	this.thanhtien = thanhtien;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
	
	
}
