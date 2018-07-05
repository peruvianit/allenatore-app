<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Page 500 Custom</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/jquery-3.3.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
 
<body>
			
    <br>
	<tr><td colspan='1'><h1 align="center">MONITORAGGIO</h3></td></tr>
	</br>	
    
    <br>
	<tr><td colspan='1'><h3 align="center">Errore 500 : Internal Server Error</h3></td></tr>
	</br>
	
	<br>
	<tr><td colspan='1'><h3>${errGen}</h3></td></tr>
	</br>
	
	<br>
	<tr><td colspan='1'><h5 align="center"><a href="javascript:history.go(-1)">Go Back</a></h5></td></tr>	
	</br>	
		
 

</body>

</html>


	
    

    