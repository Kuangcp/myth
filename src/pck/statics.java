package pck;

public class statics {
	public static void main(String [] args){
		ui u =  new ui("a");
		/*
		ui uo = new ui("s");
		ui uop = new ui("d");
		ui uio = new ui("f");
		*/
		System.out.println("���󹲴����ˣ�"+ui.getcore()+"��"+"�����ǣ�"+u.name);
		//u.t();      //����:   �����ܵ����෽�������������и����棬Ҳ����˵  ����  ��������
		ui.t();       //��:   ������ȫ��ȷ��������������ķ���
		u.P();
		//ui.P(); �����಻�ܵ��÷Ǿ�̬����
		//ui.name = "kl";�����಻�ܵ��÷Ǿ�̬����
        //�ܽ᣺��ֻ�ܵ����෽���������ܵ���   �෽������ͨ����������Ҳ����ˣ�
		System.out.println("������");
	}

}
class ui{
	String  name;
	 static int core=0;
	 //�����������������ͳ�ƴ����˶��ٸ������ �������static���ڴ�λ�ö���һ��
	static{//����ʼ������飩��̬�����룬ֻ�ڹ�������������ʱ���ã���ֻ��ʵ��һ��
		System.out.println("��ľ�̬��");
	}
	public ui(String a){
		name = a;
	    core++;  
	}
	public static int getcore(){return core;}//�෽������ȡ�����
	void P(){System.out.println("��ͨ����");}
	static void t(){
		System.out.println("�෽��");
	}
}
/* ��ֻ�ܵ����෽���������ܵ���   �෽������ͨ����
 * ������Ҳ����ˣ�
 * ��̬����ֻ�ܷ��ʾ�̬�������Ǿ�̬�򶼿��Է���
 * �����ԭ���������෽��ȥ�����ͷ���
 * �����������һ�����ж��󶼹��������
 */
