package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPrincipal {

	private static final String SERVER = "localhost";
	private static final String DATABASE = "locadoraveiculos";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://" + SERVER + "/" + DATABASE
			+ "?useSSL=false&useTimezone=true&serverTimezone=UTC";
	private static Connection connection = null;

	static {

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection retornaconecao() {
		return connection;
	}
}
