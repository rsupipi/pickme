<%-- 
    Document   : sideBar
    Created on : Jun 19, 2015, 10:23:30 PM
    Author     : R S Wilebadaarachchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <!--get header details add css libry-->
        <jsp:include page="pagehead.jsp" />
    </head>

    <body>

        <div id="wrapper">

            <!-- add page Side bar-->
            <jsp:include page="pageSideBar.jsp" />


            <!-- Page Content -->
            <div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-2">
                           
                        </div>
                        <div class="col-md-10">
                            <h1 class="page-header"> ABC Shop(pvt)Ltd </h1>
                        </div>
                       
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- add js libry and <body> compaments-->
        <jsp:include page="pageBody.jsp" />

    </body>

</html>
