package File;

import java.io.*;

public class FileOutput {


	public static void main(String []d){
		
		FileOutputStream fos = null;
		File f = new File("e:\\File.txt");
		
		
		try {
		    fos=new FileOutputStream(f);
		    
		    String s = "û��������\r\n";//Ҫ����һ�𣬱�ʾ�س�����
		    String s2 = "����";
			//�����ֽ�����
//		    byte [] buffer = new byte[1024];
		    //��String-��byte����
		    
			fos.write(s.getBytes());
			fos.write(s2.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
