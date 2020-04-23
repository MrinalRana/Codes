/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;

import java.io.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author Mrinal
 */
public class ThreadClass extends Thread{
    
    private Socket client = null;
    private Connection connection = null;
    private Statement statement = null;
    ObjectOutputStream dOut ;
    ObjectInputStream dIN;
     
    public ThreadClass(Socket client){
        this.client = client;
    }
    
    @Override
    public void run(){
        try
        {
             dOut = new ObjectOutputStream(client.getOutputStream());
             dIN = new ObjectInputStream(client.getInputStream());
             Program program = (Program)dIN.readObject();
             connection = DriverManager.getConnection("jdbc:oracle:thin:@host_name:port_num:SSID", "username", "password");
             
             if(program.getBtn() == 0){
            statement = connection.createStatement();
            int a = statement.executeUpdate("insert into programs values('"
                    +program.getId()+"', '"
                    +program.getName()+"', "
                    +program.getSem()+", "
                    +program.getSeat()+")");
            statement.close();
            if(a==1){
                dOut.writeObject("Program has been added");
            }
            else{
                dOut.writeObject("Program failed to add");
            }
            }
            if(program.getBtn()== 1){
            statement = connection.createStatement();
            ResultSet res = statement.executeQuery("select * from programs");
            ArrayList<Program> pro = new ArrayList<Program>();
            while (res.next()) {
                Program p = new Program();
                p.setId(res.getString(1));
                p.setName(res.getString(2));
                p.setSem(res.getInt(3));
                p.setSeat(res.getInt(4));
                pro.add(p);
          }
          statement.close();
          dOut.writeObject(pro);
            }
            dOut.close();
            dIN.close();
            client.close();
        }
        catch(Exception ioe){
            
            try {
                dOut.writeObject("ID already exist or text fields are empty");
            } catch (IOException ex) {
                Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}
