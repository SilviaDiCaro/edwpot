package s13;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dd.Document;
import dd.User;

@WebServlet("/s13/fetch")
public class Fetcher extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("doc", new Document("JSP Cheatsheet", new User("Tom", 42)));//genera l'oggetto doc, lo metto nella req e passa il tutto alla jsp

        RequestDispatcher rd = request.getRequestDispatcher("/s13/fetch.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
