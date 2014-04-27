<%-- 
    Document   : EstadosAdmin
    Created on : 18-mar-2014, 14:25:21
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@include file="../inc/jstl.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Test</title>
        <%@include file="../inc/Header.jsp" %>
        <%@include file="../inc/scripts.jsp" %>
    </head>
    <body>
        <s:url id="propiedadURL" action="consultarPropiedadesJson"/>
        <div id="consultas">
            <s:if test="listaCatalogoFotos.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Ruta de Fotografia</th>
                        <th>Descripci&oacute;n</th>
                        <th>View Point</th>
                        <th>Propiedad</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaCatalogoFotos">
                        <tr>
                            <td>${idCatalogoFotos}</td>
                            <td>${rutaFotografia}</td>
                            <td>${descripcion}</td>
                            <td>${viewPoint}</td>
                            <td>${idPropiedad.idPropiedad} : ${idPropiedad.nombre}</td>
                            <td>
                                <a href="eliminarCatalogoFotos.action?idCatalogoFotos=${idCatalogoFotos}"> Eliminar </a> 
                                <a href="consultarCatalogoFotos.action?idCatalogoFotos=${idCatalogoFotos}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en CatalogoFotos.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Catalogo Fotos.</h1>
            <s:form action="guardarCatalogoFotos" method="post" name="" enctype="multipart/form-data">
                <s:textfield label="Descripción" name="catalogoFotos.descripcion" value=""/>
                <s:textfield label="View Point" name="catalogoFotos.viewpoint" value=""/>
                <s:file label="Seleccione un archivo" name="archivoCatalogoFotos"/>
                <sj:select 
                        href="%{propiedadURL}" 
                        id="propiedad" 
                        name="catalogoFotos.idPropiedad.idPropiedad" 
                        list="listaPropiedades" 
                        listKey="idPropiedad" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Propiedad"
                        label="Propiedad"
                        />
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        Imagen:<img src="<s:property value="archivoCatalogoFotosFileName"/>" alt=""/>
    </body>
</html>
