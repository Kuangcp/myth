package File;

import java.io.*;

public class FileOutput {


	public static void main(String []d){
		
		FileOutputStream fos = null;
		File f = new File("e:\\File.txt");
		
		
		try {
		    fos=new FileOutputStream(f);
		    
		    String s = "没错，就是我\r\n";//要俩个一起，表示回车换行
		    String s2 = "呃呃";
			//定义字节数组
//		    byte [] buffer = new byte[1024];
		    //把String-》byte数组
		    
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
