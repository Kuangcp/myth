package first;

import java.util.Date;

public class num {
 
	 static int count;
	public void disp() {
		/*Date date = new Date();
		System.out.println("��ʼ����ʱ�䣺"+date.toLocaleString());
		for(int i=0 ;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+i);
				try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("���������ʱ��"+date.toLocaleString());*/
		
		// count = count+1;
		// System.out.println("disp����"+count);
		
		//�����Ա����������Ҫ���ǹ������⣬��һ�������ǻ���������
		//��Ҫ����Ļ���ü�����
		synchronized (this) {
			count = count+1;  
			System.out.println("disp����"+count);
		}
	}
	

}
