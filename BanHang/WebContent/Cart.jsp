<%-- 
    Document   : Cart
    Created on : Oct 31, 2020, 9:42:21 PM
    Author     : trinh
--%>

<%@page import="bo.productbo"%>
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	 <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body >
        <% giohangbo gh1;
             productbo pload;
if(session.getAttribute("gh")!=null){
	gh1=(giohangbo) session.getAttribute("gh");%>
            <div class="shopping-cart">
                <div class="px-4 px-lg-0">

                    <div class="pb-5">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-12 p-5 bg-white rounded shadow-sm mb-5">

                                    <!-- Shopping cart table -->
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="border-0 bg-light">
                                                        <div class="p-2 px-3 text-uppercase" style="">Sản Phẩm</div>
                                                    </th>
                                                    <th scope="col" class="border-0 bg-light">
                                                        <div class="py-2 text-uppercase">Đơn Giá</div>
                                                    </th>
                                                    <th scope="col" class="border-0 bg-light">
                                                        <div class="py-2 text-uppercase">Số Lượng</div>
                                                    </th>
                                                    <th scope="col" class="border-0 bg-light">
                                                        <div class="py-2 text-uppercase">Thành tiền</div>
                                                    </th>
                                                    
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <%--  <c:forEach items="${sessionScope.gh}" var="o">  --%>
                                            <% for(giohangbean g1: gh1.ds) {%>
                                                <tr>
                                                    <th scope="row">
                                                        <div class="p-2">
                                                            <img src="<%=g1.getImage() %>" alt="" width="70" class="img-fluid rounded shadow-sm">
                                                            <div class="ml-3 d-inline-block align-middle">
                                                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block"><%=g1.getNamesp() %></a></h5><span class="text-muted font-weight-normal font-italic"></span>
                                                            </div>
                                                        </div>
                                                    </th>
                                                    <td class="align-middle"><strong><%=g1.getDongia() %></strong></td>
                                                    
                                                    <td class="align-middle">
                                                     <form action="capnhat " method="post">
                                                    
                                                    <input type="number" min="1"  name="soluong" value="<%=g1.getSlmua()%>" style="width:50px;">
                                                 			<input type="hidden" name="idsp" value="<%=g1.getIdsp()%>">	
                                                           <input type="submit" name ="butcapnhat" value="Cập nhật">
															<input type="submit" name="butxoa" value="Trả lại"> 
                                                       
                                                        
                                                  
                                                        
														 </form> 
                                                    </td>
                                                    
                                                    <td class="align-middle"><a href="#" class="text-dark">
                                                            <strong><%=g1.getThanhtien() %></strong>
                                                        </a>
                                                    </td>
                                                   
                                                </tr> 
                                             <%-- </c:forEach>  --%>
                                              <% }%>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- End -->
                            </div>
                        </div>
                       	
						
                        <div class="row py-5 p-4 bg-white rounded shadow-sm">
                        	<div class="col-lg-6">
                                <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Lựa chọn khác</div>
                                <div class="p-4">
                                   <a href="xoagiohang.jsp"><button class="btn btn-primary">Xóa tất cả</button></a>
									<a href="htHome"><button class="btn">Tiếp tục mua hàng</button></a>
									
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Voucher</div>
                                <div class="p-4">
                                    <div class="input-group mb-4 border rounded-pill p-2">
                                        <input type="text" placeholder="Nhập Voucher" aria-describedby="button-addon3" class="form-control border-0">
                                        <div class="input-group-append border-0">
                                            <button id="button-addon3" type="button" class="btn btn-dark px-4 rounded-pill"><i class="fa fa-gift mr-2"></i>Sử dụng</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            
                            <div class="col-lg-6">
                                <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Thành tiền</div>
                                <div class="p-4">
                                    <ul class="list-unstyled mb-4">
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng tiền hàng</strong><strong><%=gh1.TongTien() %></strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Phí vận chuyển</strong><strong>Free ship</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom" ><strong class="text-muted">VAT</strong><strong>10000 $</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng thanh toán</strong>
                                            <h5 class="font-weight-bold"><%=gh1.TongTien()+10000 %></h5>
                                        </li>
                                    </ul><a href="datmuaController" class="btn btn-dark rounded-pill py-2 btn-block">Mua hàng</a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
     
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
           <% } %>
    </body>

</html>

