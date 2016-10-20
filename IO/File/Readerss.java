/**
 * ���·���¶�ȡ�ļ��������ļ�֮��Ĳ���
 */
package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * ��ȡ�ļ�  ���
 * 
 * InputStream   �������������ࣨ�����������ֽ�����
 * InputStreamReader ���ֽ���  ת���� �ַ���
 * BufferedReader  ���ַ�����������ȡ�ļ� 
 * 
 */
public class Readerss {

	public static void main(String[] args) {
		
		int count =0;
		
		InputStream input = null;
		InputStreamReader ids =null;
		BufferedReader br = null;
		//1 2 3 һ����װ����

		
		
/**�������ֽ��� Stream     */		
		// ͨ�����·�� ��ȡ�ļ�
		//  ��һ��/ �Ǳ�ʾbinĿ¼��  ����Ǻ͵�ǰ����ͬһ��Ŀ¼����/
		
		input = FileReader.class.getResourceAsStream("/files/files.txt");//����binĿ¼�µ� src Ҳ�С���һ�����ļ�����Test����ӵ�������bin�µ�
		//��ô���ʵ� file·���µ��ļ���
		// ��ȡ�ļ���Ϊ�ֽ���
		// ��ʾ���������Ŀ¼�µ��ļ�
		try {
			System.out.println("�ļ��ֽ�(byte)��С��"+input.available()); //�����ܷ��ҵ��� �����ǻ�ȡ�ֽ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/**�������ַ��� Reader    */
		
		
		try {
		    ids = new InputStreamReader(input);
		    br = new BufferedReader(ids);
		    
		
		    String content = null;
			while((content = br.readLine())!=null){
				count++;
				//System.out.printf("%2d",count);
				System.out.println(count+"."+content);    /**���б�*/
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally {//���ﵽ��ķ�װ��ϵ ���ر��� һ��˳����˾���Ī������Ĵ���  
			try {
				input.close();
				ids.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block ���������Զ����ɵ�catch��
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}

}
