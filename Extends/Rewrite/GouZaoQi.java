package Rewrite;
/*
 * ������Ǽ̳е�״̬�µĹ�����ʵ�ֵ�״̬
 * ����ʵ�־�̬��ʼ����һ�Σ�Ȼ��ÿ��ʹ�ù�����ʱʵ����ͨ��ʼ��һ�� �Ӹ��ൽ���� ��˳����ʵ��
 * ������ô���ü�Ӹ���Ĺ�����������
 
 */


/* 
 * ���н����
 * ��һ�δ�������::::::::::

Root �ľ�̬��ʼ����
Mid  �ľ�̬��ʼ����
Leaf �ľ�̬��ʼ����

Root ����ͨ��ʼ����   //��˳����
Root ���޲ι�����
Mid ����ͨ��ʼ����
Mid ���޲ι�����
Mid ���вι�����������ֵΪ�����Java����
Leaf ����ͨ��ʼ����
ִ��Leaf �Ĺ�����


�ڶ��δ�������::::::::::

Root ����ͨ��ʼ����
Root ���޲ι�����
Mid ����ͨ��ʼ����
Mid ���޲ι�����
Mid ���вι�����������ֵΪ�����Java����
Leaf ����ͨ��ʼ����
ִ��Leaf �Ĺ�����
 */
class Root {
	static {
		System.out.println("Root �ľ�̬��ʼ����");
	}
	{
		System.out.println("Root ����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root ���޲ι�����");
	}
	public Root(String m){
		System.out.println("Root �ĺ��ι����� ����Ϊ��"+m);
	}
}

class   Mid extends Root {
	static {
		System.out.println("Mid  �ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid ����ͨ��ʼ����");
	}
	public Mid(){
		System.out.println("Mid ���޲ι�����");
	}
	public Mid(String msg){
		// ͨ��this����ͬһ�������صĹ�����
		this ();//���Բ�Ҫ��仰���һ�������֣�һ��������Ҫ�޲ι���һ�θ����
		System.out.println("Mid ���вι�����������ֵΪ��"+msg);
	}
}
class Leaf extends Mid{
	static {
		System.out.println("Leaf �ľ�̬��ʼ����\n");
	}
	{
		System.out.println("Leaf ����ͨ��ʼ����");
	}
	public Leaf(){
		//  ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("���Java����");                     //ʹ����ֱ�Ӹ���Mid�Ĺ�����
		//���˵�ǰ�����˳����ִ�еĻ���Ӧ�������Leaf����ͨ��ʼ������� �ٽ���Mid�ĺ��ι�����
		// Ȼ�����ﲢ���ǣ����ǽ�����Ĺ�����ȫִ������ʹ������ģ������Ǹ����๹������������Ĺ�������
		System.out.println("ִ��Leaf �Ĺ�����\n\n");
	}
}
public class GouZaoQi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��һ�δ�������::::::::::\n");
		new Leaf();
		System.out.println("�ڶ��δ�������::::::::::\n");
		new Leaf();

	}

}
