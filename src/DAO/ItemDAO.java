package DAO;

import DTO.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ngoba
 */
public class ItemDAO {

    public static ArrayList<Item> getAllItem() throws SQLException {
        ArrayList<Item> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql = "SELECT *FROM dbo.Items WHERE status =1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String itemcode = rs.getString("itemCode");
                    String itemName = rs.getString("itemName");
                    String supCode = rs.getString("supCode");
                    String unit = rs.getString("unit");
                    float price = rs.getFloat("price");
                    boolean supplying = rs.getBoolean("supplying");
                    String status = rs.getString("status");
                    Item dto = new Item(itemcode, itemName, supCode, unit, price, supplying, status);
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

    public static ArrayList<Item> getAllItem111() throws SQLException {
        ArrayList<Item> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT *FROM dbo.Items WHERE status =0";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String itemcode = rs.getString("itemCode");
                    String itemName = rs.getString("itemName");
                    String unit = rs.getString("unit");
                    float price = rs.getFloat("price");
                    boolean supplying = rs.getBoolean("supplying");
                    String supCode = rs.getString("supCode");
                    String status = rs.getString("status");
                    Item dto = new Item(itemcode, itemName, supCode, unit, price, supplying, status);
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

    public static int InsertItem(String itemcode, String itemname, String unit, float price, boolean supplying, String supcode, String status) throws SQLException {

        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "Insert Into Items(itemCode, itemName,supCode, unit, price,supplying,status)\n"
                    + "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, itemcode);
            pst.setString(2, itemname);
            pst.setString(3, supcode);
            pst.setString(4, unit);
            pst.setFloat(5, price);
            pst.setBoolean(6, supplying);
            pst.setString(7, status);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;

    }

    public static int updateItem(String itemName, String supCode, String unit, float price, boolean supplying, String itemCode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Items\n"
                    + "SET itemName=?,supCode=?,unit=?,price=?,supplying=?\n"
                    + "WHERE itemCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, itemName);
            pst.setString(2, supCode);
            pst.setString(3, unit);
            pst.setFloat(4, price);
            pst.setBoolean(5, supplying);
            pst.setString(6, itemCode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteITEMLan1(String itemcode, String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Items SET status=0 WHERE itemCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, itemcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int Pre_DeleteItems(String itemcode, String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Items SET status=1 WHERE itemCode=? \n"
                    + "UPDATE dbo.Suppliers SET status=1 WHERE supCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, itemcode);
            pst.setString(2, supcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteItemTHAT(String itemcode, String supcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = " DELETE dbo.Items WHERE itemCode=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, itemcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

}
