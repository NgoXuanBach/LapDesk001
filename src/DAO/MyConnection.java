/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ngoba
 */
public class MyConnection {
    public static Connection makeConnection(){
        Connection cn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Items Management";
            cn=DriverManager.getConnection(url,"sa","B1782000.");
        } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "kiem tra connection");
        }
       
        return cn;
    }
}
