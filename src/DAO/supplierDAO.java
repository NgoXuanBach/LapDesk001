/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Supplier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ngoba
 */
public class supplierDAO {

    public static ArrayList<Supplier> getAllSupplier() throws SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql = "SELECT*FROM dbo.Suppliers WHERE status=1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String supcode = rs.getString("supCode");
                    String supname = rs.getString("supName");
                    String address = rs.getString("address");
                    boolean collaborating = rs.getBoolean("collaborating");
                    String status = rs.getString("status");
                    Supplier dto = new Supplier(supcode, supname, address, collaborating, status);
                    list.add(dto);
                }

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }
    public static ArrayList<Supplier> getAllSupplier333() throws SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql = "SELECT*FROM dbo.Suppliers";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String supcode = rs.getString("supCode");
                    String supname = rs.getString("supName");
                    String address = rs.getString("address");
                    boolean collaborating = rs.getBoolean("collaborating");
                    String status = rs.getString("status");
                    Supplier dto = new Supplier(supcode, supname, address, collaborating, status);
                    list.add(dto);
                }

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }

    public static ArrayList<Supplier> getAllSupplier111() throws SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT*FROM dbo.Suppliers WHERE status=0";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String supcode = rs.getString("supCode");
                    String supname = rs.getString("supName");
                    String address = rs.getString("address");
                    boolean collaborating = rs.getBoolean("collaborating");
                    String status = rs.getString("status");
                    Supplier dto = new Supplier(supcode, supname, address, collaborating, status);
                    list.add(dto);
                }

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }

    public static ArrayList<Supplier> getAllSupplier222() throws SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT*FROM dbo.Suppliers WHERE status=0";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String supcode = rs.getString("supCode");
                    String supname = rs.getString("supName");
                    String address = rs.getString("address");
                    boolean collaborating = rs.getBoolean("collaborating");
                    String status = rs.getString("status");
                    Supplier dto = new Supplier(supcode, supname, address, collaborating, status);
                    list.add(dto);
                }

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }

    public static int InsertSupplier(String supcode, String supName, String address, boolean collaborating, String status) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.makeConnection();
        if (cn != null) {
            String sql = "INSERT dbo.Suppliers\n"
                    + " VALUES (?,?,?,?,?)\n";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, supcode);
            pst.setString(2, supName);
            pst.setString(3, address);
            pst.setBoolean(4, collaborating);
            pst.setString(5, status);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteSupplier(String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Items SET status=0 WHERE supCode=?\n"
                    + "UPDATE dbo.Suppliers SET status=0 WHERE supCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, supcode);
            pst.setString(2, supcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int Pre_DELETESUPPLIER(String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Items SET status=1 WHERE supCode=?\n"
                    + "UPDATE dbo.Suppliers SET status=1 WHERE supCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, supcode);
            pst.setString(2, supcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteSupplierThat(String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "DELETE dbo.Items WHERE supCode=?\n"
                    + "DELETE dbo.Suppliers WHERE supCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, supcode);
            pst.setString(2, supcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int UpdateSupplier(String supname, String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = " UPDATE dbo.Suppliers SET supName=? WHERE supCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, supname);
            pst.setString(2, supcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

}
