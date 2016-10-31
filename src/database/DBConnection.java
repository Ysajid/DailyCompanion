/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ysajid
 */
public class DBConnection {
    private static Connection connection;
    
    public boolean isConnected(){
        try {
            return !connection.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void connect() throws SQLException{
        connection = DriverManager.getConnection("jdbc:sqlite:src/assets/daily_companion");
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void close(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
