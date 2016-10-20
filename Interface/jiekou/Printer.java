package jiekou;
/* 接口的继承：
 * 程序实现了两个接口，看起来像是Printer类既是Output又是Product的子类，这就是Java提供的模拟多继承
 * Printer实现了两个接口，即可获取接口中的默认方法，因此Printer实例也可以调用接口的默认方法
 * 
 */
interface Product{
	int getProduceTime();
}
public class Printer implements Output,Product{
	private String [] printData = new String[MAX_CACHE];//直接使用接口的变量
	private int dataNum = 0;
	public void out (){
		//只要还有作业，就继续打印
		while (dataNum > 0){
			System.out.println("打印机打印："+printData[0]);
			System.arraycopy(printData,1,printData,0,--dataNum);//把作业队列整体前移以为，并将剩下的作业数减一
		}
	}
	public void getData(String msg){
		if (dataNum >= MAX_CACHE){
			System.out.println("输出队列已满，添加失败！");
		}
		else 
		{
			//把打印数据添加到队列里，已保存的数量加一
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个Printer对象，当成Output使用（多态）
		Output o = new Printer();
		o.getData("轻量级Java EE企业应用实战");
		o.out();
		o.getData("疯狂Java讲义");
		o.out();
		//调用Output接口中定义的默认方法
		o.print("孙悟空","猪八戒","白骨精");
		o.test();
		
		//o.staticTest();This static method of interface Output can only be accessed as Output.staticTest
		//System.out.println(Output.staticTest());
		//创建一个Printer对象，当成Product对象来使用（多态）
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋值给Object类型的变量
		Object opj = p;
	}
	public void print(String... msqs) {
		// TODO Auto-generated method stub
		
	}
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
