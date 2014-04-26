<%-- 
    Document   : ColoniasAdmin
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
    </head>
    <body>
        <div id="consultas">
            <s:if test="listaColonia.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Número</th>
                        <th>Codigo Postal</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaColonia">
                        <tr>
                            <td>${idColonia}</td>
                            <td>${nombre}</td>
                            <td>${idCodigoPostal.numero}</td>
                            <td>
                                <a href="eliminarColonia.action?idColonia=${idColonia}"> Eliminar </a> 
                                <a href="consultarColonia.action?idColonia=${idColonia}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Colonia.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Colonias.</h1>
            <s:if test="listaCodigoPostal.size>0">
                <s:form action="guardarColonia" method="post" name="">
                    <s:textfield label="Nombre" name="colonia.nombre" value=""/>
                    <s:select 
                        name="colonia.idCodigoPostal.idCodigoPostal" 
                        list="listaCodigoPostal"
                        listKey="%{idCodigoPostal}"
                        listValue="%{numero}"
                        label="Codigo Postal"
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testCodigoPostal.action">Codigos Postales</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar Codigo Postal.</h1>
            <s:if test="listaCodigoPostal.size>0">    
                <s:form action="editarColonia" method="post" name="">
                    <s:hidden name="colonia.idColonia" value="%{colonia.idColonia}"/>
                    <s:textfield label="Nombre" name="colonia.nombre" value="%{colonia.nombre}"/>
                    <s:select 
                        name="colonia.idCodigoPostal.idCodigoPostal" 
                        list="listaCodigoPostal"
                        listKey="%{idCodigoPostal}"
                        listValue="%{numero}"
                        value="%{colonia.idCodigoPostal.idCodigoPostal}"
                        label="Codigo Postal"
                        />
                    <s:hidden name="colonia.status" value="%{colonia.status}"/>
                    <s:submit value="Actualizar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testCodigoPostal.action">Codigos Postales</a>.
            </s:else>
        </div>
    </body>
</html>
