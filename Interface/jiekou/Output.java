package jiekou;
/*
 * ʹ�ýӿڣ�
 *  1�����������Ҳ��ʹ���ڽ���ǿ������ת��
 *  2�����ýӿ��ж���ĳ���
 *  3����������ʵ��
 *  
 *  �ӿڵĳ�Ա���� �Զ���� public static final ���η�
 *  �ӿڵķ���ֻ���ǣ����󷽷����෽������Ĭ�Ϸ�������ͨ�����ǲ���ʵ�ֵģ������෽������ʵ�֣��з����壩
 *  �ӿ���ķ��� ���Զ����public abstract ���η�
 */
public interface Output {
	
	//����˵�ӿ�����ķ����ǿ����з������ô���������û����
	//�ӿ��ﶨ��ĳ�Աֻ���ǳ���  Ĭ�ϼ���final���η�
	int MAX_CACHE = 20;
	//�ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	void out();
	void getData(String msq);
	void print(String ...msqs);/*{
		for (String msq :msqs) System.out.println(msq);
	}*/
	 void test();/*{
		System.out.println("Ĭ�ϵ�test����");
	}*/
	//�ڽӿ��п��Զ����෽��(Java8����)����Ҫʹ��static����(�����˾ͱ�����)
	//static String Test();/*{//��̬�ļ���ķ�����ֻ��ͨ���ӿ�������
		//����������Illegal modifier for the interface method staticTest; only public & abstract are permitted
		//return "�ӿ���ķ���";
	//}*/

}
