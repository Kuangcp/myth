package preparedStament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  *1 ��������
 *  *2 
 *   SQLע��©����ʾ preparedStatement ����Ԥ��ע��ʽ����
 *   1 preparedStatement �������ִ��Ч�ʣ���Ϊ��Ԥ����Ĺ��ܣ�
 *   2 ���Է�ֹSQLע�룬����Ҫ���ã���ֵ�ķ�ʽ�ſ���
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
        // MySQL��JDBC URL��д��ʽ��jdbc:mysql://�������ƣ����Ӷ˿�/���ݿ������?����=ֵ 
        // ������������Ҫָ��useUnicode��characterEncoding 
        // ִ�����ݿ����֮ǰҪ�����ݿ����ϵͳ�ϴ���һ�����ݿ⣬�����Լ��� 
        String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql���� 
           
  
            System.out.println("�ɹ�����MySQL��������"); 
            conn = DriverManager.getConnection(url); 
////           stmt = conn.prepareStatement("create table users(username varchar(30),password varchar(30))");  Ϊʲô���SQLû��ִ�У�����һ��ִ�еĺ���executeUpdate()��
//            stmt = conn.prepareStatement("select * from HH where hh=? and gg=? ");//�ر�Ҫע��?��  ��Ӣ��
////           stmt = conn.prepareStatement("select * from HH where hh=7 and gg='r' or 1='1'");// or 1='1'������仰��where�����������ж�ʽ��ʧЧ�˼�ע��ʽ����
//           stmt.setInt(1, 3);//�Ե�һ���ʺ�����ֵ
//           stmt.setString(2, "c");//�Եڶ����ʺ�����ֵ
//           
//           rs = stmt.executeQuery();
//           while(rs.next()){
//        	   System.out.println(rs.getString(1)+" "+rs.getString(2));
//           }
            
            stmt=conn.prepareStatement(" ");//��Statement�÷���࣬��������Ҫд��䣬�����ÿգ���д
            sql = "insert into HH values(6,'1');"; 
            sql = "create table HJ(s int ,f int)";
            sql = "drop table HJ";
            stmt.executeUpdate(sql);
            
        } catch (SQLException e) { 
            System.out.println("MySQL��������"); 
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
        	System.out.println("��Դȫ���ر�");
        } 
    } 
}
/*
 * 
 * ����MySQL����һЩ��������Ϊ�淶��
  
  
   Connection conn = null; 
   PreparedStatement stmt =null;
   ResultSet rs = null;
   String sql;
   String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql���� 
           
  
            System.out.println("�ɹ�����MySQL��������"); 
            conn = DriverManager.getConnection(url); 
            stmt=conn.prepareStatement(" ");//��Statement�÷���࣬��������Ҫд��䣬�����ÿգ���д
            sql = "insert into HH values(6,'1');"; 
            sql = "create table HJ(s int ,f int)";
            sql = "drop table HJ";
            stmt.executeUpdate(sql);
            
        } catch (SQLException e) { 
            System.out.println("MySQL��������"); 
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
        	System.out.println("��Դȫ���ر�");
        } 
 */
 