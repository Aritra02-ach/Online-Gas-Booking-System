/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbs;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author achar
 */
public class Table {
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionClass.getcon();
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),connection_id varchar(50),address varchar(300))");
            st.executeUpdate("create table connection(Provider_Name varchar(200),Distributor_Name varchar(200),Distributor_Address varchar(500),Contact varchar(15),Stock varchar(10))");
            st.executeUpdate("create table booking(Name varchar(200),Email varchar(200),Contact varchar(15),Address varchar(500),connection_id varchar(50),Booking_date date,Status varchar(15),Distributor_name varchar(100),cancellation varchar(200)");
            JOptionPane.showMessageDialog(null,"Table created Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }catch(Exception e){
            }
        }
    }
    
}
