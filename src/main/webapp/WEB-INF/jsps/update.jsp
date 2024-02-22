<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h2>Createe</h2>
        <form action="updatelead"method="post">
        <pre>
        <input type="hidden"name="id"value="${lead.id}"/>
        
             FirstName<input type="text"name="firstName"value="${updatee.firstName}"/>
             lastName<input type="text"name="lastName"value="${updatee.lastName}"/>
             Email<input type="text"name="email"value="${updatee.email}"/>
             Mobile<input type="text"name="mobile"value="${updatee.mobile}"/>
             <input type="submit"value="update"/>
        
        
        
        
        
        </pre>
        
        
        
        </form>
        ${updatee}
</body>
</html>