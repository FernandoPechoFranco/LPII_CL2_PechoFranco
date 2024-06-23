package Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.TblProductocl2;

public class TestProductoCL2 {

	public static void main(String[] args) {
			EntityManagerFactory conex=Persistence.createEntityManagerFactory("SQLPechoFranco");
			EntityManager emanager=conex.createEntityManager();
			emanager.getTransaction().begin();
			TblProductocl2 prod=new TblProductocl2();	
			String accion=JOptionPane.showInputDialog("Ingrese la Accion");
			switch(accion){
			
			case "Registrar":
				prod.setNombrecl2("pan");
				prod.setPrecioVentacl2(5.10);
				prod.setPreciocompcl2(10.10);
				prod.setEstadocl2("bueno");
				prod.setDescripcl2("frances");					
				emanager.persist(prod);
				System.out.println("Datos registrados en la BD");
				//confirmamos
				emanager.getTransaction().commit();
				//cerramos la transaccion..
				emanager.close();
				//salimos
				break;
				
			case "Listar":							
			List<TblProductocl2> listado=emanager.createQuery("select a from TblProducto a",TblProductocl2.class).getResultList();
			for(TblProductocl2 lis:listado){
				System.out.println("codigo "+lis.getIdproductocl2()+" nombre"+
				lis.getNombrecl2()+" precioVEN "+lis.getPrecioVentacl2()+" precioCOM "+lis.getPreciocompcl2()+
				" Estado "+lis.getEstadocl2()+" Descripcion "+lis.getDescripcl2());
			}   //fin del bucle for...
			 
		     //confirmamos
			emanager.getTransaction().commit();
			//cerramos 
			emanager.close();
			//salimos
			break;
	}
	}
}


