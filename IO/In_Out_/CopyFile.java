/**
 * �������·���ļ��ĸ�������
 */
/**
 * ��ȡ�ļ�  ���
 * 
 * InputStream   �������������ࣨ�����������ֽ�����
 * InputStreamReader ���ֽ���  ת���� �ַ���
 * BufferedReader  ���ַ�����������ȡ�ļ� 
 * 
 */
package In_Out_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class CopyFile {

	public static void main(String[] args) {
		InputStream input = null;
		BufferedReader br = null;
		InputStreamReader ids =null;
		BufferedWriter bw = null;
		OutputStream out = null;
		OutputStreamWriter os = null;
		
		
		try{
			input = new FileInputStream("./src/files/files.txt");
			ids = new InputStreamReader(input);
			br = new BufferedReader(ids);
			

			out = new FileOutputStream("./src/files/filess.txt");
			os = new OutputStreamWriter(out);
			bw = new BufferedWriter(os);

			
			
			bw.flush();//һ��Ҫ�������.
		
			String L="";
			while((L=br.readLine())!=null){
				bw.write(L+"\r\n");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("��ȡ�������쳣");
		}finally {
			try {
				//�ȴ򿪣���ر�
					input.close();
					ids.close();
					br.close();
				System.out.println("ȫ���ر���������");
				
			} catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("���쳣");
			}

			try {
				//�ȴ򿪣���ر�
				bw.close();
				os.close();
				out.close();
				System.out.println("�������ݲ��ҹر�ȫ�������");
			}catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("���쳣");
			}
		
		}
	}
}
