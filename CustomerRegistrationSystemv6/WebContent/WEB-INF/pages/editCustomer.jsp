<%-- 
    Document   : addCustomer
    Created on : Jun 19, 2015, 10:23:30 PM
    Author     : R S Wilebadaarachchi
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
		
			<!-- Intro Content -->
			<div class="col-md-12">	
			<div class="row">
				
			</div>			
				
				<div class="row">					
					<form:form action="editcustomer" method="POST" commandName="customer">
				

						<div class="panel-info">

							<div class="panel-body col-md-6 col-md-offset-3">
							<h1>Edit customer Details </h1>
							
								<div class="control-group">
									<form:label path="name">Customer Id :</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<input class="form-control" value="${id}" disabled = "true"/>
											<form:input type="hidden" class="form-control"  path="id" value="${id}" ></form:input>
											
											
										</p>
										<p class="help-block"></p>
									</div>
								</div>							

								<div class=" controls">
									<form:label path="title">Title :</form:label>
									<p>
									
									<form:select path="title"  class="form-control" required="true">
                                                <option>${title}</option>
                                                <option>Mr</option>
                                                <option>Miss</option>
                                                <option>Mrs</option>
                                                <option>Rev</option>
                                            </form:select>
									</p>
									<p class="help-block"></p>
								</div>

								<div class="control-group">
									<form:label path="name">Name :</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<form:input class="form-control" value="${name}"  path="name" required="true"></form:input>
										</p>
										<p class="help-block"></p>
									</div>
								</div>

								<div class="control-group">
									<form:label path="email">Email:</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<form:input class="form-control" type="email" value="${email}" path="email" required="true"></form:input>
										</p>
										<p class="help-block"></p>
									</div>
								</div>

								<div class="control-group">
									<form:label path="address">Address:</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<form:input class="form-control" path="address" value="${address}" ></form:input>
											
										</p>
										<p class="help-block"></p>
									</div>
								</div>

								<div class="row text-center ">
									<input type="reset" class="btn btn-warning" value="Reset">
									<input type="submit" class="btn btn-primary" value="Save">									
								</div> 
							</div>
						</div>

					</form:form>
				</div>
			</div>

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- add js libry and <body> compaments-->
	<jsp:include page="pageBody.jsp" />

</body>

</html>
