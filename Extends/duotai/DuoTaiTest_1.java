                                                               //ʵ�鱨����Ŀ������̬��
package duotai;
abstract class Animal{//������
	abstract void eat();//���󷽷�
}
//         
class Cat extends Animal{   // Ĭ�� ͬ�����Է��� 

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è    ����");
	}
	public void catchMouse(){
        System.out.println("è  ץ����");
	}
}
class Dog extends Animal{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�� �й�ͷ");
	}
	public void kanjia(){
		System.out.println("��  ����");
	}
}
class Pig extends Animal {

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�� ������");
	}
	public void gong(){
		System.out.println("��  ����");
	}
}
public class DuoTaiTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function (new Cat());
		function (new Dog());
		function (new Pig());
	}
	public static void function (Animal a){//������Ǻͽӿ�һ������ʹ�ø��������룬�ﵽ��̬��Ŀ��
		a.eat();
		// a.catchMouse();   ���Ǵ���ģ�������ô����ӵ������ķ���
	}

}
