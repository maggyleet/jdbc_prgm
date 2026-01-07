package programz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Establish_Connection_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading driver completed!!");
			String dburl = "jdbc:mysql://localhost:3306/add_m14";
			String user = "mega";
			String pwd = "mega123";
			Connection con = DriverManager.getConnection(dburl, user, pwd);
			if(con!=null) {
				System.out.println("Connection created!");
			}
			else {
				System.out.println("Try again!");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
