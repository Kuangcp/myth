package ManagerSystem;


/**   ���Ǻܹ淶����������������
 * 
 * @author ����ΰ�� ��΢����http://weibo.com/taoandtao 
 * @date ��2012/12/11 
 * @place�����ݴ�ѧ�������ѧԺ 
 * 
 * 
 * ���ڳɹ�����Mysql���ݿ⡣�����˹���ѧ��������
 
   JDBC��Java Data Base Connectivity,java���ݿ����ӣ���һ������ִ��SQL����Java API������Ϊ���ֹ�ϵ���ݿ��ṩͳһ���ʣ�����һ����Java���Ա�д����ͽӿ���ɡ�JDBC�ṩ��һ�ֻ�׼���ݴ˿��Թ������߼��Ĺ��ߺͽӿڣ�ʹ���ݿ⿪����Ա�ܹ���д���ݿ�Ӧ�ó���

 ���Ҫʹ�����ݿ��Ҫ������ݿ����������ͬ�����ݿ��в��õ�����������Ͳ�һһ˵�������jar�����������ķ����Ͳ���������ͣ�

 ��һ�����������н���http://www.cnblogs.com/taoweiji/archive/2012/12/11/2812295.html

 ������һ��ʵ��ȥ����mysql���ݿ�����ӣ��������ݿ�ķ���Ҳ�ǲ��ġ�

  executeUpdate(sql); ִ�и��� SQL ��䣬��������Ϊ INSERT��UPDATE �� DELETE ��䣬���߲������κ����ݵ� SQL ��䣨�� SQL DDL ��䣩��
  executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ ִ�и����� SQL ��䣬����䷵�ص��� ResultSet ����
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
        // MySQL��JDBC URL��д��ʽ��jdbc:mysql://�������ƣ����Ӷ˿�/���ݿ������?����=ֵ 
        // ������������Ҫָ��useUnicode��characterEncoding 
        // ִ�����ݿ����֮ǰҪ�����ݿ����ϵͳ�ϴ���һ�����ݿ⣬�����Լ����� 
        // �������֮ǰ��Ҫ�ȴ���javademo���ݿ� 
        String url = "jdbc:mysql://localhost:3306/Tank?"
                + "user=myth&password=ad&useUnicode=true&characterEncoding=UTF8"; 
  
        try { 
            // ֮����Ҫʹ������������䣬����ΪҪʹ��MySQL����������������Ҫ�������������� 
            // ����ͨ��Class.forName�������ؽ�ȥ��Ҳ����ͨ����ʼ������������������������ʽ������ 
            Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql���� 
            // or: 
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver(); 
            // or�� 
            // new com.mysql.jdbc.Driver(); 
  
            System.out.println("�ɹ�����MySQL��������"); 
            // һ��Connection����һ�����ݿ����� 
            conn = DriverManager.getConnection(url); 
            // Statement������кܶ෽��������executeUpdate����ʵ�ֲ��룬���º�ɾ���� 
            Statement stmt = conn.createStatement(); 
            
            
            sql = "select * from HH"; 
            
            ResultSet rs = stmt.executeQuery(sql);// executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ ִ�и����� SQL ��䣬����䷵�ص��� ResultSet ����
//            rs.next();
//            String s = rs.getString(1);//Column Index out of range, 3 > 2   ����Խ��
//            System.out.println(s);
            System.out.println("ѧ��\t����");
            while (rs.next()) { //ָ��ָ���˽������һ�м�¼��ǰ���ͷ��������Ҫѭ��ȡ���������ȫ��
            	//��һ��ʹ��next������ָ���˵�һ��
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));// ������ص���int���Ϳ�����getInt() 
            }
            
            //ִ�е�SQL��䲿�֣�
//            sql = " create table student(NO char(20),name varchar(20),primary key(NO))"; //Ҫִ�е����
//            int result = stmt.executeUpdate(sql);// executeUpdate���᷵��һ����Ӱ����������������-1��û�гɹ� 
//            if (result != -1) {
//                System.out.println("�������ݱ�ɹ�"); 
//                sql = "insert into student(NO,name) values('2012001','��ΰ��')"; 
//                result = stmt.executeUpdate(sql); //ִ�и��� SQL ��䣬��������Ϊ INSERT��UPDATE �� DELETE ��䣬���߲������κ����ݵ� SQL ��䣨�� SQL DDL ��䣩��
//                sql = "insert into student(NO,name) values('2012002','��С��')"; 
//                result = stmt.executeUpdate(sql); 
//                sql = "select * from student"; 
//                ResultSet rs = stmt.executeQuery(sql);// executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ 
//                System.out.println("ѧ��\t����"); 
//                while (rs.next()) { 
//                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));// ��������ص���int���Ϳ�����getInt() 
//                } 
//            } 
        } catch (SQLException e) { 
            System.out.println("MySQL��������"); 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            conn.close(); 
        } 
  
    } 
  
} 