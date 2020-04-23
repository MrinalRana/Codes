/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author Mrinal
 */
public class Assignment_5 implements Serializable{
    
    public static void main(String[] args) {
        try {
            new ProgramGUI().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Assignment_5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
