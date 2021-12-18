package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giohangbo;

/**
 * Servlet implementation class capnhat
 */
@WebServlet("/capnhat")
public class capnhat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public capnhat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session= request.getSession();
			
			giohangbo gh = new giohangbo();
			String soluong=request.getParameter("soluong");
			String idsp=request.getParameter("idsp");


			if (idsp!=null)
			{
				if (request.getParameter("butcapnhat")!=null){
				//b1: gán sesion vào biến
				gh=(giohangbo) session.getAttribute("gh");
				gh.SuaSoluong(idsp,Long.parseLong(soluong) );
				session.setAttribute("gh", gh);
				}
				if (request.getParameter("butxoa")!=null){
					//b1: gán sesion vào biến
					gh=(giohangbo) session.getAttribute("gh");
					gh.xoa(idsp);
					session.setAttribute("gh", gh);
				}
			}
			//Hien thi gio
			// response.sendRedirect("htgio.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("Cart.jsp");
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
