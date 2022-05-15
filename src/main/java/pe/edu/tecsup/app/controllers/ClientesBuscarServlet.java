package pe.edu.tecsup.app.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.tecsup.app.models.Cliente;

/**
 * Servlet implementation class ClientesBuscarServlet
 */
@WebServlet("/ClientesBuscarServlet")
public class ClientesBuscarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientesBuscarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String criterio = request.getParameter("txtNombres");
		System.out.println("Dentro de ClientesBuscarServlet: " + criterio);
		
		Cliente c1 = new Cliente();
		c1.setCodigo(11);
		c1.setNombres("David");
		c1.setPaterno("Rodriguez");
		c1.setMaterno("Condezo");
		
		Cliente c2 = new Cliente();
		c2.setCodigo(12);
		c2.setNombres(criterio);
		c2.setPaterno("Perez");
		c2.setMaterno("Quispe");
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		
		// Guardando datos en el scope REQUEST , SESSION , APPLICATION
		// para pasarselo al JSP
		//                   <<  Key >> <<Value>>
		request.setAttribute("clientes", clientes);
		
		// Envia la salida al jsp: Clientes_buscar.jsp
		RequestDispatcher rd = request.getRequestDispatcher("clientes_buscar.jsp");
		
		//Hacer el forward
		rd.forward(request, response);
	}

}
