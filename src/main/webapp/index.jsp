

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Joan&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./styles/index_Style.css">
        <title>productos</title>
        
    </head>
    <body>
        
    <header>
        <h1>Productos</h1>
    </header>
    <main>
        <section>
            <a class="a " href="ProductosController?accion=nuevo">Nuevo ingreso</a>
            <table>
                <thead>
                <tr class="title">
                    <td >id</td>
                    <td  >Codigo</td>
                    <td  >Nombre</td>
                    <td  >Precio</td>
                    <td  >Existencia</td>
                    <td class="boton"></td>
                    <td class="boton"></td>
                </tr>
                </thead>
                <tbody >
                    <c:forEach var="producto" items="${lista}" >
                        <tr class="title">
                            <td><c:out value="${producto.id}" /></td>
                            <td><c:out value="${producto.codigo}" /></td>
                            <td><c:out value="${producto.nombre}" /></td>
                            <td><c:out value="${producto.precio}" /></td>
                            <td><c:out value="${producto.existencia}" /></td>
                            <td class="boton"><a href="ProductosController?accion=modificar&id=<c:out value="${producto.id}" /> "> modificar</a></td>
                            <td class="boton"><a href="ProductosController?accion=eliminar&&id=<c:out value="${producto.id}"/> ">eliminar</a></td>
                            
                            
                        </tr>
                    </c:forEach> 
                </tbody>
            </table>
        </section>
    </main>

    </body>
</html>
