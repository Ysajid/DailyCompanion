/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import tasks.Tag;
import tasks.Task;

/**
 *
 * @author ysajid
 */
public class Data {
    private static Connection connection;
    private static ArrayList<Task> tasks;
    private static HashMap<String,Tag> tags;

    public Data() {
        open();
    }
    
    
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
                tasks = new ArrayList<>();
                tags = new HashMap<>();
                Statement st;
                try {
                    connect();
                    st = connection.createStatement();
                    ResultSet rs = st.executeQuery("select * from tags");

                    while(rs.next()){
                        Tag t = new Tag(rs.getString(1),rs.getInt(2));
                        tags.put(t.getName(),t);
                    }
                    
                    rs = st.executeQuery("select * from tasks");
                    while(rs.next()) {
                        String tag_names[] = rs.getString(6).split(",");
                        Tag t[] = new Tag[tag_names.length];
                        int i=0;
                        for(String tag_name : tag_names){
                            t[i++] = tags.get(tag_name);
                        }
                        
                        Task task = new Task(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),t);
                        tasks.add(task);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    
    public void addTask(Task task){
        tasks.add(task);
        
        try {
            Statement st = connection.createStatement();
            String insertStmt = "insert into tasks values('"
                    + task.getTitle()+"','"
                    + task.getDescription()+"',"
                    + String.valueOf(task.getWeight())+",'"
                    + task.getDueDate()+"','"
                    + task.getStatus()+"','"
                    + task.getTagNames()+"');";
            
            st.execute(insertStmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addTag(Tag tag){
        try {
            tags.put(tag.getName(), tag);
            Statement st = connection.createStatement();
            String insertStmt = "insert into tags values('"
                    + tag.getName()+"',"
                    + tag.getColor()+");";
            
            st.execute(insertStmt);
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
