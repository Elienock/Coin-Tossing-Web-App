/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lubay
 */
@Local
public interface TossSBLocal {

    Integer increment(HttpSession session);

    String determineGuessValue();

    String determineOutcome(String userGuess, HttpSession session);
    
}
