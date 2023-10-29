package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	{

		String name = request.getParameter("name");
		
		RequestDispatcher rd = request.getRequestDispatcher("second");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
	{
		
		String name = request.getParameter("name");
		
		RequestDispatcher rd = request.getRequestDispatcher("second");
		rd.forward(request, response);
	}

}
