
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lubay
 */
public class EndSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //get the session
       HttpSession session = request.getSession();
       
       //end session
       session.invalidate();
       
       //request dispatacher
       RequestDispatcher disp = request.getRequestDispatcher("index.html");
       disp.forward(request, response);
               
    }

   

}
