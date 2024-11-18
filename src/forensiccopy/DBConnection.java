/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forensiccopy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Umarharis
 */
public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/forensic?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS = "";
    private Connection conn;
    
    public static Connection connectDB() 
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception ex)
        {
            System.out.println("There were errors while connecting to db");
            return null;
        }
        
    }
    
    public Connection getconn()
    {
        return conn;
    }
    
    public void closeConnection() {
        try 
        {
            if (conn != null && !conn.isClosed()) 
            {
                conn.close();
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
