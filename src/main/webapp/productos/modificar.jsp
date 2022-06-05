
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/nuevo_style.css">
        <title>Modificar</title>
    </head>
    <body>
            <header><h1>Acutulizar</h1></header>
    <main>
        <section>
            <form action="ProductosController?accion=actulizar" method="POST" autocomplete="on" >
               
              <div>
                <input type="hidden" id="id" name="id" value="<c:out value="${producto.id}"/>" >
                
                <label for="">
                    <span>Codigo</span>
                    <input type="text" id="codigo" name="codigo" value="<c:out value="${producto.codigo}"/>"/>
                </label>
                    
                    
                <label for="">
                    <span>Nombre</span>
                    <input type="text" id="nombre" name="nombre"value="<c:out value="${producto.nombre}"/>" >
                </label>
                    
                    
                    
                <label for="">
                    <span>Precio</span>
                    <input type="text" id="precio" name="precio" value="<c:out value="${producto.precio}"/>" >
                </label>

                <label for="">
                    <span>Existencia</span>
                    <input type="number" id="existencia" name="existencia" value="<c:out value="${producto.existencia}"/>" >
                </label>
              </div>
                <div>
                    <button class="button-3" id="guradar" name="guradar" type="submit">guradar</button>
                </div>
            </form>
        </section>
    </main>

    </body>
</html>
