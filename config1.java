/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vineetarora
 */
import java.sql.*;
public class config1 {
    static Connection getConnection1(){
        Connection conn1=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn1=DriverManager.getConnection("jdbc:derby://localhost:1527/medicine", "root", "1234");
        }catch(Exception e){
            
        }
        return conn1;
    }
}
