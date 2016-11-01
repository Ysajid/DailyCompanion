/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import tasks.Tag;
import tasks.Task;

/**
 *
 * @author ysajid
 */
public class Data {
    private static Connection connection;
    private static ArrayList<Task> tasks;
    private static ArrayList<Tag> tags;
    
    public boolean isConnected(){
        try {
            return !connection.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void connect() throws SQLException{
        connection = DriverManager.getConnection("jdbc:sqlite:src/assets/daily_companion");
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void open(){
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
            }
       
        });
    }
    
    public void close(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Task> getTasks(){
        return tasks;
    }
    
}
