package try_1;
/*���ļ�һ��Ҫע��Ҫ��finally����ر��ļ�  
 * ���û�ر����ļ��Ͳ��ᱣ��
 * finally һ��Źرյ���Դ  {}
*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;


public class try1 {
	public static void main(String [] args){//throws Exception
		//����쳣    ���ļ�  
		//FileReader fr = new FileReader("d\\aa.text");
		
		//       ����һ��192.168.12.12 ip�Ķ�  �ں�87 
		//Socket s = new Socket("192.168.1.23,78");
		
		//�����쳣   0������
		try {	
			Socket s = new Socket("192.168.1.23", 78);// �������ip �����Ͼ͵ȴ���ʱ�ٱ���
			//���׳��쳣�ĵط�����ִֹ��try
			FileReader fr = new FileReader("d\\aa.text");//��һ���쳣�׳��ʹ���������catchֹͣtry���ִ��
		
			
		} 
		catch (Exception e){
			System.out.println("�쳣");
			e.printStackTrace();
			
		} 
		finally {
			System.out.println("finally");
		}//  finally һ�㶼��õ�ִ�� ���������֣�
		//  1��finally�����쳣 2�����������߳����� 3����ǰ������System.exit() 4���ر�cpu
		System.out.println("try catch ������");
		
		/* catch (FileNotFoundException e) {
			//���쳣����Ϣ����������ų�bug
			e.printStackTrace();
		}
		catch (IOException e2){
			e2.printStackTrace();
		}*/
		
		try {
			int x = 44/0;
		}catch (Exception e){
			e.printStackTrace(); //�������ջ ��������������Դ�Ĵ���
			System.out.println("��������ȷ��ֵ");
		}finally {
			System.out.println("������������");
		}
		
	}

}
