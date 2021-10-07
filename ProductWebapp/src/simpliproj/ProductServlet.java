package simpliproj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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
		PrintWriter out = response.getWriter();
		String id =request.getParameter("ID");
		out.print("<h1>Display the Record</h1>");
		out.print("<table border ='1'><tr><th>PID</th><th>ProductName</th><th>PBrand</th><th>PPrice</th></tr>");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "sqlsam81");
			Statement St = con.createStatement();
			ResultSet rs= St.executeQuery("Select * from ProductDetails where PID="+id+"");
			while(rs.next())
			{
				out.print("<tr><td>");
				out.print(rs.getInt(1));
				out.print("<td>");
				//out.print("<td>");
				out.print(rs.getString(2));
				out.print("<td>");
				//out.print("<td>");
				out.print(rs.getString(3));
				out.print("<td>");
				//out.print("<td>");
				out.print(rs.getInt(4));
				out.print("</td>");
				out.print("</tr>");		
			}				
		}
		catch(Exception e) {
			System.out.println(e);
		}
		out.print("</table>");
		}
	}


