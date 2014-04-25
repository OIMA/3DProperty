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
    </head>
    <body>
        <div id="consultas">
            <s:if test="listaEstado.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Pais</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaEstado">
                        <tr>
                            <td>${idEstado}</td>
                            <td>${nombre}</td>
                            <td>${idPais.nombre}</td>
                            <td>
                                <a href="eliminarEstado.action?idEstado=${idEstado}"> Eliminar </a> 
                                <a href="consultarEstado.action?idEstado=${idEstado}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Estado.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Estados.</h1>
            <s:if test="listaPais.size>0">
                <s:form action="guardarEstado" method="post" name="">
                    <s:textfield label="Nombre" name="estado.nombre" value=""/>
                    <s:select 
                        name="estado.idPais.idPais" 
                        list="listaPais"
                        listKey="%{idPais}"
                        listValue="%{nombre}"
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testPais.action">Paises</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar Estado.</h1>
            <s:if test="listaPais.size>0">    
                <s:form action="editarEstado" method="post" name="">
                    <s:hidden name="estado.idEstado" value="%{estado.idEstado}"/>
                    <s:textfield label="Nombre" name="estado.nombre" value="%{estado.nombre}"/>
                    <s:select 
                        name="estado.idPais.idPais" 
                        list="listaPais"
                        listKey="%{idPais}"
                        listValue="%{nombre}"
                        value="%{estado.idPais.idPais}"
                        />
                    <s:hidden name="estado.status" value="%{estado.status}"/>
                    <s:submit value="Actualizar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testPais.action">Paises</a>.
            </s:else>
        </div>
    </body>
</html>
