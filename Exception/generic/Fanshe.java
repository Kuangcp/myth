package generic;

import java.lang.reflect.Method;
                                  /*反射机制*/
public class Fanshe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <Bird> g = new Gen<Bird>(new Bird());
        g.showTypeName();
       
	}

}
//定义一个鸟类
class Bird {
	public void test1(){
		System.out.println("aa");
	}
	public void count(int a,int b){
		System.out.println(a+b);
	}
}
//定义一个类
class Gen <T>{   // 提高代码重用率  和通用编程好像
	private T o;
	public Gen(T a){  //含参构造器
		o=a;
	}
	//得到T的类型名称
	public void showTypeName(){
		System.out.println("类型是："+o.getClass().getName());
		//通过反射机制，我们可以得到T这个类型的很多信息（比如成员函数名）
		
		Method []m = o.getClass().getDeclaredMethods();//Method 是反射机制里特有的一个类型
		for (int i = 0;i<m.length;i++){
			//  m[i].getName();//  点 . 后面有好多选择，可以获得好多信息
			System.out.println(m[i].getName());//打印Bird类所有的方法
		}
		
	}
}