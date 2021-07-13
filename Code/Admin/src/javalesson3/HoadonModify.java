/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javalesson2.Phong;

/**
 *
 * @author Admin
 */
public class HoadonModify {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/thietbi";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";
    
    public static ArrayList<Thongtinkhachhang> findbyname(String name){
        ArrayList<Thongtinkhachhang> ttkhachhangList = new ArrayList<>();
        
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from donhang where tenkhachhang like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Thongtinkhachhang ttkh = new Thongtinkhachhang(resultSet.getInt("id"), resultSet.getString("tenkhachhang"),resultSet.getString("sodienthoai"),resultSet.getString("email"));
                ttkhachhangList.add(ttkh);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return ttkhachhangList;
    }
    
    public static ArrayList<Thongtinkhachhang> findbyid(String id){
        ArrayList<Thongtinkhachhang> ttkhachhangList = new ArrayList<>();
        
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from donhang where ID = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Thongtinkhachhang ttkh = new Thongtinkhachhang(resultSet.getInt("id"), resultSet.getString("tenkhachhang"),resultSet.getString("sodienthoai"),resultSet.getString("email"));
                ttkhachhangList.add(ttkh);
            }
           
        }catch(SQLException ex){
            Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return ttkhachhangList;
    }
    
    public static ArrayList<Chitiethoadon> showHoadon(int id){
        ArrayList<Chitiethoadon> ctdhList = new ArrayList<>();
        
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from chitietdonhang where madonhang = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Chitiethoadon ctdh = new Chitiethoadon(resultSet.getInt("madonhang"), resultSet.getInt("maphong"),resultSet.getString("tenphong"),resultSet.getInt("giaphong"),resultSet.getInt("soluongphong"));
                ctdhList.add(ctdh);
            
            }
           
        }catch(SQLException ex){
            Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(HoadonModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return ctdhList;
    }
    
}

