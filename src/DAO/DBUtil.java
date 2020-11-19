/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Item;
import DTO.Supplier;
import DTO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author ngoba
 */
public class DBUtil {

    public static String checkLogin(String userID, String password) {
        String name = "";
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select fullName \n"
                        + "from Users\n"
                        + "where userID =? and password =?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, userID);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    name = rs.getString("fullName");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return name;
    }

    public static Vector<Item> getItems() {
        Vector<Item> v = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select *\n "
                        + "from Items";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String code = rs.getString("itemCode");
                    String name = rs.getString("itemName");
                    String supCode = rs.getString("supCode");
                    String unit = rs.getString("unit");
                    float price = rs.getFloat("price");
                    boolean supplying = rs.getBoolean("supplying");
                    String status = rs.getString("status");
                    Item i = new Item(code, name, supCode, unit, price, supplying, status);
                    v.add(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return v;
    }
    public static Vector<User> getStatus() {
        Vector<User> v = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select fullName,status\n "
                        + "from Users";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String fullName = rs.getString("fullName");
                    boolean status = rs.getBoolean("status");
                    User u = new User(fullName, status);
                    v.add(u);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return v;
    }

    public static int doRecord(String tableName, String sql) throws SQLException {
        Connection cn = null;
        int result = 0;

        cn = MyConnection.makeConnection();
        if (cn != null) {
            PreparedStatement pst = cn.prepareStatement(sql);
            result = pst.executeUpdate();
        }

        return result;
    }
}
