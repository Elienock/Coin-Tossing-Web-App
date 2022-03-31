/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lubay
 */
public class StartServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //create a session
        HttpSession session = request.getSession(true);
        
        //get user inputs
        String fname = (String) request.getParameter("fname");
        String lname = (String) request.getParameter("lname");
        
        //initialise the session
        initialiseTheSession(session,fname,lname);
        
        //send it to the tossServlet
        response.sendRedirect("tossServlet.do");
    }

    private void initialiseTheSession(HttpSession session, String fname, String lname) {
       Integer cnt=0,serverWon=0,userWon=0;
       String outcome="",serverGuess="",userGuess="";
       
       session.setAttribute("cnt", cnt);
       session.setAttribute("lname", lname);
       session.setAttribute("fname", fname);
       session.setAttribute("serverWon", serverWon);
       session.setAttribute("userWon", userWon);
       session.setAttribute("serverGuess", serverGuess);
       session.setAttribute("userGuess",userGuess);
    }

  
}
