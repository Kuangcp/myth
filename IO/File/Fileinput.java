package File;

import java.io.*;
public class Fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:\\File.txt");
		FileInputStream fis = null;
		//��ΪFileû�ж�д����������Ҫʹ��InputStream��
		try {
			 fis = new FileInputStream(f);
			
			//����һ���ֽ����� ������
			byte []bytes = new byte[1024];//���С�˻���װ���£��ͻ������һ��ѭ��
			int n=0;//ʵ�ʶ�ȡ�����ֽ���
			//ѭ����ȡ
			while((n=fis.read(bytes))!=-1){//��ʾδ����ĩβ
				//���ֽ�ת����String
				String s = new String(bytes,0,n);
				System.out.print(s);
//				System.out.println("\n*****");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر��ļ���
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
