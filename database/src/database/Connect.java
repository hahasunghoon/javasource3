package database;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * JDBC(Java DateBase Connetivity)
 * 자바에서 데이터베이스에 접속할수 있도록 제공해주는 자바 api
 * 
 * 프로젝트에 ojdbc8.jar 무조건 포함
 * [build path] - [configure build path] - class path 에 ojdbc8.jar 포함
 * 
 * 1) connection 가져오기
 * -드라이버 로드
 * -연결문자열 연걸시도
 * 
 */

public class Connect {

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//jdbc:oracle:thin:@ 고정
			//localhost:1521:xe 
			//localhost == 127.0.0.1 (내 컴퓨터)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
