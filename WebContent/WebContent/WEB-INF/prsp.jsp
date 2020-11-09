
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<c:if test="${!empty result }"><p><c:out value="${result}"></c:out></p></c:if>
		
		<form method="post" action="prsp">
			<label for="prenom">Prénom : </label>
			<input type="text" name="prenom" id="prenom">
					
			<label for="password">Mot de passe : </label>
			<input type="password" name="password" id="password">
			
			<input type="submit">
		</form>
	</body>
</html>