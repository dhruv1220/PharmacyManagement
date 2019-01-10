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
public class config2 {
    static Connection getConnection2(){
        Connection conn2=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn2=DriverManager.getConnection("jdbc:derby://localhost:1527/medicine","root","1234");
        }catch(Exception e){
            
        }
        return conn2;
    }
}
