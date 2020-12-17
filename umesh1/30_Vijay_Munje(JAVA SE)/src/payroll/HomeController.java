package payroll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class HomeController
 */
//@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HomeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Department dept = new Department();
		dept.setDeptid(101);
		dept.setName("Dac");
		dept.setSalary(4000);
		
		Department dep2 = new Department();
		dep2.setDeptid(101);
		dep2.setName("Dac");
		dep2.setSalary(4000);
		
		List<Department> department= new ArrayList<>();
		
		
		
		department.add(dept);
		department.add(dep2);
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>ServletWebApp</title></head>");
		out.println("<body>");
		out.printf("<h1>Welcome Visitor ");
		out.println("<table><tr>");
		out.println("<th>DeptId</th><th>DeptName</th><th>DeptSalary</th>");
		out.println("<tr>"+department.get(dept.getDeptid())+"</tr><tr></tr><th>DeptSalary</th>");
		out.println("</table></tr>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
