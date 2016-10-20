/**
 * 表的连接查询 prepaaredStatement 的一些用法
 */
package preparedStament;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_mysql {

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
			
			
//			普通的查询
			/*ps = cn.prepareStatement("select student.NO,student.name,Grade from student,grade where grade.No=student.NO ");
			//执行
			rs=ps.executeQuery();
			
			int cow=1;
			//循环取出
			System.out.println("      学号\t\t姓名\t成绩");
			while(rs.next()){
				//循环取出
				
				String hh = rs.getString("NO");//也可以直接取列的编号1,2,3。。。
//				if(hh>3) continue;//加以限制
				String gg = rs.getString("name");
				int grade = rs.getInt("grade");
				System.out.println(cow+":"+hh+"\t"+gg+"\t"+grade);
				cow++;
			}*/
			
			//增删改查
			/*ps = cn.prepareStatement("insert into student values (?,?)");
			
			//给?赋值
			ps.setString(1, "2012004");
			ps.setString(2, "谭浩强");
			int i = ps.executeUpdate();//返回影响的行数
			if(i==1){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}*/
			//查看全部
			ps=cn.prepareStatement("select * from student");
//			ps.setString(1, "NO");
//			ps.setString(2, "student");
			rs = ps.executeQuery();
			System.out.println("No\tName");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
//			if(i==1){
//				System.out.println("添加成功");
//			}else{
//				System.out.println("添加失败");
//			}
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

}
/*  最小模块：
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
	
	
//	
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
	
}*/