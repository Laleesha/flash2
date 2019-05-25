package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
			String Password=request.getParameter("password");
			String User_Name=request.getParameter("uname");
			String dbname=null;
			String dbpassword=null;
			String sql="select * from register where User_Name=? and Password=?";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","");
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, User_Name);
			ps.setString(2,Password);
			
		    ResultSet rp= ps.executeQuery();
		    while(rp.next()) {
		    	dbname=rp.getString(4);
		    	dbpassword=rp.getString(5);
		    	
		    }
		    if(User_Name.equals(dbname)&&Password.equals(dbpassword)) {
		    	System.out.println("login Success");
		    	RequestDispatcher rs = request.getRequestDispatcher("userI.jsp"); 
		    	rs.forward(request, response);
		    }
		    else {
		    	
		    	
		    }
						
			
		} 
		
		catch (Exception e) {
			System.out.println("Error: " + e);
		}
		doGet(request, response); 
	}

}
