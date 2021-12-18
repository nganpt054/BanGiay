package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds=new ArrayList<giohangbean>();

	public void Them(String idsp,String namesp, Long dongia,Long slmua,String image ){
		
		for(giohangbean g:ds)
			if(g.getNamesp().equals(namesp))
			{
				g.setSlmua(g.getSlmua()+slmua);
				return ;
			}
		ds.add(new giohangbean(idsp, namesp, dongia, slmua, image));
	}
	public void xoa(String idsp) {
		for(giohangbean g: ds)
			  if(g.getIdsp().equals(idsp)) {
				  ds.remove(g);break;
			  }
	}
	public void SuaSoluong(String idsp, long soluong) {
		for (giohangbean gh : ds) {
			if (gh.getIdsp().equals(idsp)) {
				gh.setSlmua(soluong);
				break;
			}
		}
	}
	public void XoaHet() {
		ds.removeAll(ds);
	}
	
	public Long TongTien() {
		long s=(long)0;
		for(giohangbean g: ds)
			s+=g.getThanhtien();
		return s;
	}
public int Dem(){
    	
    	int dem=0;
    	for(giohangbean gh: ds)
    		
    			dem++;
    	return dem;
 	
	}
}
