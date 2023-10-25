package p1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteRegistration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	 {

		System.out.println("get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		String email = request.getParameter("email");

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/july_batch_12","root","test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("Delete from registration WHERE email='"+email+"'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
