package Rewrite;
                                                                       //ʵ�鱨���ϵ���Ŀ��
/*
 * ����ĸ��࣬����Ĺ����������� 
 *   ����ͨ������һ������������ģ���ʱ�����һ�����⣺�������� �ķ�����ȫһ�������Ծͳ����˸��ǵ�����
 * ������������� ������������� 1+2*2+8 =13
 * ���Ǿͻ�ó������Ľ�� 0*2+2*2+8*2 = 22
 */
class Base2{
	int i;
	Base2(){add(1);}    //������
	void add (int v){   // ��������ᱻ����ķ������ǣ������õ�һֱ��������Ǹ������������
		i+=v;
	}
	void print(){
		System.out.println(i);
	}
}
class Ex extends Base2{
	Ex(){add(2);}  
	//���������÷���������Ҫʵ�����Ϳ���ʹ��  �������÷�������Ҫʵ������ͨ������ȥ���ã������Ǿ�̬����
	void add (int v){
		System.out.println(i);
		i+=2*v;
	}
}

public class var_extends {
	public static void main(String [] args){
		eg(new Ex());
	}
	 static void eg(Base2 b){
		b.print();  //0+2+2*2
		b.add(8);
		b.print();//6+8*2
	}

}
