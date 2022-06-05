

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/nuevo_style.css">

        <title>Nuevo</title>
    </head>
    <body >
        
    <header><h1>Nuevo registro</h1></header>
    <main>
        <section>
            <form action="ProductosController?accion=insertar" method="POST" autocomplete="off">
                <div> <label for="">
                    <span>id</span>
                    <input type="number" id="id" name="id">
                </label>
                <label for="">
                    <span>Codigo</span>
                    <input type="text" id="codigo" name="codigo">
                </label>

                <label for="">
                    <span>Nombre</span>
                    <input type="text" id="nombre" name="nombre">
                </label>

                <label for="">
                    <span>Precio</span>
                    <input type="text" id="precio" name="precio">
                </label>

                <label for="">
                    <span>Existencia</span>
                    <input type="number" id="existencia" name="existencia">
                </label>
            </div>
                <div>
                    <button id="guradar" name="guradar" type="submit" class="button-3">guradar</button>
                </div>
            </form>
        </section>
    </main>

    </body>
</html>
