package preparedStament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  *1 加载驱动
 *  *2 
 *   SQL注入漏洞演示 preparedStatement 可以预防注入式攻击
 *   1 preparedStatement 可以提高执行效率（因为有预编译的功能）
 *   2 可以防止SQL注入，但是要求用？赋值的方式才可以
 *   
 * @author lenovo
 *
 */
public class MaiN { 
    public static void main(String[] args) throws Exception { 
        Connection conn = null; 
        PreparedStatement stmt =null;
        ResultSet rs = null;
        String sql; 
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值 
        // 避免中文乱码要指定useUnicode和characterEncoding 
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定 
        String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动 
           
  
            System.out.println("成功加载MySQL驱动程序"); 
            conn = DriverManager.getConnection(url); 
////           stmt = conn.prepareStatement("create table users(username varchar(30),password varchar(30))");  为什么这个SQL没有执行（少了一个执行的函数executeUpdate()）
//            stmt = conn.prepareStatement("select * from HH where hh=? and gg=? ");//特别要注意?的  中英性
////           stmt = conn.prepareStatement("select * from HH where hh=7 and gg='r' or 1='1'");// or 1='1'加入这句话后，where条件下两个判断式都失效了即注入式攻击
//           stmt.setInt(1, 3);//对第一个问号设置值
//           stmt.setString(2, "c");//对第二个问号设置值
//           
//           rs = stmt.executeQuery();
//           while(rs.next()){
//        	   System.out.println(rs.getString(1)+" "+rs.getString(2));
//           }
            
            stmt=conn.prepareStatement(" ");//和Statement用法差不多，就是里面要写语句，可以置空，再写
            sql = "insert into HH values(6,'1');"; 
            sql = "create table HJ(s int ,f int)";
            sql = "drop table HJ";
            stmt.executeUpdate(sql);
            
        } catch (SQLException e) { 
            System.out.println("MySQL操作错误"); 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
        	if(rs!=null)
        		rs.close();
        	if(stmt!=null)
        		stmt.close();
        	if(conn!=null)
                conn.close(); 
        	System.out.println("资源全部关闭");
        } 
    } 
}
/*
 * 
 * 加载MySQL驱动一些操作，较为规范！
  
  
   Connection conn = null; 
   PreparedStatement stmt =null;
   ResultSet rs = null;
   String sql;
   String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动 
           
  
            System.out.println("成功加载MySQL驱动程序"); 
            conn = DriverManager.getConnection(url); 
            stmt=conn.prepareStatement(" ");//和Statement用法差不多，就是里面要写语句，可以置空，再写
            sql = "insert into HH values(6,'1');"; 
            sql = "create table HJ(s int ,f int)";
            sql = "drop table HJ";
            stmt.executeUpdate(sql);
            
        } catch (SQLException e) { 
            System.out.println("MySQL操作错误"); 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
        	if(rs!=null)
        		rs.close();
        	if(stmt!=null)
        		stmt.close();
        	if(conn!=null)
                conn.close(); 
        	System.out.println("资源全部关闭");
        } 
 */
 