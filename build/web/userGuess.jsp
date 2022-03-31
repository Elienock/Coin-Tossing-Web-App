<%-- 
    Document   : userGuess
    Created on : 31 Mar 2022, 4:56:14 PM
    Author     : lubay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Play Game</title>
        <style>
h1 {
  text-align: center;
}
p {
    text-align: center;
    font-size: 30px;
}

input[type=text], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 30%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: red;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
form {
  text-align: center;
}
</style>
        <%
        String fname= (String)session.getAttribute("fname");
        String lname= (String)session.getAttribute("lname");
        Integer cnt = (Integer)session.getAttribute("cnt");
        %>
    </head>
      <body style="background-color:powderblue;">
        <h1 style="font-size:300%;">Play The Game</h1>
        <br>
        <br>
        <p>
            Hi <%=fname%> <%=lname%> <br>
            Game: <%=cnt%>
        </p>
        <form action="outcomeServlet.do" method="POST">

           <label for="option">Option</label> <br>
           
    <select id="country" name="userGuess">
      <option value="head">head</option>
      <option value="tail">tail</option>
     
    </select> <br>
  
           <input type="submit" value="Submit"> <br>
        </form>
       
    </body>
</html>
