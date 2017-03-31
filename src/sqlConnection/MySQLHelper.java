package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLHelper {
	private Connection conn;
	
	public MySQLHelper(String dbName, String dbUser, String dbPass)  {
		cann = DriverManager.getConnection(url, user, password)
	}
	
	public boolean insertInto(String table, Object object) {
		return false;
	}
	
	public boolean deleteFrom(String table, int id) {
		return false;
	}
	
	public boolean update(String table, Object ob) {
		return false;
	}
	
	public List<List<String>> selectFrom (String table, String where) {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM" + table;
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				ResultMetaData md = rs.getMetaData();
				int calums = rs.getMetaData().getColumnCount();
			}
			return ga
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
