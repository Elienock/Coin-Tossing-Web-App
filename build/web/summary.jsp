<%-- 
    Document   : summary
    Created on : 31 Mar 2022, 11:23:37 AM
    Author     : lubay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Summary Page</title>
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
          <%
            String fname= (String) session.getAttribute("fname");
            String lname= (String) session.getAttribute("lname");
            Integer userWon = (Integer) session.getAttribute("userWon");
            Integer serverWon = (Integer) session.getAttribute("serverWon");
            Integer cnt = (Integer) session.getAttribute("cnt");
        %>
        <h1 style="font-size:300%;">Summary</h1>
      
       <p>
            Hi <%=fname%> <%=lname%> Find the summary below:
        </p>
        
           
        <form action="EndSessionServlet.do" method="GET">
            <table>
                <tr>
                    <td>Total number of Games played: </td>
                    <td><%=cnt%></td>
                </tr>
                <tr>
                    <td>Number of Games Won: </td>
                    <td>
                        <%=userWon%>
                    </td>
                </tr>
                <tr>
                    <td>Number of Games Lost: </td>
                    <td>
                        <%=serverWon%>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="CLICK ME TO END"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
