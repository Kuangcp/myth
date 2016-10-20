                                                               //实验报告题目——多态：
package duotai;
abstract class Animal{//抽象类
	abstract void eat();//抽象方法
}
//         
class Cat extends Animal{   // 默认 同包可以访问 

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫    吃鱼");
	}
	public void catchMouse(){
        System.out.println("猫  抓老鼠");
	}
}
class Dog extends Animal{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗 啃骨头");
	}
	public void kanjia(){
		System.out.println("狗  看家");
	}
}
class Pig extends Animal {

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猪 吃饲料");
	}
	public void gong(){
		System.out.println("猪  拱地");
	}
}
public class DuoTaiTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function (new Cat());
		function (new Dog());
		function (new Pig());
	}
	public static void function (Animal a){//这里就是和接口一样可以使用父类做接入，达到多态的目的
		a.eat();
		// a.catchMouse();   这是错误的，父类怎么可能拥有子类的方法
	}

}
