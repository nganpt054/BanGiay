package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Accountbean;
import bean.Categorybean;
import bo.Accountbo;
import bo.Categorybo;

/**
 * Servlet implementation class adminLoai
 */
@WebServlet("/adminLoai")
public class adminLoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoai() {
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
			Categorybo cbo = new Categorybo();
			
		 	ArrayList<Categorybean> dsloai=cbo.getloai();
			
		    request.setAttribute("dsloai", dsloai);
		   
		    RequestDispatcher rd= request.getRequestDispatcher("adminLoai.jsp");
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
