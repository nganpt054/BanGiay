<%@page import="bean.productbean"%>
<%@page import="bean.Categorybean"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
         
       
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
</head>

<body>
 <%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	ArrayList<Categorybean> dsloai =(ArrayList<Categorybean>)request.getAttribute("dsloai");
   	productbean pList=(productbean)request.getAttribute("pList");
 %>
	 <!-- Edit Modal HTML -->
        
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editProduct?ID=<%=pList.getId() %>" enctype="multipart/form-data" method="post">
                    
                         <div class="modal-body">	
                        
                         	 <div class="form-group" >
                                <label>ID</label>
                                <input name="ID" type="text" class="form-control" required value="<%=pList.getId() %>" readonly>
                            </div>				
                            <div class="form-group">
                                <label>Name</label>
                                <input name="txtname" type="text" class="form-control" required value="<%=pList.getName() %>">
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input type="file" name="file" size="60" value="<%=pList.getImage() %>">
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="txtprice" type="text" class="form-control" required value="<%=pList.getPrice() %>">
                            </div>
                            <div class="form-group">
                                <label>Title</label>
                                <textarea name="txttitle" class="form-control" required><%=pList.getTitle() %></textarea>
                            </div>
                            <div class="form-group">
                                <label>Description</label>
                                <textarea name="txtdescription" class="form-control" required><%=pList.getDescription() %></textarea>
                            </div>
                      
                            <div class="form-group">
                                <label>Category</label>
                                <select name="category" class="form-select" aria-label="Default select example">
                                    <c:forEach items="${dsloai}" var="o">
                                        <option value="${o.getCid()}">${o.getCname()}</option>
                                    </c:forEach>
                                </select>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <a href="htSanPham"><input type="button" class="btn btn-default"  value="Cancel"></a>
                            <input type="submit" class="btn btn-success" value="Edit">
                        </div>
                    </form>
                </div>
            </div>
      
</body>
</html>