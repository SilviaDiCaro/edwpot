package s09;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s09/greeter")
public class Vinili extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        LocalTime start = (LocalTime) session.getAttribute("start"); //getAttribute per vedere se c'è start
        Duration duration; //durata, package javatime
        if (start == null) {
            duration = Duration.ZERO; //inizializzo durata a 0.classe Duration.proprietà pubblica della classe (è final, costante che rappresenta la durata zero)
            session.setAttribute("start", LocalTime.now());//se start è null, è la prima volta che lo cerco e faccio una setAttribute start a cui associo un localtime.now, se c'è la uso.
        } else {//se start non c'è, lo crea e lo mette
            duration = Duration.between(start, LocalTime.now());//metodo between tra start (che è la mia local time) e now (trova l'arco temporale)
        }
//done è nell'index
        if (request.getParameter("done") != null) {//chiamo il metodo getparameter. se il chiamante ha specificato il parametro "done", verifico se è diverso da null 
            session.invalidate();//termino la sessione

            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");
            try (PrintWriter writer = response.getWriter()) {
                writer.println("<!DOCTYPE html><html>");
                writer.println("<head><meta charset=\"utf-8\">");
                writer.println("<title>So long</title></head>");
                writer.println("<body><h1>Goodbye</h1>");
                writer.println("<p>You worked on this stuff for " + duration.getSeconds() + " seconds</p>");
                writer.println("</body></html>");
            }
            
        } else {

        request.setAttribute("duration", duration);//prendo duration la metto in request come attributo
        RequestDispatcher rd = request.getRequestDispatcher("/s09/greeter.jsp");//passo il controllo a un'altra servlet s09/greeter.jsp
        rd.forward(request, response);
    }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

//
//
//LocalTime st;
//Object o = session.getAttribute("start");
//if(o instanceof LocalTime) {
//	st = (LocalTime)o;
//}else
//}

