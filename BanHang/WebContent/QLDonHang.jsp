<%@page import="bean.lichsuMHbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="background-color: aqua">
	<%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	 ArrayList<lichsuMHbean> ds =(ArrayList<lichsuMHbean>) request.getAttribute("dsls"); 
   
 %>
 <font color="red">
 <h2 style="text-align:center"  >XÁC NHẬN ĐƠN HÀNG</h2>
 </font>
 <table align="center">


             <table width="1000" align="center">
    
    <tr> 
       <td valign="top" width="200">
       		<table class="table table-bordered">
       		
       		 <thead>
    <tr>

      <th scope="col" bgcolor="green">Mã chi tiết hóa đơn</th>
      <th scope="col" bgcolor="green">Tên khách hàng</th>
      <th scope="col" bgcolor="green">Tên sản phẩm</th>
      <th scope="col" bgcolor="green">Số lượng mua</th>
      <th scope="col" bgcolor="green">Giá</th>
      <th scope="col" bgcolor="green">Thành tiền</th>
      <th scope="col" bgcolor="green">Đã mua</th>
     
    </tr>
  </thead>
 
       		 <%-- <%for(lichsuMHbean ls:ds){%> --%>
       		 <%
                  int n=ds.size();
                  for(int i=0;i<n;i++) {
                    lichsuMHbean ls=ds.get(i);
                  %>
       			<tr>
       					<td bgcolor="orange"><%=ls.getuID()%> </td>
                             <td bgcolor="orange"> <%=ls.getUser()%> </td>
                            <td bgcolor="orange"> <%=ls.getNamesp()%> </td>
                             <td bgcolor="orange"><%=ls.getSoLuongMua()%> </td>
                            <td bgcolor="orange"> <%=ls.getGia()%> </td>
                             <td bgcolor="orange"><%=ls.getThanhTien()%> </td>
                             
                            <td bgcolor="orange">
                            <form action="xacnhandamuaController?id=<%=ls.getuID() %>&damua=<%=ls.getDamua() %>" method="post">
                            <%if (Long.parseLong(ls.getDamua())==0){%>
                            <input class="btn btn-primary" type="submit" name="xacnhan" value="Xác nhận">
                            <input class="btn btn-danger" type="submit" name="huy" value="Hủy">
                                  
                            <%}else {%>
                            <input class="btn btn-primary" type="submit" name="xacnhan" value="Đã xác nhận">
                            <!--   <input class="btn btn-danger " type="submit" name="huy" value="Hủy"> -->
                            <%} %>
                            </form>
    						 </td>
        					
        		</tr>
            <%}%>  
       		</table>
        </td>
        </tr>
        </table>  
        </table> 
</body>
</html>