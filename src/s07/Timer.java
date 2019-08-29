package s07;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s07/timer")//la servlet risponde a chiamata a s07/timer(indirizzo della risorsa associato al servlet da dare al server per ottenere la risposta) su cui viene fatta get o post
public class Timer extends HttpServlet {//servlet classe astratta che fa gestire le possibili connessioni al server 
    private static final long serialVersionUID = 1L;

    @Override//doget metodo che viene chiamato per rispondere alla get
    protected void doGet(HttpServletRequest request, HttpServletResponse response)//get prende due oggetti request(coi dati in cui mi ha passato l'utente) e response (in cui c'è la risposta)
            throws ServletException, IOException {
        response.setContentType("text/html");//che risposta intendo dare (file di testo che contiene html)
        response.setCharacterEncoding("utf-8");//al bw --> è html con caratteri utf-8
        try (PrintWriter writer = response.getWriter()) { // print writer-->quando voglio scrivere sui file
            writer.println("<!DOCTYPE html><html>");//qui dentro scrivo il codice html creato in java
            writer.println("<head><meta charset=\"utf-8\">");
            writer.println("<title>Hello Servlet</title></head>");
            writer.println("<body>");
            writer.println("<h1>" + LocalTime.now() + "</h1>");
            writer.println("<a href=\"..\">" + "back home" + "</a>");
            writer.println("</body></html>");
        }//essendo try with resources, viene chiuso automaticamente
    }

    @Override//la post delega alla doget di fare lo stesso della get se vogliamo che  facciano la stessa cosa
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}