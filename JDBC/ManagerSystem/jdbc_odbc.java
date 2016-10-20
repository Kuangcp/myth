/***
 * ��ʾʹ��jdbc--odbc ������  //�����ɣ�Ҫ��jdk�汾����JDBC������Ȼ��JDBC�����������ò��ˡ�������
 * 
 * 
 * 1 ���������������Դ
 * 2 ��������������Դ
 * java.sql.SQLException: No suitable driver found for jdbc:odbc:myth
 * �ǲ���һ��ҪװMySql����������ʹ��MySQL�Ѿ��㶨��
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
			//1 ��������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");///
			//2 �õ�����  ָ������Դ���û��������� �����������Դ��Windows NT��֤�Ͳ���Ҫ�û�������
//			ct = DriverManager.getConnection("jdbc:odbc:myth","sa","ad1429336");
			ct = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student","sa","ad1429336");
			//���ݿ��URL��ַ�� "jdbc:sqlserver://localhost:1433;databaseName=Student"
			//3 ����һ��Statement����PreparedStatement[����]
			//Statement ���ڷ���SQL��䵽���ݿ⴦
			sm = ct.createStatement();
			//ִ�У�crud,�������ݿ⣬ɾ�����������ݿ⣩
			
			//���һ�����ݵ�student��
			int d = sm.executeUpdate("insert into student(sno) values('2323')");
			if(d==1){
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//�ر���Դ
			//��򿪣��������ȹر�
			try {
				//Ϊ�˳���׳�����п�
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
