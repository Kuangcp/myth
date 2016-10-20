package ManagerSystem;
/**
 * 网上找到的代码，还是死在了兼容性上！
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest {

	//莫名奇妙！！！！
	 static final String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	static final String Driver ="sun.jdbc.odbc.JdbcOdbcDriver";
	
	static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Student";
	static final String USER = "sa";
	static final String PWD = "ad1429336";
	/*
	public Connection getconnection(){
		Connection con = null;
		try{
			Class.forName(Driver);
			con = DriverManager.getConnection(URL,USER,PWD);
			
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException s){
			s.printStackTrace();
		}
		return con;
	}*/
	
	
	public String statement;
	public String param[];
	public ResultSet result = null;
	public Connection con ;
	
	public void setParam(String []param){
		this.param = param;
	}
	public void setStatement(String statement){
		this.statement = statement;
	}
	public  void setConnection (String driverName,String jdbcURL,String username,String password) throws Exception{
		Connection conn ;
		Class.forName(driverName);
		conn = DriverManager.getConnection(jdbcURL,username,password);
		conn.setAutoCommit(false);
		this.con = conn;
	}
	public ResultSet getResult(){
		try {
			PreparedStatement select = con.prepareStatement(statement,java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);
			if(param != null){
				for(int i=0;i<param.length;i++){
					select.setString(i+1,param[i]);
				}
				result = select.executeQuery();
				
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		jdbcTest e = new jdbcTest();
		try {
			e.setConnection(Driver, URL, USER, PWD);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("kk");
	}

}
