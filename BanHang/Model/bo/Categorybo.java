package bo;

import java.util.ArrayList;

import bean.Categorybean;
import dao.Categorydao;



public class Categorybo {
	Categorydao ldao= new Categorydao();
	   public ArrayList<Categorybean> getloai() throws Exception{
		   return ldao.getloai();
	   }
	   public Categorybean loadloai(String id) throws Exception{
		   return ldao.loadloai(id);
	   }
	   public void SuaLoai(String id,String name) throws Exception
		{
		   ldao.SuaLoai(id, name);
		}
	   public void xoaLoai(long id) throws Exception{
		   ldao.xoaLoai(id);
	   }
	   public void ThemLoai( String cname) throws Exception
		{
		   ldao.ThemLoai( cname);
		}
}
