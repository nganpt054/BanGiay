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
 * Servlet implementation class loadEdit
 */
@WebServlet("/loadEdit")
public class loadEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loadEdit() {
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
				String pid= request.getParameter("pid");
			Categorybo lbo = new Categorybo();
			productbo pbo=new productbo();
			ArrayList<Categorybean> dsloai=lbo.getloai();
			productbean pList=pbo.loadSp(pid);
			request.setAttribute("dsloai", dsloai);
			request.setAttribute("pList",pList );
			
			 RequestDispatcher rd= request.getRequestDispatcher("editSP.jsp");
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
