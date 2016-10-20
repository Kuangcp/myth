package Rewrite;
                                                                       //实验报告上的题目：
/*
 * 这里的父类，子类的构造器都特殊 
 *   都是通过调用一个函数来构造的，这时候就有一个问题：父类子类 的方法完全一样，所以就出现了覆盖的现象
 * 如果不发生覆盖 就是推理的那样 1+2*2+8 =13
 * 覆盖就会得出这样的结果 0*2+2*2+8*2 = 22
 */
class Base2{
	int i;
	Base2(){add(1);}    //构造器
	void add (int v){   // 这个方法会被子类的方法覆盖，所以用的一直是子类的那个方法来构造的
		i+=v;
	}
	void print(){
		System.out.println(i);
	}
}
class Ex extends Base2{
	Ex(){add(2);}  
	//构造器调用方法，不需要实例化就可以使用  方法调用方法就需要实例化在通过对象去调用，或者是静态访问
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
