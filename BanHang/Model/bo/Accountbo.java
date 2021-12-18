package bo;

import java.util.ArrayList;

import bean.Accountbean;

import dao.Accountdao;


public class Accountbo {
	Accountdao adao=new Accountdao();
	Accountbean ac=new Accountbean();
	public Accountbean ktdn(String makh, String matkhau) throws Exception
	   {
	    	return adao.getkh(makh, matkhau);
	   }
	public void getkh(String user, String pass) throws Exception{
	    adao.dangky(user, pass);;
	    }
	public void getkhAdmin(String user, String pass) throws Exception{
	    adao.dangkyAdmin(user, pass);
	    }
	 public Accountbean ktkh(String makh) throws Exception
	   {
	    	return adao.ktkh(makh);
	   }
	 public ArrayList<Accountbean> gethtKH() throws Exception{
		   return adao.htKH();
	   }
	 public void getxoaKH(long makh) throws Exception{
		 adao.xoaKH(makh);
	 }
}
