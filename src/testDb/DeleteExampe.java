package testDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExampe {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Mymma@1357");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from eproduct where id =3");
		
		ResultSet result =stmt.executeQuery("Select * from eproduct");
		
		while(result.next())
		{
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("NAME"));
			System.out.println(result.getFloat("PRICE"));
			System.out.println(result.getDate("DATE_ADDED"));
		

	}
	}

}

