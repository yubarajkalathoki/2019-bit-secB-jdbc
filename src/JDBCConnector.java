import java.sql.*;
public class JDBCConnector {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		//1 Load driver class
		//2 Create connection
		//3 Create Statement //3.1
		//4 Execute Query	 //4.1
		//5 Close connection

		String databaseUrl = "jdbc:mysql://localhost:3306/2019_bit_4th";
		String username = "root";
		String password = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection(databaseUrl, username, password);
		System.out.println("Database Connected Successfully.");
		
//		String sql = 
		//"insert into student (rollNo, course, fullName) values (1,'BIT','Nisha Shrestha')";
//		Statement stat  = cn.createStatement();
//		stat.executeUpdate(sql);
//		System.out.println("Record Inserted Successfull!");
		
		String pSql = "insert into student (rollNo, course, fullName) values (?,?,?)";
		
		PreparedStatement pstat = cn.prepareStatement(pSql);
		pstat.setInt(1, 2);
		pstat.setString(2, "BIT");
		pstat.setString(3, "Punam Pudashaini");
	
		pstat.executeUpdate();
		System.out.println("Record Inserted Successfull!");
	}
}
