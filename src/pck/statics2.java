package pck;
/*
 * �������н����

        ����أ�
	main��ʼ
	ʵ���ĳ�ʼ�����ã�
	ʵ����ʼ��
	ʵ���ĳ�ʼ�����ã�
	ʵ����ʼ��
	mian����
	
 * ���ۣ�
 * ��̬��ʼ���飨���ʼ���飩�� ����ִ����ֻ��һ��
 * ��ͨ��ʼ���� ������ÿ�ι�������������֮ǰִ��
 * 
 */
public class statics2 {
    static {
		System.out.println("����أ�");
	}
	public statics2(){
		System.out.println("ʵ����ʼ��");
	}
	{
		System.out.println("ʵ���ĳ�ʼ�����ã�");
	}
	public static void main(String[] args) {
		System.out.println("main��ʼ");
		statics2 d1 = new statics2();
		 d1 = new statics2();
		 d1 = null;
		System.out.println("mian����");
	}

}
