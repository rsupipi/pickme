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
				<div class="row"></div>

				<div class="row">

					<form:form action="addCustomer" method="POST"
						commandName="customer">


						<div class="panel-info">

							<div class="panel-body col-md-6 col-md-offset-3">
								<h1>Add customer Details</h1>

								<div class=" controls">
									<form:label path="title">Title :</form:label>
									<p>

										<form:select path="title" class="form-control" required="true">
											<option></option>
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
											<form:input class="form-control" path="name" required="true"></form:input>
										</p>
										<p class="help-block"></p>
									</div>
								</div>

								<div class="control-group">
									<form:label path="email">Email:</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<form:input class="form-control" path="email" type="email"
												required="true"></form:input>
										</p>
										<p class="help-block"></p>
									</div>
								</div>





								<div class="control-group">
									<label class="control-label">Email address</label>
									<div class="controls">
										<input type="email" />
										<p class="help-block"></p>
									</div>
								</div>








								<div class="control-group">
									<form:label path="address">Address:</form:label>
									<label class="text-danger ">*</label>
									<div class=" controls">
										<p>
											<form:textarea class="form-control" path="address"></form:textarea>
										</p>
										<p class="help-block"></p>
									</div>
								</div>



								<div class="row text-center ">
									<input type="submit" class="btn btn-primary" value="Register">
								</div>
							</div>
						</div>

					</form:form>







					<form data-toggle="validator" role="form">
						<div class="form-group">
							<label for="inputName" class="control-label">Name</label> <input
								type="text" class="form-control" id="inputName"
								placeholder="Cina Saffary" required>
						</div>
						<div class="form-group has-feedback">
							<label for="inputTwitter" class="control-label">Twitter</label>
							<div class="input-group">
								<span class="input-group-addon">@</span> <input type="text"
									pattern="^[_A-z0-9]{1,}$" maxlength="15" class="form-control"
									id="inputTwitter" placeholder="1000hz" required>
							</div>
							<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
							<span class="help-block with-errors">Hey look, this one
								has feedback icons!</span>
						</div>
						<div class="form-group">
							<label for="inputEmail" class="control-label">Email</label> <input
								type="email" class="form-control" id="inputEmail"
								placeholder="Email"
								data-error="Bruh, that email address is invalid" required>
							<div class="help-block with-errors"></div>
						</div>
						<div class="form-group">
							<label for="inputPassword" class="control-label">Password</label>
							<div class="form-group col-sm-6">
								<input type="password" data-minlength="6" class="form-control"
									id="inputPassword" placeholder="Password" required> <span
									class="help-block">Minimum of 6 characters</span>
							</div>
							<div class="form-group col-sm-6">
								<input type="password" class="form-control"
									id="inputPasswordConfirm" data-match="#inputPassword"
									data-match-error="Whoops, these don't match"
									placeholder="Confirm" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
				</div>
				<div class="form-group">
					<div class="radio">
						<label> <input type="radio" name="underwear" required>
							Boxers
						</label>
					</div>
					<div class="radio">
						<label> <input type="radio" name="underwear" required>
							Briefs
						</label>
					</div>
				</div>
				<div class="form-group">
					<div class="checkbox">
						<label> <input type="checkbox" id="terms"
							data-error="Before you wreck yourself" required> Check
							yourself
						</label>
						<div class="help-block with-errors"></div>
					</div>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
				</form>














			</div>
		</div>

	</div>
	<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->



	<!-- add js libry and <body> compaments-->
	<jsp:include page="pageBody.jsp" />



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>

	<!-- JavaScript validation -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jqBootstrapValidation/1.3.7/jqBootstrapValidation.js"></script>

	<script
		src="https://cdn.jsdelivr.net/jquery.bootstrapvalidation/1.3.7/jqBootstrapValidation.min.js"></script>
	<script>
		$(function() {
			$("input,select,textarea").not("[type=submit]")
					.jqBootstrapValidation();
		});
	</script>




</body>

</html>
