package jiekou;

class BY implements car{ //BYD实现了car接口 相当于给BYD再加上了一个类型，强调是car类型的 
	public String getName() {
		return "BYD";
	}
	public int getprice() {
		return 90;
	}
}

class h implements Bike{  // 实现了Bike接口  就是相当于说明是Bike类型的  
}
public class nonTest {

	public static void main(String[] args) {
		h bike = new h(); //实例化一个 继承了Bike接口的类
		BY byd = new BY();  //实例化一个继承了car类接口的类
		if (bike instanceof Bike){//  用instanceof 运算符来判断对象的接口（也可以用来判断类）是谁  
			                                 //这时候就是空接口发挥作用了，即使是不同的类，相同的接口就可以是一个相同的类型了
			System.out.println("这是一辆自行车");
		}
		if (byd instanceof car){
			System.out.println("这是一辆车");
		}

	}

}
