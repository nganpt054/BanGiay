package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Accountbean;
import bean.productbean;


public class productdao {
public ArrayList<productbean> getgiay() throws Exception{
		
	
	   	
		ArrayList<productbean> ds=new ArrayList<productbean>();
		//B1: káº¿t ná»‘i
		DungChung dc = new DungChung();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "Select *from product";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
		while(rs.next()) {
    		String id=rs.getString("id");
    		String name=rs.getString("name");
    		String image=rs.getString("image");
    		String price=rs.getString("price");
    		String title=rs.getString("title");
    		String description=rs.getString("description");
    		Long cateID=rs.getLong("cateID");
    		ds.add(new productbean(id, name, image, price, title, description, cateID));
    	}
    	//Dong ket noi
    	rs.close();
    	dc.cn.close();
 
    	 return ds;
	}
public productbean loadsp(String id) throws Exception{
	
	//B1: káº¿t ná»‘i
			DungChung dc = new DungChung();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "Select * from product where id=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
			cmd.setString(1, id);
			
			ResultSet rs = cmd.executeQuery();
			//Náº¿u rs.next==false return null
			// else: return kh;
				// Táº¡o ra 1 khachhang:kh vÃ  return kh;
			while (rs.next()) 
		 {
				String pid=rs.getString("id");
	    		String name=rs.getString("name");
	    		String image=rs.getString("image");
	    		String price=rs.getString("price");
	    		String title=rs.getString("title");
	    		String description=rs.getString("description");
	    		Long cateID=rs.getLong("cateID");
	    		productbean kh=new productbean(pid, name, image, price, title, description, cateID);
	    		rs.close();
		    	dc.cn.close();
	    		return kh;
			}
			return null;
	    	//Dong ket noi	
}
public void ThemSach(String name, String anh, Long gia,String title ,String description,String maloai) throws Exception
{
	//b1: ket noi vao csdl
	DungChung dc=new DungChung();
	dc.KetNoi();
	
		String sql="insert into product (name,image,price,title,description,cateID) values (?,?,?,?,?,?)";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		cmd.setString(1,name);
		cmd.setString(2,anh);
		cmd.setLong(3,gia);
		cmd.setString(4,title);
		cmd.setString(5,description);
		cmd.setString(6,maloai);
		//b4: Thuc hien cau lieu
		cmd.executeUpdate();
	
}	
public void xoaSP(long id) throws Exception{
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql1 = "delete from ChiTietHoaDon where id=? ";
	PreparedStatement cmd1 = dc.cn.prepareStatement(sql1);
	cmd1.setLong(1, id);
	String sql = "delete from product where id=? ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setLong(1, id);
	cmd.executeUpdate();
}
public void SuaSach(String id,String name, String anh, Long gia,String title ,String description,String maloai) throws Exception
{
	//b1: ket noi vao csdl
	DungChung dc=new DungChung();
	dc.KetNoi();
	
		String sql="update product set name=?,image=?,price=?,title=?,description=?,cateID=? where id=?";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		cmd.setString(1,name);
		cmd.setString(2,anh);
		cmd.setLong(3,gia);
		cmd.setString(4,title);
		cmd.setString(5,description);
		cmd.setString(6,maloai);
		cmd.setString(7, id);
		//b4: Thuc hien cau lieu
		cmd.executeUpdate();
	
}

}
