<%-- 
    Document   : PagosAdmin
    Created on : 18-mar-2014, 17:49:37
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@include file="jstl.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Struts</title>
        <link type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="<%=request.getContextPath()%>/js/jquery-1.10.2.js" rel="stylesheet">
    </head>
    <body>

        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div id="consultas">
                        <st:if test="pagoLista.size>0">
                            <table class="table table-hover">
                                <tr>
                                    <th>ID</th>
                                    <th>Descripcion</th>
                                    <th>Monto</th>
                                    <th>Acciones</th>
                                </tr>
                                <st:iterator value="pagoLista">
                                    <tr>
                                        <th>${idPago}</th>
                                        <th>${descripcion}</th>
                                        <th>${monto}</th>
                                        <th>
                                            <a id="eliminar"   href="eliminarPago.action?idPago=${idPago}"> Eliminar </a> 
                                            <a id="editar" href="consultaPago.action?idPago=${idPago}" onclick="$('#altas').hide('slow');"> Editar </a>
                                        </th>
                                    </tr>
                                </st:iterator>
                            </table>
                        </st:if>
                        <st:else>
                            <!--<h1>No hay datos en Pagos.</h1>-->
                        </st:else>
                    </div>
                </div>
            </div>
            <div class="row clearfix">
                <div class="col-md-6 column">
                    <div id="altas">
                        <h1 class="h1">Alta de Pagos.</h1>
                        <st:form action="guardarPago" method="post" name="" theme="simple">
                            <label>Descripcion</label>
                            <st:textfield  name="pagoObj.descripcion"/>
                            <label>Monto</label>
                            <st:textfield  name="pagoObj.monto"/>
                            <st:submit value="Guardar"/>
                        </st:form>
                    </div>
                </div>
                <div class="col-md-6 column">
                    <div id="modificaciones">
                        <h1>Editar Pago.</h1>
                        <st:form class="form" action="editarPago" method="post" name="" theme="simple">
                            <st:hidden name="pagoObj.idPago" value="%{pagoObj.idPago}"/>
                            <div class="form-group">
                                <label>Descripcion</label>
                                <st:textfield name="pagoObj.descripcion" value="%{pagoObj.descripcion}"/>
                            </div>
                            <div class="form-group">
                                <label>Monto</label>
                                <st:textfield name="pagoObj.monto" value="%{pagoObj.monto}"/>
                                <st:hidden name="pagoObj.status" value="%{pagoObj.status}"/>
                            </div>
                                <st:submit class="btn btn-primary" value="Actualizar" onclick="$('#altas').hide('slow');"/>
                        </st:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
