package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Accountbean;
import bo.Accountbo;


/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8"); 
		try {
			  
			  	String user=request.getParameter("user");
				String pass=request.getParameter("pass");
				String repass=request.getParameter("repass");
				Accountbo kh=new Accountbo();
				Accountbean checkkh=kh.ktkh(user);
				if (checkkh==null) {
					kh.getkh(user, pass);
					request.setAttribute("user", user);
				    request.setAttribute("pass", pass);
					RequestDispatcher rd= request.getRequestDispatcher("login");
				    rd.forward(request, response);
				}
				else {
					
					RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
				    rd.forward(request, response);
				}
				
				
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
