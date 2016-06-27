
/*
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBHandler {
    
    static public int setData(Connection connection, String query) throws SQLException{
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(query);
        return  result;        
    }
    
    static public ResultSet getData(Connection connection, String query) throws SQLException{
        Statement statement =  connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);
        return  resultSet;
        
    }
}
*/