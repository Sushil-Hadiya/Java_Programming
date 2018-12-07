package org.transaction.savePoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class TransactionSavePoint {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt1 = null;
		Savepoint sp = null; //DECLARE THE SAVEPOINT
		String stedu = "insert into jdbc.studentedu values(?,?,?,?)";
		String stper = "insert into jdbc.studentper values(?,?,?)";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID??");
		int id = sc.nextInt();
		System.out.println("Enter NAME??");
		String name = sc.next();
		System.out.println("Enter DEPT??");
		String dept = sc.next();
		System.out.println("Enter PERC??");
		double per = sc.nextDouble();
		System.out.println("Enter PLACE??");
		String place = sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=SHI8816ll");
			// DISABLE AUTO COMMIT MODE//
			con.setAutoCommit(false);
			con.setSavepoint();
			psmt = con.prepareStatement(stedu);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setString(3, dept);
			psmt.setDouble(4, per);
			psmt.executeUpdate();
			// 1st DB OPRATION
			System.out.println("Student Education Details executed....");
			sp = con.setSavepoint(); //SET THE SAVE POINT
			psmt1 = con.prepareStatement(stper);
			psmt1.setInt(1, id);
			psmt1.setString(2, name);
			psmt1.setString(3, place);
			psmt1.executeUpdate();
			// 2nd DB OPRATION
			System.out.println("Student personal details Executed....");
			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				con.rollback(sp); //PASS THE SP AS A PARAMETER WITH RESPECT TO ROLLBACK....
				con.commit(); //TO SAVE COMMITED VALUE BEFORE THE SAVEPOINT
				System.out.println("Transaction is RollBack...)");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (psmt1 != null) {
				try {
					psmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
