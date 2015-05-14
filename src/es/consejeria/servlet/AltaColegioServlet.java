package es.consejeria.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltaColegioServlet
 */
@WebServlet("/AltaColegio")
public class AltaColegioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaColegioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String nombre = request.getParameter("nombre");// el valor entre comillas
         // corresponde al name del input
        String direccion = request.getParameter("direccion");
        System.out.println(request.getParameter("numAulas"));
        int numAulas = Integer.parseInt(request.getParameter("numAulas"));

      int numAlumnos=Integer.parseInt(request.getParameter("numAlumnos"));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String nombre = request.getParameter("nombre");// el valor entre comillas
         // corresponde al name del input
        String direccion = request.getParameter("direccion");
        System.out.println(request.getParameter("numAulas"));
       int numAulas = Integer.parseInt(request.getParameter("numAulas"));

        int numAlumnos=Integer.parseInt(request.getParameter("numAlumnos"));
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
