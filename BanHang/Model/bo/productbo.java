package bo;

import java.util.ArrayList;

import bean.Accountbean;
import bean.productbean;
import dao.productdao;

public class productbo {
	productdao gdao= new productdao();
	   public ArrayList<productbean> getgiay() throws Exception{
		   return gdao.getgiay();
	   }
	   public ArrayList<productbean> TimMaSach(ArrayList<productbean> ds, String maloai){
			ArrayList<productbean> tam= new ArrayList<productbean>();
			for (productbean sv:ds)
				if(sv.getCateID().equals(maloai))
					tam.add(sv);
			return tam;
		
		}
		public ArrayList<productbean> Tim(ArrayList<productbean> ds, String key){
	    	ArrayList<productbean> tam= new ArrayList<productbean>();
	    	for(productbean sv: ds)
	    		if(sv.getName().toLowerCase().contains(key.toLowerCase()))
	    			tam.add(sv);
	    	return tam;
	 	
		}
		public productbean loadSp(String id) throws Exception
		   {
		    	return gdao.loadsp(id);
		   }
		public void getThemSach(String name, String anh,String title ,String description, Long gia,String maloai) throws Exception{
			gdao.ThemSach(name, anh, gia, title, description, maloai);;
		}
		public void getSuaSach(String id,String name, String anh, Long gia,String title ,String description,String maloai) throws Exception{
			gdao.SuaSach(id, name, anh, gia, title, description, maloai);
		}
		public void getxoaSP(long id) throws Exception{
			gdao.xoaSP(id);
		}
}
