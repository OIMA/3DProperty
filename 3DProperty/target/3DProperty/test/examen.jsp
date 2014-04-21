<%-- 
    Document   : examen
    Created on : Apr 9, 2014, 10:01:17 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Examen</title>
        <%@include file="../style/css/bootstrap.min.css" %>
        <%@include file="../js/jquery-1.10.2.js" %>
        <%@include file="../js/bootstrap.min.js" %>
    </head>
    <body>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <h3 class="text-center text-success">
                        Examen ajax.
                        <div>
                            Programa que actualiza el reloj a partir de un evento MouseOver
                        </div>
                    </h3>
                    <div class="row clearfix">
                        <div class="col-md-4 column">
                        </div>
                        <div class="col-md-4 column">
                            <div class="row clearfix">
                                <div class="col-md-4 column">
                                    Horas
                                </div>
                                <div class="col-md-4 column">
                                    Minutos
                                </div>
                                <div class="col-md-4 column">
                                    Segundos
                                </div>
                            </div>
                            <div class="row clearfix">
                                <div class="col-md-4 column">
                                    <span id="h">00</span>
                                </div>
                                <div class="col-md-4 column">
                                    <span id="m">00</span>
                                </div>
                                <div class="col-md-4 column">
                                    <span id="s">00</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4 column">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
