package jdbc.examples;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.getFaculty(102);
		
//		int rowsAdded = studentDAO.addFaculty(102, "Gayle");
//		System.out.println(rowsAdded + " rows added !");

	}

}
