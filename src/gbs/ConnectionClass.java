/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbs;

/**
 *
 * @author achar
 */
import java.sql.*;
import java.sql.DriverManager;
public class ConnectionClass{
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_book","root","sql123");
            return con;
            
        }
        catch(Exception e){
            return null;
        }
    }
}
