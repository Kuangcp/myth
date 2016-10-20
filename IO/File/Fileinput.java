package File;

import java.io.*;
public class Fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:\\File.txt");
		FileInputStream fis = null;
		//因为File没有读写的能力，需要使用InputStream流
		try {
			 fis = new FileInputStream(f);
			
			//定义一个字节数组 做缓存
			byte []bytes = new byte[1024];//如果小了缓存装不下，就会进入下一次循环
			int n=0;//实际读取到的字节数
			//循环读取
			while((n=fis.read(bytes))!=-1){//表示未到达末尾
				//把字节转换成String
				String s = new String(bytes,0,n);
				System.out.print(s);
//				System.out.println("\n*****");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭文件流
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
