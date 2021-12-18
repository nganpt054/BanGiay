package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import bean.Accountbean;




public class Accountdao {
public Accountbean getkh(String un,String pass) throws Exception{
		
		//B1: káº¿t ná»‘i
				DungChung dc = new DungChung();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from Account where [user]=? and pass=? ";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				cmd.setString(1, un);
				cmd.setString(2, pass);
				
				ResultSet rs = cmd.executeQuery();
				//Náº¿u rs.next==false return null
				// else: return kh;
					// Táº¡o ra 1 khachhang:kh vÃ  return kh;
				if (rs.next()==false) return null;
				else {
					
					String uID=rs.getString("uID");
		    		String user=rs.getString("user");
		    		String pass1=rs.getString("pass");
		    		Long isAdmin=rs.getLong("isAdmin");
		    		Accountbean ac=new Accountbean(uID, user, pass1, isAdmin);
		    		rs.close();
			    	dc.cn.close();
		    		return ac;
					}
		    	//Dong ket noi	
	}
public Accountbean ktkh(String un) throws Exception{
	
	//B1: káº¿t ná»‘i
			DungChung dc = new DungChung();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "Select * from Account where [user]=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
			cmd.setString(1, un);
			
			ResultSet rs = cmd.executeQuery();
			//Náº¿u rs.next==false return null
			// else: return kh;
				// Táº¡o ra 1 khachhang:kh vÃ  return kh;
			while (rs.next()) 
		 {
				
				String uID=rs.getString("uID");
	    		String user=rs.getString("user");
	    		String pass=rs.getString("pass");
	    		Long isAdmin=rs.getLong("isAdmin");
	    		Accountbean kh=new Accountbean(uID, user, pass, isAdmin);
	    		rs.close();
		    	dc.cn.close();
	    		return kh;
			}
			return null;
	    	//Dong ket noi	
}

public void dangky(String user,String pass )throws Exception {
	
	
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "insert into Account values (?,?,?) ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, user);
		cmd.setString(2, pass);
		cmd.setString(3, "0");
		cmd.executeUpdate();
	
	
}
public void dangkyAdmin(String user,String pass )throws Exception {
	
	
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql = "insert into Account values (?,?,?) ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setString(1, user);
	cmd.setString(2, pass);
	cmd.setString(3, "0");
	cmd.executeUpdate();
}
public ArrayList<Accountbean> htKH() throws Exception{
	
	
   	
	ArrayList<Accountbean> ds=new ArrayList<Accountbean>();
	//B1: káº¿t ná»‘i
	DungChung dc = new DungChung();
	dc.KetNoi();
	//b2: lay du lieu ve
	String sql = "Select *from Account where isAdmin=0";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	ResultSet rs = cmd.executeQuery();
	//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
	while(rs.next()) {
		String uID=rs.getString("uID");
		String user=rs.getString("user");
		String pass=rs.getString("pass");
		Long isAdmin=rs.getLong("isAdmin");
		ds.add(new Accountbean(uID, user, pass, isAdmin));
	}
	//Dong ket noi
	rs.close();
	dc.cn.close();

	 return ds;
}
public void xoaKH(long makh) throws Exception{
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql = "delete from Account where uID=? ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setLong(1, makh);
	cmd.executeUpdate();
}
}
