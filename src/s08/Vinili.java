package s08;

import java.io.IOException;
//import java.util.Set;
//import java.util.TreeSet;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s08/Vinili")//la servlet risponde a chiamata all'indirizzo s08/checker su cui viene fatta get o post
public class Vinili extends HttpServlet {//httpservlet classe astratta che fa gestire le possibili connessioni al server. Servlet mi fa pensare che lavoro su EE
    private static final long serialVersionUID = 1L;

    @Override//doget metodo che viene chiamato per rispondere alla get
    protected void doGet(HttpServletRequest request, HttpServletResponse response)//get prende due oggetti request(coi dati in cui mi ha passato l'utente) e response (in cui c'è la risposta che diamo noi)
            throws ServletException, IOException {
    	
    	String Muse = request.getParameter("vinile1"); //l'utente passa i parametri
    	String RHCP = request.getParameter("vinile2"); 
    	String Mika = request.getParameter("vinile3"); 
    	String Beatles = request.getParameter("vinile4"); 
    	String RollingStones = request.getParameter("vinile5");
    	

    	response.getWriter().println("<html>"); 
    	response.getWriter().println("<head>"); 
    	response.getWriter().println("<title>My Band</title>"); 
    	response.getWriter().println("</head>"); 
    	response.getWriter().println("<body>"); 
    	response.getWriter().println("Numero Vinili Muse: " + Muse); 
    	response.getWriter().println("<br>"); 
    	response.getWriter().println("Numero Vinili RHCP: " + RHCP); 
    	response.getWriter().println("<br>"); 
    	response.getWriter().println("Numero Vinili Mika: " + Mika); 
    	response.getWriter().println("<br>"); 
    	response.getWriter().println("Numero Vinili Beatles: " + Beatles); 
    	response.getWriter().println("<br>"); 
    	response.getWriter().println("Numero Vinili Rolling Stones: " + RollingStones); 
    	response.getWriter().println("</body>"); 
     
    	
//       RequestDispatcher rd = request.getRequestDispatcher("/s08/vinili.jsp");//passo alla jsp che pensa a generare html
//       rd.forward(request, response);
    }

    @Override//la post delega alla doget di fare lo stesso della get se vogliamo che  facciano la stessa cosa
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
//<form acrion =/edwpot....
//<%Integer total = (Integer) request.getAttribute("total");
//if(total != null && total != 0) {
//	out.print("hai ordinato" + total)}%>
//}




//servlet che si aspetta il parametro user. leggo il parametro
//leggo lo user, lo passo al tree set e metto il risultato come attributo alla request.
//chiamo dispatcher per passare il lavoro alla jsp
//logica nella parte server
//visualizzazione request response alla jsp
//jsp in realtà è un'altra servlet (alla servlet noi comunichiamo tramite request-response)

//http://localhost:8082/edwpot/s08/checker?user=paperino
//The user name contains these letters: a e i n o p r