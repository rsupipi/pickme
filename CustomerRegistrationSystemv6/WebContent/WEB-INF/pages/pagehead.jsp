
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>ABC Shop</title>


<!-- let's add tag srping:url -->

<spring:url value="../bower_components/datatables-responsive/css/dataTables.responsive.css" var="DataTablesResponsiveCSS" />
<spring:url value="../bower_components/font-awesome/css/font-awesome.min.css" var="CustomCSS" />
<spring:url value="../dist/css/sweetalert.css" var="SweetAlert" />


<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- MetisMenu CSS -->
<link href="https://cdn.jsdelivr.net/bootstrap.metismenu/1.1.2/css/metismenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link 	href="http://ironsummitmedia.github.io/startbootstrap-sb-admin-2/bower_components/datatables-plgins/integration/bootstrap/3/dataTables.bootstrap.css"	rel="stylesheet">



<!-- DataTables Responsive CSS -->
<link
	href="${DataTablesResponsiveCSS}"	rel="stylesheet">

<!-- Custom CSS -->

<link rel="stylesheet" href="http://blackrockdigital.github.io/startbootstrap-sb-admin-2/dist/css/sb-admin-2.css">

<!-- Custom Fonts -->
<link href="${CustomCSS}"rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
