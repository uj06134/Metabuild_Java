import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// 0. ojdbc8.jar 추가
		try {
			// 1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			// 2. 계정에 접속
			conn = DriverManager.getConnection(url,id,pw); // conn: sqlid/sqlpw 계정에 접속했다는 정보가 들어있음
			System.out.println("접속 성공");
			
			// 3. sql문 작성-분석
			String sql = "select * from test";
			ps = conn.prepareStatement(sql); // ps: sql 분석 정보
			
			// 4. sql문 실행
			rs = ps.executeQuery(); // select문 실행
			while(rs.next()) {
				// 한줄에만 접근
				int num = rs.getInt("num"); // 컬럼명
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + "," + name + "," + addr);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패/분석 실패");
			e.printStackTrace();
			
		} finally {
			// 5. 자원 반납
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			// 5. 접속 끊기
			if(conn != null) { // 접속 성공시
				try {
					conn.close();
					System.out.println("접속 끊기 성공");
				} catch (SQLException e) {
					System.out.println("접속 끊기 실패");
					e.printStackTrace();
				}
			}
		}
	}
}

// JDBC: Java Database Connectivity
//프로젝트명 - bulidpath - configure bulidpath - classparh 누른후 add External jar  