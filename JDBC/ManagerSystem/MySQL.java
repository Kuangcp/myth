package ManagerSystem;


/**   不是很规范！！！！！！！！
 * 
 * @author ：陶伟基 ，微博：http://weibo.com/taoandtao 
 * @date ：2012/12/11 
 * @place：广州大学华软软件学院 
 * 
 * 
 * 终于成功连接Mysql数据库。。日了够的学的慢！！
 
   JDBC（Java Data Base Connectivity,java数据库连接）是一种用于执行SQL语句的Java API，可以为多种关系数据库提供统一访问，它由一组用Java语言编写的类和接口组成。JDBC提供了一种基准，据此可以构建更高级的工具和接口，使数据库开发人员能够编写数据库应用程序。

 如果要使用数据库就要添加数据库的驱动，不同的数据库有不用的驱动，这里就不一一说明，添加jar程序驱动包的方法就不在这里解释，

 另一个文章里面有介绍http://www.cnblogs.com/taoweiji/archive/2012/12/11/2812295.html

 下面是一个实例去介绍mysql数据库的连接，其它数据库的方法也是差不多的。

  executeUpdate(sql); 执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或 DELETE 语句，或者不返回任何内容的 SQL 语句（如 SQL DDL 语句）。
  executeQuery会返回结果的集合，否则返回空值 执行给定的 SQL 语句，该语句返回单个 ResultSet 对象。
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
  
  
public class MySQL { 
    public static void main(String[] args) throws Exception { 
        Connection conn = null; 
        String sql; 
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值 
        // 避免中文乱码要指定useUnicode和characterEncoding 
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定， 
        // 下面语句之前就要先创建javademo数据库 
        String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来， 
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以 
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动 
            // or: 
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver(); 
            // or： 
            // new com.mysql.jdbc.Driver(); 
  
            System.out.println("成功加载MySQL驱动程序"); 
            // 一个Connection代表一个数据库连接 
            conn = DriverManager.getConnection(url); 
            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等 
            Statement stmt = conn.createStatement(); 
            
            
            sql = "select * from HH"; 
            
            ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值 执行给定的 SQL 语句，该语句返回单个 ResultSet 对象。
//            rs.next();
//            String s = rs.getString(1);//Column Index out of range, 3 > 2   操作越界
//            System.out.println(s);
            System.out.println("学号\t姓名");
            while (rs.next()) { //指针指向了结果集第一行记录的前面的头部。所以要循环取出结果集的全部
            	//第一次使用next（）是指向了第一行
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));// 如果返回的是int类型可以用getInt() 
            }
            
            //执行的SQL语句部分：
//            sql = " create table student(NO char(20),name varchar(20),primary key(NO))"; //要执行的语句
//            int result = stmt.executeUpdate(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功 
//            if (result != -1) {
//                System.out.println("创建数据表成功"); 
//                sql = "insert into student(NO,name) values('2012001','陶伟基')"; 
//                result = stmt.executeUpdate(sql); //执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或 DELETE 语句，或者不返回任何内容的 SQL 语句（如 SQL DDL 语句）。
//                sql = "insert into student(NO,name) values('2012002','周小俊')"; 
//                result = stmt.executeUpdate(sql); 
//                sql = "select * from student"; 
//                ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值 
//                System.out.println("学号\t姓名"); 
//                while (rs.next()) { 
//                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));// 入如果返回的是int类型可以用getInt() 
//                } 
//            } 
        } catch (SQLException e) { 
            System.out.println("MySQL操作错误"); 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            conn.close(); 
        } 
  
    } 
  
} 