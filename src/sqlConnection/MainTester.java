package sqlConnection;

public class MainTester {
	public static void main(String[] args) {
		Client yasen = Client("Yasen", 18);
		
		MySQLHelper db = new MySQLHelper("//localhost/sqlTesting", "root", "");
		
		db.insertInto("Clients", yasen);
		db.deleteFrom("Clients", yasen.id);
		db.undate("Clients", yasen);
	}
}
