<%-- 
    Document   : PanelDiseniador
    Created on : Apr 6, 2014, 6:49:09 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Panel diseniador</title>
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
                
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <script src='<%=request.getContextPath()%>/js/plugins/dataTables/jquery.dataTables.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/plugins/dataTables/dataTables.bootstrap.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/3dp.js' type="text/javascript" ></script>
    </body>
</html>