package database;

import java.sql.*;

import com.typesafe.config.*;

public class ConnectDB {

	public static Config configuration = ConfigFactory.load();
	
	/**
	 * Fonction se connecter à la base de données MySql Groupes 
	 * via un driver JDBC MySQL
	 * @return un objet de type Connection
	 */

	public static Connection bdConnect() {
		
		Connection dbConnection = null;

		try {
			String db_driver = configuration.getString("db_driver");
			String db_url = configuration.getString("db_url");
			String db_user = configuration.getString("db_user");
			String db_password = configuration.getString("db_password");

			Class.forName(db_driver);
			dbConnection = DriverManager.getConnection(db_url, db_user, db_password);

			
		} catch (Exception exp) {
			System.out.print("Impossible de se connecter à la base de donnees, Message d'exception : " + exp.getMessage());
			exp.printStackTrace();
		}
		return dbConnection;
	}

}
