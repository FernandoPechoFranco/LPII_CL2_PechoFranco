package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Crud.ClassCrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorServlet
 */
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServlet() {
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
		String nombre=request.getParameter("nombre");
		Double precioVen=Double.parseDouble(request.getParameter("venta"));
		Double precioCom=Double.parseDouble(request.getParameter("compra"));
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descripcion");
		TblProductocl2 tblprod=new TblProductocl2();
		ClassCrudProductoImp crud=new ClassCrudProductoImp();
		tblprod.setNombrecl2(nombre);
		tblprod.setPrecioVentacl2(precioVen);
		tblprod.setPreciocompcl2(precioCom);
		tblprod.setEstadocl2(estado);
		tblprod.setDescripcl2(descrip);
		crud.RegistrarProducto(tblprod);
		List<TblProductocl2> listadoprod=crud.ListadoProducto();
		request.setAttribute("listado",listadoprod);
		request.getRequestDispatcher("/Producto.jsp").forward(request, response);
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
