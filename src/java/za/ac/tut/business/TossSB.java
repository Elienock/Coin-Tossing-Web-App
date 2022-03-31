/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lubay
 */
@Stateless
public class TossSB implements TossSBLocal {
String[] coinSide ={"head","tail"};
    @Override
    public Integer increment(HttpSession session) {
       Integer cnt = (Integer) session.getAttribute("cnt");

      return cnt +1;
    
    }

    @Override
    public String determineGuessValue() {
        int randNum;
        
        randNum= (int)Math.floor(Math.random()*2);
        
        return coinSide[randNum];
    }

    @Override
    public String determineOutcome(String userGuess, HttpSession session) {
        String outcome="";
        String serverGuess = (String) session.getAttribute("serverGuess");
        Integer serverWon =(Integer) session.getAttribute("serverWon");
        Integer userWon = (Integer) session.getAttribute("userWon");
        
        
        if(userGuess.equals(serverGuess)){
            serverWon ++;
            session.setAttribute("serverWon", serverWon);
            outcome="You lost, Server Won";
        }else{
            userWon++;
            outcome="You Won, Server lost";
            session.setAttribute("userWon", userWon);
        }
        return outcome;
    }
    
}
