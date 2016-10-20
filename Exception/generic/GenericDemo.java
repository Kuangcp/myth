package generic;


class Demo <T>{
	public void show(T t){
		System.out.println("show"+t);
	}
	public <Q> void print(Q q){
		System.out.println("print:"+q);
	}
	public static <W> void method(W w){
		System.out.println("method:"+w);
	}
}

public class GenericDemo {

	public static void main(String[] args) {

		Demo <String>d = new Demo<String>();
		d.show("haha");
		d.print(5);
		//d.print(new Demo());
		d.print("hehe");
		
		Demo.method("hahaha");
	}

}
