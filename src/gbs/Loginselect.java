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
public class Loginselect {
    public static ResultSet getData(String query){
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try
        {
            con=ConnectionClass.getcon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
