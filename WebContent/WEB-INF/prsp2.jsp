
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<c:if test="${!empty result }"><p><c:out value="${result}"></c:out></p></c:if>
		
		<form method="post" action="prsp2">
			<label for="id">Identifiant : </label>
			<input type="number" name="id" id="id">
					
			<label for="nom">Nom : </label>
			<input type="text" name="nom" id="nom">
			
			<label for="prenom">Prénom : </label>
			<input type="text" name="prenom" id="prenom">
					
			<label for="email">Email : </label>
			<input type="email" name="email" id="email">
				
			<label for="password">Mot de passe : </label>
			<input type="password" name="password" id="password">
			
			<input type="submit">
		</form>
	
	</body>
</html>