<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public int add(int x,int y){
	

return x+y; 
}
%>

<%

int i=7,j=3,m,k, n;
m=i+j;%>
the value of m is <%= m %> 
 
 <%
 k=add(7684,43768);
 %>
 <br>

 the value of k is <%= k %> 
 <%
 for(i=0;i<5;i++)
 {
 
 out.println(i);
 }%>
 

</body>
</html>