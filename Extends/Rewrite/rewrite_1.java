package Rewrite;
/**
将子类的方法全部写成Object 再强转
实现接口？貌似做不到
 * @author  Myth
 * @date 2016年9月7日 上午7:59:19
 * @TODO
 */
public class rewrite_1 {
	public static void main(String [] args){
//		Sub1 s = new Sub1();
//		s.save(new test1());
		
		Base b = new Sub1();
		b.save(new test1());
		Base b2 = new Sub2();
		b2.save(new test2());
	}
	

}
class test1 {
	String a = "test1 a";
	public test1(){
		System.out.println("teset1 构造器");
	}
}
class test2 {
	String g="test2 g";
	public test2(){
		System.out.println("test2 构造器");
	}
}

class Base{
	public void save(Object obj){
		System.out.println("父类的save方法");
		System.out.println(obj.getClass());
	}
}

class Sub1 extends Base{
	public void save(Object obj) {
		//super.save(obj);
		test1 e = (test1)obj;
		System.out.println(e.a);
		System.out.println("sub1 子类的save方法");
		System.out.println(obj.getClass());
	}
}
class Sub2 extends Base{
	public void save(Object obj) {
		test2 e = (test2)obj;
		System.out.println(e.g);
		//super.save(obj);
		System.out.println("sub2 子类的save方法");
		System.out.println(obj.getClass());
	}
}