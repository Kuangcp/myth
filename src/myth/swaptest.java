package myth;
/*
 * java 里参数传递只有一种，值传递，也就是说将实际参数值的副本 传入方法内，而参数本身不会收到任何影响
 * 也就是说这里做的实验是没办法做到将两个传入的数据进行交换的
 */
class B{
	int b;
	public B(int c){//构造器
		b=c;
	}
}

public class swaptest {
	/*
	 * 怎么实现用函数来交换？？？？
	 */
	static void ss(B a,B m){//引用类型也没用！
		B temp = a;
		a=m;
		m=temp;
	}
	static void SWAP(int[] a, int[] b) {//这不是c 数组也不能实现交换实参数据
		int[] temp = a;
		a = b;
		b = temp;
	}

	static void s(int a, int b) {//使用 异或 来交换数据
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 函数开始");
		int c = 2, v = 9;
		
		s(c, v);  //在函数s中做到了交换数据，但是只是交换形参而已
		System.out.println(c+" "+v);//没有交换
		
		int[] a = { 3 }, b = { 4 };
		SWAP(a, b);
		System.out.println(a[0] +" " +b[0]  );//没有交换
		
		B a1 = new B(1);
		B b1 = new B(2);
		ss(a1,b1);
		System.out.println(a1.b +" "+ b1.b);//没有交换
	}

}
