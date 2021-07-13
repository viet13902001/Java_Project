/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PhongModify {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/thietbi";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";
    public static ArrayList<Phong> findAll() throws SQLException{
        ArrayList<Phong> phongList = new ArrayList<>();
        
        Connection connection= null;
        Statement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from sanpham";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Phong phong = new Phong(resultSet.getInt("ID"), resultSet.getString("tensanpham"),resultSet.getString("giasanpham"),resultSet.getString("hinhanhsanpham"), resultSet.getString("motasanpham"), 
                        resultSet.getString("IDsanpham"));
                phongList.add(phong);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return phongList;
    }
    public static void insert(Phong phong){
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "insert into sanpham (ID, tensanpham, giasanpham, hinhanhsanpham, motasanpham, IDsanpham) values(?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,phong.getID());
            statement.setString(2,phong.getTensanpham());
            statement.setString(3,phong.getGiasanpham());
            statement.setString(4,phong.getHinhanhsanpham());
            statement.setString(5,phong.getMotasanpham());
            statement.setString(6,phong.getIDsanpham());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        } 
    }
    public static void update(Phong mst){
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "update sanpham set tensanpham=?, giasanpham=?, hinhanhsanpham=?, motasanpham=?, IDsanpham=? where ID =?";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1,mst.getTensanpham());
            statement.setString(2,mst.getGiasanpham());
            statement.setString(3,mst.getHinhanhsanpham());
            statement.setString(4,mst.getMotasanpham());
            statement.setString(5,mst.getIDsanpham());
            statement.setInt(6,mst.getID());
            
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        
    }
    public static void delete(int id){
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "delete from sanpham where ID =?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1,id);
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        
    }
//    public static void main(String[] args)  {
//        PhongModify md = new javalesson2.PhongModify();
//        try {
//            ArrayList<Phong> phongList = md.findAll();
//        } catch (SQLException ex) {
//            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public static ArrayList<Phong> findbyname(String name){
        ArrayList<Phong> phongList = new ArrayList<>();
        
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from sanpham where tensanpham like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Phong phong = new Phong(resultSet.getInt("ID"), resultSet.getString("tensanpham"),resultSet.getString("giasanpham"),resultSet.getString("hinhanhsanpham"), resultSet.getString("motasanpham"), 
                        resultSet.getString("IDsanpham"));
                phongList.add(phong);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return phongList;
    }
    
    public static ArrayList<Phong> findbyid(String id){
        ArrayList<Phong> phongList = new ArrayList<>();
        
        Connection connection= null;
        PreparedStatement statement =null;
        
        try{
            connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            
            String sql = "select * from sanpham where ID = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Phong phong = new Phong(resultSet.getInt("ID"), resultSet.getString("tensanpham"),resultSet.getString("giasanpham"),resultSet.getString("hinhanhsanpham"), resultSet.getString("motasanpham"), 
                        resultSet.getString("IDsanpham"));
                phongList.add(phong);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(statement!=null){
                try{
                    statement.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    Logger.getLogger(PhongModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return phongList;
    }
}
