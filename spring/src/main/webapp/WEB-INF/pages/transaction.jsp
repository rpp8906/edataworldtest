<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<body>

	<table class="table table-hover">
	<c:forEach items="${transaction}" var="item">
    <tr><td>${item}</td></tr>
   </c:forEach>
	</table>
	
</body>
</html>