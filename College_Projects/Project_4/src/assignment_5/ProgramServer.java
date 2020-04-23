/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
/**
 *
 * @author Mrinal
 */
public class ProgramServer {

    public static void main(String[] args) throws SQLException {
                try {
            ServerSocket server = new ServerSocket(8000);
            while(true){
                Socket socket = server.accept();
                Thread thread = new ThreadClass(socket);
                thread.start();
            }
        } catch (IOException ex) {
            System.out.println("Not able to open a connection at a provided port");
        }
        System.exit(0);
    }
    
   
}
