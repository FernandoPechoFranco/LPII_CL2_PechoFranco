package Test;

import java.util.List;

import Crud.ClassCrudProductoImp;
import model.TblProductocl2;

public class Test {

	public static void main(String[] args) {
				TblProductocl2 tblprod=new TblProductocl2();
				ClassCrudProductoImp crud=new ClassCrudProductoImp();
				
				tblprod.setNombrecl2("Pan");
				tblprod.setPrecioVentacl2(5.60);
				tblprod.setPreciocompcl2(30.50);
				tblprod.setEstadocl2("vigente");
				tblprod.setDescripcl2("laive");
				//invocamos al metodo 
				crud.RegistrarProducto(tblprod);
				//mensaje 
				System.out.println("dato registado");
				
				
				List<TblProductocl2> listar=crud.ListadoProducto();
					for(TblProductocl2 lis:listar){
						
						//imprimimos por pantalla
						System.out.println(" codigo "+lis.getIdproductocl2()+" nombre "+lis.getNombrecl2()+" precio "
						+lis.getPrecioVentacl2()+" descripcion "+lis.getPreciocompcl2()+" estado "+lis.getEstadocl2()+" fechaven "+lis.getDescripcl2());
									
					}
					
	}
}
