/**
 * ͨ��Javaʹ��DDL���
 * ʵ�����ݿⴴ��ɾ�����ݻ�ԭ�Ĳ��� 
 *			 ���ݣ�mysqldump -h localhost -u myth -p  Tank>DD.bbb
	     	 ��ԭ��mysql -h localhost -u myth -p DDL<DD.bbb
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
			//��ʼ�����ǵĶ���
			//1 ��������
			Class.forName("com.mysql.jdbc.Driver");
			//2 �õ�����
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tank?user=myth&password=ad&userUnicode=true&characterEncoding=UTF8");
			//����һ��preparedStatement�������ڷ���
			
			/** �������ݿ�ͱ�����ֵ�е�֣�
			 * ps=cn.prepareStatement("create database JJ");
			ps=cn.prepareStatement("create table ee(a int,b int)");
			boolean g = ps.execute();//�����һ������� ResultSet �����򷵻� true�������һ������Ǹ��¼�������û�н�����򷵻� false 

			if(g){
				System.out.println("ִ�гɹ�");
			}else{
				System.out.println("ʧ��");//��ʵ��ִ�гɹ���
			}*/
			//���ݻ�ԭ��

//			ps = cn.prepareStatement("");
//			boolean g=ps.execute();
//			if(g){
//				System.out.println("ִ�гɹ�");
//			}else{
//				System.out.println("ʧ��");//��ʵ��ִ�гɹ���
//			}
//			backup();
			
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
	//����û���õ����ӣ�������DOS����ȥ���ݻ�ԭ��
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
