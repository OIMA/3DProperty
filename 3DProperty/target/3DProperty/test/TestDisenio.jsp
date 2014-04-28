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
            <s:if test="listaDisenio.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Ruta</th>
                        <th>Skybox</th>
                        <th>View Point</th>
                        <th>No. de Visitas</th>
                        <th>Propiedad</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaDisenio">
                        <tr>
                            <td>${idDisenio}</td>
                            <td>${ruta}</td>
                            <td>${skybox}</td>
                            <td>${viewPoint}</td>
                            <td>${noVisitas}</td>
                            <td>${idPropiedad.idPropiedad} : ${idPropiedad.nombre}</td>
                            <td>
                                <a href="eliminarDisenio.action?idDisenio=${idDisenio}"> Eliminar </a> 
                                <a href="consultarDisenio.action?idDisenio=${idDisenio}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Disenio.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Catalogo Fotos.</h1>
            <s:form action="guardarDisenio" method="post" name="" enctype="multipart/form-data">
                <s:textfield label="Skybox" name="disenio.skybox" value=""/>
                <s:textfield label="View Point" name="disenio.viewpoint" value=""/>
                <s:file label="Seleccione un archivo" name="archivoDisenio"/>
                <sj:select 
                        href="%{propiedadURL}" 
                        id="propiedad" 
                        name="disenio.idPropiedad.idPropiedad" 
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
        Imagen:<img src="<s:property value="archivoDisenioFileName"/>" alt=""/>
    </body>
</html>
