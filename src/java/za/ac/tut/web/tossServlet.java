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
public class tossServlet extends HttpServlet {

    @EJB
    private TossSBLocal tossSB;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the session
        HttpSession session = request.getSession();
        
        //increment
        Integer cnt = tossSB.increment(session);
        
        //generate the guess value
        String serverGuess =tossSB.determineGuessValue();
        
        //update the session
        updateSession(session,cnt,serverGuess);
        
        //send it to the jsp that will ask the use for his guess since the server already guessed
        RequestDispatcher disp = request.getRequestDispatcher("userGuess.jsp");
        disp.forward(request, response);
    }

    private void updateSession(HttpSession session, Integer cnt, String serverGuess) {
       session.setAttribute("cnt", cnt);
       session.setAttribute("serverGuess", serverGuess);
    }

}
