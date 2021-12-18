package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Categorybean;
import bean.productbean;



public class Categorydao {
	public ArrayList<Categorybean> getloai() throws Exception{
		ArrayList<Categorybean> ds=new ArrayList<Categorybean>();
		DungChung dc= new DungChung();
		dc.KetNoi();
	
		String sql="Select * from Category";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		ResultSet rs=cmd.executeQuery();
		
		while (rs.next()) {
			String cid=rs.getString("cid");
			String cname=rs.getString("cname");
			ds.add(new Categorybean(cid, cname));
		}

		rs.close();
		dc.cn.close();
		return ds;
		
	}
	public Categorybean loadloai(String id) throws Exception{
		
		//B1: káº¿t ná»‘i
				DungChung dc = new DungChung();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from Category where cid=?";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
				cmd.setString(1, id);
				ResultSet rs = cmd.executeQuery();
				//Náº¿u rs.next==false return null
				// else: return kh;
					// Táº¡o ra 1 khachhang:kh vÃ  return kh;
				while (rs.next()) 
			 {
					String cid=rs.getString("cid");
		    		String cname=rs.getString("cname");
		    		
		    		Categorybean kh=new Categorybean(cid, cname);
		    		rs.close();
			    	dc.cn.close();
		    		return kh;
				}
				return null;
		    	//Dong ket noi	
	}
	public void SuaLoai(String id,String name) throws Exception
	{
		//b1: ket noi vao csdl
		DungChung dc=new DungChung();
		dc.KetNoi();
		
			String sql="update Category set cname=? where cid=?";
			PreparedStatement cmd=dc.cn.prepareStatement(sql);
			cmd.setString(1,name);
			cmd.setString(2,id);
			
			//b4: Thuc hien cau lieu
			cmd.executeUpdate();
		
	}
	public void ThemLoai( String cname) throws Exception
	{
		//b1: ket noi vao csdl
		DungChung dc=new DungChung();
		dc.KetNoi();
		
			String sql="insert into Category (cname) values (?)";
			PreparedStatement cmd=dc.cn.prepareStatement(sql);
			cmd.setString(1,cname);
			//b4: Thuc hien cau lieu
			cmd.executeUpdate();
		
	}	
	public void xoaLoai(long id) throws Exception{
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql1 = "delete from product where cateID=? ";
		PreparedStatement cmd1 = dc.cn.prepareStatement(sql1);
		cmd1.setLong(1, id);
		String sql = "delete from category where cid=? ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setLong(1, id);
		cmd.executeUpdate();
	}
}
