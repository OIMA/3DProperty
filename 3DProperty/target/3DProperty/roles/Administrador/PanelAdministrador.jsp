<%-- 
    Document   : PanelAdministrador
    Created on : Apr 27, 2014, 4:33:01 PM
    Author     : OIMA
--%>

<!DOCTYPE html>
<html>

    <head>
        <title>Panel Administrador</title>
        <%@include file="../../inc/jstl.jsp" %>
        <%@include file="../../inc/Header.jsp" %>
    </head>

    <body>
        <%@include file="../../inc/Navigator.jsp" %>
        <%@include file="../../inc/PanelAdministrador.jsp" %>

        <div id="wrapper">
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <%--<s:if test="operacion=='index'"><%@include file="indexAdmin.jsp" %></s:if>--%>
                        <s:if test="operacion=='altaCategoria'"><%@include file="Formularios/formularioCategoria.jspf" %></s:if>
                        <s:if test="operacion=='altaCodigoPostal'"><%@include file="Formularios/formularioCodigoPostal.jspf" %></s:if>
                        <s:if test="operacion=='altaPais'"><%@include file="Formularios/formularioPais.jspf" %></s:if>
                        <s:if test="operacion=='altaEstado'"><%@include file="Formularios/formularioEstado.jspf" %></s:if>
                        <s:if test="operacion=='altaLocalidad'"><%@include file="Formularios/formularioLocalidad.jspf" %></s:if>
                        <s:if test="operacion=='altaColonia'"><%@include file="Formularios/formularioColonia.jspf" %></s:if>
                        <s:if test="operacion=='altaPago'"><%@include file="Formularios/formularioPago.jspf" %></s:if>
                        <s:if test="operacion=='altaPropiedad'"><%@include file="Formularios/formularioPropiedad.jspf" %></s:if>
                        <s:if test="operacion=='altaPublicidad'"><%@include file="Formularios/formularioPublicidad.jspf" %></s:if>
                        <s:if test="operacion=='altaUsuario'"><%@include file="Formularios/formularioUsuario.jspf" %></s:if>
                        <s:if test="operacion=='altaDisenio'"><%@include file="Formularios/formularioDisenio.jspf" %></s:if>
                        <!-- /.row -->
                        <!--</div>-->
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <script src="<%=request.getContextPath()%>/js/PanelAdministrador.js" type="text/javascript"></script>
    </body>

</html>
