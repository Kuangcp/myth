package first;

/**
 * �ӽ���������߳�1��2 ��ʱ��1����ʱ��2�ȣ�����i��ֵ������ȵģ�00 11 22 33 ....
 * ����ʲôԭ�� �����ĸ��̶߳������ 
 * �ѵ�����Ϊ���л��ƣ�
		�߳�1 0
		�߳�2 0
		�߳�1 1
		�߳�2 1
		�߳�1 2
		�߳�2 2
		�߳�1 3
		�߳�2 3

 * @author lenovo
 * �ܹ��ĸ��߳�
 * main���߳���������仰���������̵߳�����disp����������main��û���������߳̾Ϳ�ʼ�ˣ������߳̿�ʼʱ�䲻ȷ����ȫ��cpu����
			main��ʼ
			�߳�1
			�߳�2
			�߳�3
			disp����1
			disp����2
			main����
			disp����3
			
�������󣺲��Զ�ν������һ�������ǰ�ȫ��
 */
public class demo1 {

	public static void main(String[] args) {
		System.out.println("main��ʼ");
		// TODO Auto-generated method stub

		num j = new num();
		
		System.out.println("�߳�1");
		fsh t  = new fsh();
		t.setNum(j);
		t.setName("�߳�1 ");
		
		System.out.println("�߳�2");
		fsh t2 = new fsh();
		t2.setNum(j);
		t2.setName("�߳�2 ");
		
		System.out.println("�߳�3");
		fsh t3  = new fsh();
		t3.setNum(j);
		t3.setName("�߳�3 ");
		
		t.start();//��ʼһ���߳�
		t2.start();
		t3.start();
		//t3.start(); ��仰���Ϻ���Ȼ�����쳣�����������Ǽ������г�����ȷ���
		
		System.out.println("main����");
	}

}
