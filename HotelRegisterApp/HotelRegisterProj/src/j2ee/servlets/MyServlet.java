package j2ee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
   
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
       
        String userName = request.getParameter("Name");
        String email = request.getParameter("Email");
        
        String[] countries = request.getParameterValues("Country");

        
       
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>MyServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("<h1>"+userName+"</h1>");
        out.println("<h1>"+email+"</h1>");
        
        for(String str : countries){
            
            out.println("<h1>"+str+"</h1>");
        }
        
        out.println("</body></html>");
        out.close();
        
        response.sendRedirect("pages/Destination.html");
    }
}
