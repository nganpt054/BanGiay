package Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.Accountbean;
import bean.Categorybean;
import bean.productbean;
import bo.Categorybo;
import bo.productbo;

/**
 * Servlet implementation class addProduct
 */
@WebServlet("/addProduct")
public class addProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");
//			HttpSession session = request.getSession();
			
				//DiskFileItemFactory factory = new DiskFileItemFactory();
				DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
				productbo sanpham = new productbo();
				
				
				try {
					String name=null,title=null,description=null,maloai=null,anhupload=null,gia=null;
					
					
					
						List<FileItem> fileItems = upload.parseRequest(request);
				         for (FileItem fileItem : fileItems) {
				 			 if (!fileItem.isFormField()) {//Nếu ko phải các control=>upfile lên
								String nameimg = fileItem.getName();
								if (!nameimg.equals("")) {
									String dirUrl = request.getServletContext().getRealPath("") +  "image";
									File dir = new File(dirUrl);
									if (!dir.exists()) {//nếu ko có thư mục thì tạo ra
										dir.mkdir();
									}
								           String fileImg = dirUrl + File.separator + nameimg;
								           File file = new File(fileImg);//tạo file
								            try {
								               fileItem.write(file);// ghi file
								               anhupload =  "image/"+nameimg;
								              System.out.println(anhupload);
								 } catch (Exception e) {
								    e.printStackTrace();
								}
							}
						 }
							else
							{
								String tentk=fileItem.getFieldName();
								if(tentk.equals("txtname")) name = fileItem.getString("utf-8");
								if(tentk.equals("txttitle")) title = fileItem.getString("utf-8");
								if(tentk.equals("txtdescription")) description = fileItem.getString("utf-8");
								if(tentk.equals("catelory")) maloai = fileItem.getString("utf-8");;
								if(tentk.equals("txtprice")) gia = fileItem.getString("utf-8");
							}
				         }

					
						 //thêm
					     	 sanpham.getThemSach(name, anhupload, title, description, Long.parseLong(gia), maloai);
				} catch (Exception e) {
					e.printStackTrace();
				}
				RequestDispatcher rd = request.getRequestDispatcher("htSanPham");
				rd.forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
