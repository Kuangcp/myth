package generic;

import java.lang.reflect.Method;
                                  /*�������*/
public class Fanshe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <Bird> g = new Gen<Bird>(new Bird());
        g.showTypeName();
       
	}

}
//����һ������
class Bird {
	public void test1(){
		System.out.println("aa");
	}
	public void count(int a,int b){
		System.out.println(a+b);
	}
}
//����һ����
class Gen <T>{   // ��ߴ���������  ��ͨ�ñ�̺���
	private T o;
	public Gen(T a){  //���ι�����
		o=a;
	}
	//�õ�T����������
	public void showTypeName(){
		System.out.println("�����ǣ�"+o.getClass().getName());
		//ͨ��������ƣ����ǿ��Եõ�T������͵ĺܶ���Ϣ�������Ա��������
		
		Method []m = o.getClass().getDeclaredMethods();//Method �Ƿ�����������е�һ������
		for (int i = 0;i<m.length;i++){
			//  m[i].getName();//  �� . �����кö�ѡ�񣬿��Ի�úö���Ϣ
			System.out.println(m[i].getName());//��ӡBird�����еķ���
		}
		
	}
}