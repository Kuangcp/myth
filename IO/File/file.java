/**
 * �����ļ� ͨ���ֽ���
 */
package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//java.io ��// ImputStream // OutputStream  �����ļ�
        	
public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File s = new File("E:\\ad.txt");
		if (!s.exists()){
			throw new IOException(s.getCanonicalPath()+"������");
		}
		File d = new File ("F:\\jk");
		if (!d.exists()){
			d.mkdirs();//��s���ǿ��Խ������·��
		}
		
		d = new File(d,"q.txt"); 
		
		//s.listFiles();//s��Ŀ¼�Ͱ�Ŀ¼��չ��
		
		InputStream is =null;
		OutputStream os =null;
		try {
			is=new FileInputStream(s);
			os = new  FileOutputStream(d);
			byte [] Buffer = new byte[128];//�ֽ���
			int length = -1;
			while((length=is.read(Buffer))!=-1){
				os.write(Buffer,0,length);//�������0��length����Ҳ�����д� �������Ƕ����
			}
			os.flush();//���ܵ��ﻺ�������д����������ļ��� 
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//�ر������������Դ
			if (is!=null) is.close();
			if (os!=null) os.close();
		}
		
	}

}









