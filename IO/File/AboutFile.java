/**
 * ���ܣ� File��Ļ����÷�
 */
package File;

import java.io.*;

public class AboutFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����ļ�����
//		File f = new File("e:\\ad.txt");
//		
//		//�õ��ļ�·��
//		System.out.println("�ļ�·��:"+f.getAbsolutePath());
//		//�õ��ֽڴ�С
//		System.out.println("�ļ���С��"+f.length()+"�ֽ�");
		/**
		 * ��Ȼֻ��89�ֽ� ������4kb��4kb�ĸ����ڴ棬����ռ����4069byte
		 */
		
		
		//�����ļ�
//		File f = new File("d:\\hsp.txt");
//		if(!f.exists()){
//			//���Դ���
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else{
//			System.out.println("���ļ������ܴ���");
//		}
		
		//�����ļ���
//		File f = new File("d:\\ff");
//		if(f.isDirectory()){
//			System.out.println("�ļ����Ѿ�����");
//		}else {
//			//�����ļ���
//			f.mkdir();
//		}
		
//		�г��ļ����������ļ� ֻ��һ�� �����ͨ���ݹ�����ʾ���е��ļ�
		File f = new File("d:\\baidu");
		if (f.isDirectory()){
			File list[] = f.listFiles();
			for (int i=0;i<list.length;i++){
				System.out.println("�ļ�����"+list[i].getName());
			}
		}
		
		
		
		
		
		
		
	}

}
