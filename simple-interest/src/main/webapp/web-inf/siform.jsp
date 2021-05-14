<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 4 MVC  simple-interest siform Page</title>
</head>
<body>
<form action="/silogic" method="POST"> 
  
<table>
<tr>        <td><form:label path="p">P :</form:label></td>      <td><form:input path="p"></form:input></td>    </tr>
<tr>      <td><form:label path="r">R:</form:label></td>       <td><form:input path="r"></form:input></td>    </tr>
<tr>       <td><form:label path="t">T:</form:label></td>       <td><form:input path="t"></form:input></td>     </tr>
<tr>         <td colspan="2"><input type="submit" value="Submit"/> </td>       </tr>
</table>
</form>
</body>
</html>