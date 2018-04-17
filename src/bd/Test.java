package bd;

public class Test {

	public static void main(String[] args) {
		registerDriver();
		OraConn.openConnection("jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf", "anuszel", "anuszel");
		OraConn.closeConnection();
	}
	static private void registerDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Brak sterownika Oracle JDBC.");
		} 
	}
}
