<%-- 
    Document   : Registro
    Created on : Apr 6, 2014, 6:49:09 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <%@include file="../../inc/jstl.jsp" %>
        <sb:head includeStyles="false" />

        <%@include file="../../inc/Header.jsp" %>

    </head>
    <body>
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <!--                        <h1>
                                                    Favor de llenar el registro completo
                                                </h1>-->
                        <div class="row clearfix">
                            <s:form theme="bootstrap" class="form-horizontal" role="form" action="Registro.action" method="post">
                                <div class="col-md-offset-1 col-md-3 column">
                                    <h2>Datos personales</h2>
                                    <s:textfield label="Nombre de usuario *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Contrasenia *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Nombre(s) *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Apellido Paterno *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Apellido Materno *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Fecha de Nacimiento *" cssClass="form-control"/> <br/>
                                    <s:textfield label="CURP" cssClass="form-control"/> <br/>
                                    <s:textfield label="RFC" cssClass="form-control"/> <br/>
                                </div>
                                <div class="col-md-offset-1 col-md-3 column">
                                    <h2>Domicilio</h2>
                                    <s:select label="Pais *" 
                                              list="listaPaises"
                                              listKey="%{id}"
                                              listValue="%{nombre}"
                                              headerKey="0"
                                              headerValue="Selecciona un pais"
                                              cssClass="form-control"
                                              /> <br/>
                                    <s:textfield label="Estado *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Municipio *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Colonia *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Calle *" cssClass="form-control"/> <br/>
                                    <s:textfield label="No. Exterior *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Numero Interior" cssClass="form-control"/> <br/>
                                </div>
                                <div class="col-md-offset-1 col-md-2 column">
                                    <h2>Contacto</h2>
                                    <s:textfield label="Telefono Fijo *" cssClass="form-control"/> <br/>
                                    <s:textfield label="Telefono Movil *" cssClass="form-control"/> <br/>
                                    <s:hidden name="" value="0"/>
                                    <s:textfield label="E-Mail *" cssClass="form-control"/> <br/>
                                    <div class="form-group">
                                        <button class="btn btn-block btn-lg btn-success disabled" type="submit" ><span class="glyphicon glyphicon-save"></span> Guardar</button>
                                        <button class="btn btn-block btn-xs btn-danger" type="button" ><span class="glyphicon glyphicon-remove"></span> Cancelar</button>
                                    </div>
                                </div>
                            </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
d64y3hw