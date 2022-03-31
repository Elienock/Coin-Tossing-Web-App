<%-- 
    Document   : outcome
    Created on : 31 Mar 2022, 10:58:44 AM
    Author     : lubay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
            <style>
h1 {
  text-align: center;
}
p {
    text-align: center;
    font-size: 30px;
}
a:link, a:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}
a:hover, a:active {
  background-color: red;
}
</style>
    <body style="background-color:powderblue;">
        <h1 style="font-size:300%;">Outcome</h1>
        <%
        String fname = (String)session.getAttribute("fname");
        String lname = (String)session.getAttribute("lname");
        Integer cnt = (Integer) session.getAttribute("cnt");
        String serverGuess=(String) session.getAttribute("serverGuess");
        String userGuess = (String) session.getAttribute("userGuess");
        String outcome = (String) session.getAttribute("outcome");
        %>
        
        <p>
            Hi <%=fname%> <%=lname%> Please see the outcome for game number:  <%=cnt%> below:
            
        </p>
        <p>
            Toss:<%=userGuess%> <br>
            Guess:<%=serverGuess%> <br>
            Outcome:<%=outcome%> <br>
            <br>
            <br>
            
            <a href="tossServlet.do">PLAY AGAIN</a>
            <a href="summary.jsp">END GAME</a>
        </p>
        
    </body>
</html>
