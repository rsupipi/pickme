<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
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

                        <div class="col-md-10">
                            <h2 class="page-header" style="color: #00C;">Customer Details </h2>
                        </div> 
                    </div >  

                    <div class="panel panel-default">


                            <!-- Tab panes -->
                            <div class="tab-content">
                                <div class="tab-pane fade in active" id="home">

                                    <div class="panel panel-default">
                                       
                                        <!-- /.panel-heading -->
                                        <div class="panel-body">
                                            <div class="dataTable_wrapper">
                                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                                    <thead>
                                                        <tr>
                                                            <th>Employee Id</th>
                                                            <th>Title</th>
                                                            <th>Name</th>
                                                            <th>EmailAddress</th>
                                                            <th>Address</th>
                                                            <th>change</th>

                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${customers}" var="customer">
                                                        <tr class="">
                                                            <td>${customer.id}</td>
                                                            <td>${customer.title}</td>
                                                            <td>${customer.name}</td>
                                                            <td>${customer.email}</td>
                                                            <td>${customer.address}</td>
                                                            <td>
                                                                <a href="edit${customer.id}">edit</a> 
                                                                <a href="delete${customer.id}">delete</a>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                    </tbody>

                                                </table>
                                            </div>
                                            <!-- /.table-responsive -->
                                        
                                    </div>
                                    <!-- /.panel -->
                                </div>
                            </div>
                        </div>
                        <!-- /.panel -->
                    </div>
                </div>
                <!-- /#page-wrapper -->

            </div>
            <!-- /#wrapper -->
            <jsp:include page="pageBody.jsp" />


            <!-- Page-Level Demo Scripts - Tables - Use for reference -->
            <script type="text/javascript">
                $(document).ready(function () {
                    $('#dataTables-example').DataTable({
                        responsive: true
                    });
                });
            </script>

            
        </div>
    </body>
</html>
