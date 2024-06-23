package Crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 tblprod) {
				EntityManagerFactory conex=Persistence.createEntityManagerFactory("SQLPechoFranco");
						EntityManager entitymanag=conex.createEntityManager();
						entitymanag.getTransaction().begin();
						//registramos datos...
						entitymanag.persist(tblprod);
						//confirmamos 
						entitymanag.getTransaction().commit();
						//cerramos
						entitymanag.close();	
		
	}
	@Override
	public List<TblProductocl2> ListadoProducto() {
		//establecemos conexion con la unidad de persistencia...
				EntityManagerFactory conex=Persistence.createEntityManagerFactory("SQLPechoFranco");
				//manejador de entidades segun unidad de persistencia...
				EntityManager entitymanag=conex.createEntityManager();
				//realizamos el proceso...
				  //iniciar transaccion...
				entitymanag.getTransaction().begin();
				
				//aplicamos JPQL  se base en entidades...
		        List<TblProductocl2> listado=entitymanag.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();
				//confirmamos
				entitymanag.getTransaction().commit();
				//cerramos
				entitymanag.close();
		       //retornamos el listado
		         return listado;
	}
	@Override
	public void ActualizarProducto(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void EliminarProducto(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TblProductocl2 BuscarProductoCodigo(TblProductocl2 tblprod) {
		// TODO Auto-generated method stub
		return null;
	}


}
