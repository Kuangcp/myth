package In_Out_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * �ı��ļ��Ŀ����� �ֽ��������ַ���   �����ļ�ֻ���ֽ���
 * 
 *�������3��������ʽ:
 *    
 *    
 *    ע�⣺��û�йرյĻ������±���Ҳû�ж���
 */
public class Stream {

/**�ַ���*/
	//���� char
	/*public static void main(String [] j){
		
		FileReader fr = null; //������
		FileWriter fw = null; //�����
		
		try {
			//�����������
			fr = new FileReader("E:File.txt");
			//�����������
			fw = new FileWriter("D:File.txt");
			//�����ڴ�
			char p[] = new char[512];
			int n=0;
			while((n=fr.read(p))!=-1){
//				fw.write(p);//����512�ַ��Ļ����������
				fw.write(p,0,n);//ָ��0-n����
//				String f  = new String(p, 0, n);
//				System.out.println(f);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}*/
	
	
	
/**�ֽ���*/
	//�����ֽ�byte
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("E:File.txt");
			fos = new FileOutputStream("D:File.txt");
			
			byte [] buffer = new byte[1024];
			int n = 0;
			while((n=fis.read(buffer))!=-1){
				//�Ѿ�������������1024�ֽ�
				//�����ָ���ļ�
				fos.write(buffer);
			}
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			// TODO: handle finally clause
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}*/
	/**�����ַ���*/
	//��ȡһ�� \r ���� \n ����  \r:�س���return��\n�����У�nextLine��
	//BufferReader �� BufferWriter ֱ�Ӳ���String

	public static void main(String [] e){
		
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			//�Ƚ���Reader �ٷ�װ��BufferReader
//			FileReader fr = new FileReader("E:File.txt");
//			br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("E:File.txt"));
			//����FileWriter����
			bw = new BufferedWriter(new FileWriter("D:Fil.txt"));
			//ѭ����ȡ�ļ�
			String s = "";
			while((s=br.readLine())!=null){
				System.out.println(s.substring(0, 1));
				//���
				bw.write(s+"\r\n");
			}
			System.out.println("\n�ɹ���ȡ��д��");
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
	}
}
