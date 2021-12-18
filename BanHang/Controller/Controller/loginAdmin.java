package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Accountbean;
import bo.Accountbo;

/**
 * Servlet implementation class loginAdmin
 */
@WebServlet("/loginAdmin")
public class loginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session= request.getSession();
			Accountbo acbo=new Accountbo();
			
		   	String un=request.getParameter("user");
		   	String pass=request.getParameter("pass");
		    Accountbean ac=acbo.ktdn(un, pass);
		   	if(ac!=null&&ac.getIsAdmin()==1){
		   		session.setAttribute("dn", ac);
		   			   session.setAttribute("kt", (long)1);
		   			  
		   		   }else{
		   			   
		   			   session.setAttribute("kt", (long)0);
		   		   }
		   	RequestDispatcher rd= request.getRequestDispatcher("htAdmin");
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
