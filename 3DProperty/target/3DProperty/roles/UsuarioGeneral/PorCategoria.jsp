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
        <link href='<%=request.getContextPath()%>/style/css/3dp.css' type="text/css" rel="stylesheet"/>
        <link href='<%=request.getContextPath()%>/style/css/plugins/dataTables/dataTables.bootstrap.css' type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="container">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <table class="table table-hover"  id="tablaPropiedades">
                                <thead>
                                    <tr>
                                        <th>
                                            #
                                        </th>
                                        <th>
                                            Imagen
                                        </th>
                                        <th>
                                            Propietario
                                        </th>
                                        <th>
                                            Descripci&oacute;n
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="active filaPropiedad">
                                        <td>
                                            1
                                        </td>
                                        <td>
                                            <img alt="140x140" src="http://lorempixel.com/140/140/" class="img-thumbnail" />
                                        </td>
                                        <td>
                                            <a href="Propietario.action">Oscar Iv&aacute;n Mart&iacute;nez Arce</a>
                                        </td>
                                        <td>
                                            <dl>
                                                <dt>
                                                T&iacute;tulo
                                                </dt>
                                                <dd>
                                                    Castillo del OIMA
                                                </dd>
                                                <dt>
                                                Ubicaci&oacute;n
                                                </dt>
                                                <dd>
                                                    Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
                                                </dd>
                                                <dd>
                                                    Donec id elit non mi porta gravida at eget metus.
                                                </dd>
                                               
                                                <!--                                                <dt>
                                                                                                Malesuada porta
                                                                                                </dt>
                                                                                                <dd>
                                                                                                    Etiam porta sem malesuada magna mollis euismod.
                                                                                                </dd>
                                                                                                <dt>
                                                                                                Felis euismod semper eget lacinia
                                                                                                </dt>
                                                                                                <dd>
                                                                                                    Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                                                                </dd>-->
                                            </dl>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <div class="row clearfix">
                                <div class="col-md-2 column">
                                    <img alt="140x140" src="http://lorempixel.com/140/140/" class="img-thumbnail" />
                                </div>
                                <div class="col-md-4 column detallePropiedad">
                                    <dl>
                                        <dt>
                                        Description lists
                                        </dt>
                                        <dd>
                                            A description list is perfect for defining terms.
                                        </dd>
                                        <dt>
                                        Euismod
                                        </dt>
                                        <dd>
                                            Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
                                        </dd>
                                        <dd>
                                            Donec id elit non mi porta gravida at eget metus.
                                        </dd>
                                        <dt>
                                        Malesuada porta
                                        </dt>
                                        <dd>
                                            Etiam porta sem malesuada magna mollis euismod.
                                        </dd>
                                        <dt>
                                        Felis euismod semper eget lacinia
                                        </dt>
                                        <dd>
                                            Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                        </dd>
                                    </dl>
                                </div>
                                <div class="col-md-6 column">
                                    <div class="panel panel-success">
                                        <div class="panel-heading">
                                            <h3 class="panel-title text-center">
                                                Vista Previa
                                            </h3>
                                        </div>
                                        <div class="panel-body">
                                            <img alt="240x540" src="http://lorempixel.com/520/240/" class="" />
                                        </div>
<!--                                        <div class="panel-footer">
                                            
                                        </div>-->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-12 column">
                            <button type="button" class="btn btn-success btn-block btn-lg">Ver dise&ntilde;o</button>
                            <br/>
                            <br/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <script src='<%=request.getContextPath()%>/js/plugins/dataTables/jquery.dataTables.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/plugins/dataTables/dataTables.bootstrap.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/3dp.js' type="text/javascript" ></script>
    </body>
</html>