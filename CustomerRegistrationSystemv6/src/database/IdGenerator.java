package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IdGenerator {
	public static int generateCustomerId(String column, String table) {

		String query = "SELECT " + column + " from " + table + " order by 1 desc LIMIT 1";
		int newId = 0;
		try {
			Connection connection = new DataBaseConnection().getDataBaseConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			String lastID = "";
			while (resultSet.next()) {
				lastID = resultSet.getString(column);
			}
			int iLastId = Integer.parseInt(lastID);

			newId = ++iLastId;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return newId;
	}

}
