package s09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s09/vinili")
public class Vinili extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session = request.getSession();
 
           {  
             response.setContentType("text/html"); 
             PrintWriter pwriter=response.getWriter(); 

             String name = request.getParameter("uname");
             String age = request.getParameter("uage");
             pwriter.println("Name: "+name); 
             pwriter.println("Age: "+age); 
             pwriter.close(); 
          }
    }
}
