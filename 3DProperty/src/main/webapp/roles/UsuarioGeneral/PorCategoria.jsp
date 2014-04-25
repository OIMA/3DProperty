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
                <div class="container">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <table class="table table-hover">
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
                                    <tr class="active">
                                        <td>
                                            1
                                        </td>
                                        <td>
                                            TB - Monthly
                                        </td>
                                        <td>
                                            01/04/2012
                                        </td>
                                        <td>
                                            Default
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <div class="row clearfix">
                                <div class="col-md-4 column">
                                    <img alt="140x140" src="http://lorempixel.com/140/140/" class="img-thumbnail" />
                                </div>
                                <div class="col-md-4 column">
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
                                <div class="col-md-4 column">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>