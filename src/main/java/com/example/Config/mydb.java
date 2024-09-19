package com.example.Config;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mydb {
    private static String DB_URL = "jdbc:mysql://localhost:3306/ltweb";
    private static String USER = "root";
    private static String PASSWORD = "thinhxuan004";
    private static Connection con;
    public static Connection getConnection() throws IOException {
        con = null;
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(DB_URL,USER,PASSWORD);
        }
        catch (SQLException ex){
            Logger.getLogger(mydb.class.getName()).log(Level.SEVERE,null,ex);
        }
        return (con);

    }
    public static void main(String[] args) throws  IOException {
        Connection con = getConnection();
        if(con==null){
            System.out.println("Something wrong");
        }
        else{
            System.out.println("ok");
        }

    }

}

