package booklist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Booklist {
	Connection con;
	
	public Booklist() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "c##madang";
		String pwd = "c##madang";
		
		try { // 드라이버를 찾는 과정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try { // 데이터베이스를 연결하는 과정
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("데이터베이스 연결 성공");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlRun() {
		String query = "SELECT * FROM Book"; //SQL문
		try { // 데이터 베이스에 질의 결과르르 가져오는 과정
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO\tBOOK NAME\t\tPUBLISHER\tPRICE");
			while(rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
			con.close();		
		} 	catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		Booklist so = new Booklist();
		so.sqlRun();
	}
}

