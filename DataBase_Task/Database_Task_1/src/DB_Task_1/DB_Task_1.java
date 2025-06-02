package DB_Task_1;

import java.sql.*;

public class DB_Task_1 {
	
	public static void main(String args[]) throws SQLException {
		Connection con = null;
        String url = "jdbc:mysql://localhost:3306/DB_Connection";
        String user = "root"; 
        String password = ""; 
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection SuccessFull");
            
            Statement stmt = con.createStatement();
            
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                    "empcode INT PRIMARY KEY, " +
                    "empname VARCHAR(50), " +
                    "empage INT, " +
                    "esalary INT)";
            stmt.executeUpdate(createTable);
            
            String insertSQL = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            

            Object[][] employees = {
                    {101, "Jenny", 25, 10000},
                    {102, "Jacky", 30, 20000},
                    {103, "Joe", 20, 40000},
                    {104, "John", 40, 80000},
                    {105, "Shameer", 25, 90000}
            };
            
            for (Object[] emp : employees) {
                pstmt.setInt(1, (Integer) emp[0]);
                pstmt.setString(2, (String) emp[1]);
                pstmt.setInt(3, (Integer) emp[2]);
                pstmt.setInt(4, (Integer) emp[3]);
                pstmt.executeUpdate();
            }
            

            System.out.println("Data inserted successfully!");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
