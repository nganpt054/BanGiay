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
import bo.productbo;

/**
 * Servlet implementation class giohang
 */
@WebServlet("/giohang")
public class giohang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giohang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session= request.getSession();
			String idsp=request.getParameter("idsp");
			String name=request.getParameter("name");
			String price=request.getParameter("price");
			String image=request.getParameter("image");
			productbo pload= new productbo();

			
			// Náº¿u ngÆ°á»�i dÃ¹ng mua láº§n Ä‘áº§u tiÃªn
				giohangbo gh=null;
				if(session.getAttribute("gh")==null){
					gh=new giohangbo();
					session.setAttribute("gh", gh);
				}
				
				if (name!=null)
				{
					//b1: gÃ¡n sesion vÃ o biáº¿n
					gh=(giohangbo) session.getAttribute("gh");
					gh.Them(idsp,name, Long.parseLong(price), (long)1,image);// thay Ä‘á»•i biáº¿n
					session.setAttribute("gh", gh);// luu biáº¿n vÃ o session
				}
				
				
				//request.setAttribute("gh", gh);
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
