<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<h2 align="center">Registrar Producto</h2>
<body bgcolor="#c5dec9">
<h1 align="center">
</h1>
<form method="post" action="ControladorServlet">
<table border="2" align="center">
<tr>
<td>Nombre producto</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>PrecioVen</td>
<td><input type="text" name="venta"></td>
</tr>
<tr>
<td>PrecioComp</td>
<td><input type="text" name="compra"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>
</table>
</form>
<h1 align="center">
Listado de Productos
</h1>
<table align="center" border="2">
<tr>
<th>Nombre</th>
<th>Precio Venta</th>
<th>Precio Compra</th>
<th>Estado</th>
<th>Descripcion</th>
</tr>
<% 
List<TblProductocl2> listado=(List<TblProductocl2>)request.getAttribute("listado");
if(listado!=null){
	for(TblProductocl2 tblprod:listado){
%>	
<tr>
<td><%=tblprod.getIdproductocl2()%>
</td><td><%=tblprod.getNombrecl2() %></td>
<td><%=tblprod.getPrecioVentacl2()%></td>
<td><%=tblprod.getPreciocompcl2() %></td>
<td><%=tblprod.getEstadocl2()%></td>
<td><%=tblprod.getDescripcl2() %></td>
</tr>
<%
	}
}
%>



</table>

</body>
</html>
