package templatemethod.sample2.dependency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtils {
	public static Connection getConn(){
		return null;
	}
	public static void free(ResultSet rs,PreparedStatement ps,Connection c){
		
	}
}
