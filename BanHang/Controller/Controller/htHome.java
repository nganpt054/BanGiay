package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Categorybean;
import bean.productbean;
import bo.Categorybo;
import bo.productbo;


/**
 * Servlet implementation class htHome
 */
@WebServlet("/htHome")
public class htHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htHome() {
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
			Categorybo lbo = new Categorybo();
			productbo gbo = new productbo();
		 	String ml= request.getParameter("ml");
		 	String key= request.getParameter("txtfind");
		 	ArrayList<Categorybean> dsloai=lbo.getloai();
		 	ArrayList<productbean> dsgiay=gbo.getgiay();
		    if(ml!=null) dsgiay= gbo.TimMaSach(dsgiay, ml);
		    else
		   		if(key!=null) dsgiay=gbo.Tim(dsgiay, key);
		    
		    request.setAttribute("dsloai", dsloai);
		    request.setAttribute("dsgiay", dsgiay);
		    RequestDispatcher rd= request.getRequestDispatcher("Home.jsp");
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
