package bo;

import dao.CTHDdao;

public class CTHDbo {
	CTHDdao khdao= new CTHDdao();
	public void getcthd(String pid, Long soluongmua, int MaHD, String damua ) throws Exception{
		    khdao.themcthd(pid, soluongmua, MaHD, damua);
   }
	public int maxhd() throws Exception {
		return khdao.maxhd();
		
	}
	public void xacnhancthd(String pid,String damua)throws Exception {
		khdao.xacnhancthd(pid, damua);
	}
	public void xoacthd(String pid) throws Exception{
		khdao.xoacthd(pid);
	}
}
