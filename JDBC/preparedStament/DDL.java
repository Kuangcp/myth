/**
 * 通过Java使用DDL语句
 * 实现数据库创建删除备份还原的操作 
 *			 备份：mysqldump -h localhost -u myth -p  Tank>DD.bbb
	     	 还原：mysql -h localhost -u myth -p DDL<DD.bbb
 */
package preparedStament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection cn = null;
		ResultSet rs = null;
		
		try{
			//初始化我们的对象
			//1 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2 得到连接
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tank?user=myth&password=ad&userUnicode=true&characterEncoding=UTF8");
			//创建一个preparedStatement对象用于发送
			
			/** 创建数据库和表，返回值有点怪！
			 * ps=cn.prepareStatement("create database JJ");
			ps=cn.prepareStatement("create table ee(a int,b int)");
			boolean g = ps.execute();//如果第一个结果是 ResultSet 对象，则返回 true；如果第一个结果是更新计数或者没有结果，则返回 false 

			if(g){
				System.out.println("执行成功");
			}else{
				System.out.println("失败");//其实是执行成功了
			}*/
			//备份还原！

//			ps = cn.prepareStatement("");
//			boolean g=ps.execute();
//			if(g){
//				System.out.println("执行成功");
//			}else{
//				System.out.println("失败");//其实是执行成功了
//			}
//			backup();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//关闭资源
				try {
					if(rs!=null)
					    rs.close();
					if(ps!=null)
						ps.close();
					if(cn!=null)
						cn.close();
				} catch (SQLException e) { 
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
	}
	//好像没有用的样子，还是用DOS窗口去备份还原吧
//	public static void backup(){
//		Runtime rt=null;
//		Process child =null;
//		InputStream in=null;
//		InputStreamReader xx =null;
//		BufferedReader br = null;
//		OutputStreamWriter writer =null;
//		FileOutputStream fout = null;
//		try {
//			rt = Runtime.getRuntime();
//			child = rt.exec("mysqldump --opt test>DL.bbb");
////			child = rt.exec("mysqldump -u myth --set-charset=utf8 bjseact_obj");
//			in = child.getInputStream();
//			xx = new InputStreamReader(in,"utf8");
//			String inStr;
//			StringBuffer sb = new StringBuffer("");
//			String outStr;
//			 br = new BufferedReader(xx);
//			while((inStr = br.readLine())!=null){
//				sb.append(inStr+"\r\n");
//			}
//			outStr = sb.toString();
//			fout = new FileOutputStream("E:/MySQL/mysql-5.6.24-win32/bin/bjse22.sql");
//			writer = new OutputStreamWriter(fout,"utf8");
//			writer.write(outStr);
//			writer.flush();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally {
//			try {
//				if(in!=null)
//				in.close();
//				if(xx!=null)
//					xx.close();
//				if(br!=null)
//					br.close();
//				if(writer!=null)
//					writer.close();
//				if(fout!=null)
//					fout.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

}
