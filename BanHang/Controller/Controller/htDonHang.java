package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Accountbean;
import bean.lichsuMHbean;
import bo.lichsuMHbo;

/**
 * Servlet implementation class htDonHang
 */
@WebServlet("/htDonHang")
public class htDonHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htDonHang() {
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
			lichsuMHbo lsbo= new lichsuMHbo();
			ArrayList<lichsuMHbean> dsls= new ArrayList<lichsuMHbean>();
			HttpSession session= request.getSession();
			
			 dsls=lsbo.getls();
			request.setAttribute("dsls", dsls);
			session.removeAttribute("gh");
			  RequestDispatcher rd= request.getRequestDispatcher("QLDonHang.jsp");
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
