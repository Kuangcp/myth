/**
 * ������Ӳ�ѯ prepaaredStatement ��һЩ�÷�
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
			//��ʼ�����ǵĶ���
			//1 ��������
			Class.forName("com.mysql.jdbc.Driver");
			//2 �õ�����
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tank?user=myth&password=ad&userUnicode=true&characterEncoding=UTF8");
			//����һ��preparedStatement�������ڷ���
			
			
//			��ͨ�Ĳ�ѯ
			/*ps = cn.prepareStatement("select student.NO,student.name,Grade from student,grade where grade.No=student.NO ");
			//ִ��
			rs=ps.executeQuery();
			
			int cow=1;
			//ѭ��ȡ��
			System.out.println("      ѧ��\t\t����\t�ɼ�");
			while(rs.next()){
				//ѭ��ȡ��
				
				String hh = rs.getString("NO");//Ҳ����ֱ��ȡ�еı��1,2,3������
//				if(hh>3) continue;//��������
				String gg = rs.getString("name");
				int grade = rs.getInt("grade");
				System.out.println(cow+":"+hh+"\t"+gg+"\t"+grade);
				cow++;
			}*/
			
			//��ɾ�Ĳ�
			/*ps = cn.prepareStatement("insert into student values (?,?)");
			
			//��?��ֵ
			ps.setString(1, "2012004");
			ps.setString(2, "̷��ǿ");
			int i = ps.executeUpdate();//����Ӱ�������
			if(i==1){
				System.out.println("��ӳɹ�");
			}else{
				System.out.println("���ʧ��");
			}*/
			//�鿴ȫ��
			ps=cn.prepareStatement("select * from student");
//			ps.setString(1, "NO");
//			ps.setString(2, "student");
			rs = ps.executeQuery();
			System.out.println("No\tName");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
//			if(i==1){
//				System.out.println("��ӳɹ�");
//			}else{
//				System.out.println("���ʧ��");
//			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//�ر���Դ
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
/*  ��Сģ�飺
PreparedStatement ps = null;
Connection cn = null;
ResultSet rs = null;

try{
	//��ʼ�����ǵĶ���
	//1 ��������
	Class.forName("com.mysql.jdbc.Driver");
	//2 �õ�����
	cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tank?user=myth&password=ad&userUnicode=true&characterEncoding=UTF8");
	//����һ��preparedStatement�������ڷ���
	
	
//	
}catch(Exception e){
	e.printStackTrace();
}finally {
	//�ر���Դ
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