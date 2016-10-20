/***
 * 演示使用jdbc--odbc 桥连接  //放弃吧，要换jdk版本或者JDBC驱动，然而JDBC最新驱动都用不了。。。。
 * 
 * 
 * 1 控制面板配置数据源
 * 2 程序中连接数据源
 * java.sql.SQLException: No suitable driver found for jdbc:odbc:myth
 * 是不是一定要装MySql。。。。。使用MySQL已经搞定！
 * 
 * @date 2-7
 * @author myth
 * @version 1.0
 */
package ManagerSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_odbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection ct = null;
		Statement sm = null;
		
		try {
//			Class.forName(sun.j);
			//1 加载驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");///
			//2 得到连接  指定数据源，用户名，密码 如果配置数据源是Windows NT验证就不需要用户名密码
//			ct = DriverManager.getConnection("jdbc:odbc:myth","sa","ad1429336");
			ct = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student","sa","ad1429336");
			//数据库的URL地址： "jdbc:sqlserver://localhost:1433;databaseName=Student"
			//3 创建一个Statement或者PreparedStatement[区别]
			//Statement 用于发送SQL语句到数据库处
			sm = ct.createStatement();
			//执行（crud,创建数据库，删除，备份数据库）
			
			//添加一条数据到student表
			int d = sm.executeUpdate("insert into student(sno) values('2323')");
			if(d==1){
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//关闭资源
			//后打开（创建）先关闭
			try {
				//为了程序健壮加入判空
				if(sm!=null)
				sm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (ct!=null)
				ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
