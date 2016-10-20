/**
 * 复制文件 通过字节流
 */
package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//java.io 流// ImputStream // OutputStream  复制文件
        	
public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File s = new File("E:\\ad.txt");
		if (!s.exists()){
			throw new IOException(s.getCanonicalPath()+"不存在");
		}
		File d = new File ("F:\\jk");
		if (!d.exists()){
			d.mkdirs();//有s就是可以建立多个路径
		}
		
		d = new File(d,"q.txt"); 
		
		//s.listFiles();//s是目录就把目录下展开
		
		InputStream is =null;
		OutputStream os =null;
		try {
			is=new FileInputStream(s);
			os = new  FileOutputStream(d);
			byte [] Buffer = new byte[128];//字节流
			int length = -1;
			while((length=is.read(Buffer))!=-1){
				os.write(Buffer,0,length);//如果不加0和length好像也不会有错 这俩个是定界符
			}
			os.flush();//将管道里缓存的数据写入输出流的文件里 
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//关闭输入输出流资源
			if (is!=null) is.close();
			if (os!=null) os.close();
		}
		
	}

}









