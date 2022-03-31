/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import za.ac.tut.business.TossSBLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
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
public class outcomeServlet extends HttpServlet {

    @EJB
    private TossSBLocal tossSB;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the session
        HttpSession session = request.getSession();
        //get the parameters
        String userGuess = request.getParameter("userGuess");
        
        //determine whether the user passed or failed
        String outcome =tossSB.determineOutcome(userGuess, session);
        //update the session
        updateTheSession(session,userGuess,outcome);
        //send it to the user to see the outcome
        RequestDispatcher disp= request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

    private void updateTheSession(HttpSession session, String userGuess,String outcome) {
       session.setAttribute("userGuess", userGuess);
       session.setAttribute("outcome", outcome);
    }

}
