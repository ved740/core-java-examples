package jdbc.examples;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class StudentDAO {
	public void getFaculty(int facultyId) throws SQLException {
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet rsFaculty = null;

		try {
			// Loading and registering the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create and get the connection
			conn = DriverManager.getConnection("jdbc:oracle:thin:system/admin@VED740:1521:XE");
			// Create the statement
			preStmt = conn.prepareStatement("select faculty_id, faculty_name from faculty where faculty_id=?");
			// Set the facultyId parameter
			preStmt.setInt(1, facultyId);

			rsFaculty = preStmt.executeQuery();
			// Processing the result
			while (rsFaculty.next()) {
				String facultyName = rsFaculty.getString("faculty_name");
				System.out.println("Faculty Id is: " + facultyId);
				System.out.println("Faculty Name is: " + facultyName);
			}
		} catch (ClassNotFoundException ce) {
			System.out.print("No suitable driver for DB found");
			ce.printStackTrace();
		} catch (SQLException se) {
			System.out.print("SQL Exception occurred");
			se.printStackTrace();
		} finally {
			if (preStmt != null)
			preStmt.close();
			if (conn != null)
			conn.close();
		}
	}
	public int addFaculty(int facultyId, String facultyName) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement preStmt = null;
		int rowsCount = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:system/admin@VED740:1521:XE");
			preStmt = conn.prepareStatement("insert into faculty values (?, ?)");
			preStmt.setInt(1, facultyId);
			preStmt.setString(2, facultyName);
			rowsCount = preStmt.executeUpdate();
		}
		finally {
			if(preStmt != null) preStmt.close();
			if(conn != null) conn.close();
		}
		return rowsCount;
	}
}
