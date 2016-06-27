<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <!--get header details add css libry-->
        <jsp:include page="pagehead.jsp" />

        <!-- DataTables CSS -->
        <link href="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

        <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- DataTables Responsive CSS -->
        <link href="bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
        <script src="bower_components/jquery/dist/jquery.js"></script>

    </head>

    <body>

        <div id="wrapper">

            <!-- add page Side bar-->
            <jsp:include page="pageSideBar.jsp" />


            <!-- Page Content -->
            <div id="page-wrapper"> 

                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-10">
                            <h2 class="page-header" style="color: #00C;">${message}</h2>
                        </div>                        

                    </div >                  
                    <!-- /.row -->

                    <div class="row">
                       
                        <h4></h4>

                        <div class="panel panel-default">                          

                            <!-- /.panel-heading -->
                            <div class="panel-body ">
                                <div class="row text-center">
                                    <div class="col-md-6">
                                       
                                    </div>
                                </div><br><br>
                                <div class="row">
                                    <div class="col-md-2 "><strong>id :</strong></div>
                                    <div class="col-md-9 ">${id}</div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2 "><strong>Title :</strong></div>
                                    <div class="col-md-9 ">${title}</div>
                                </div>
                               
                                <div class="row">
                                    <div class="col-md-2 "><strong>Name :</strong></div>
                                    <div class="col-md-9 ">${name}</div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2 "><strong>Email Address :</strong></div>
                                    <div class="col-md-9 ">${email}</div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2 "><strong>Address :</strong></div>
                                    <div class="col-md-9 ">${address}</div>
                                </div>

                            </div>
                            <div class="row text-center">
                                ${button1}
                                ${button2}
                                
                               
                            </div>
                        </div>
                        

                      

                    </div> <!-- /.row -->
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
