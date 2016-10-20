package p1;
/**
 * public 都能访问
 * protect 子类（可以是别的包下），包 （主要是包内）
 * default 包 不能访问所修饰的对象的 对象成员（组合结构） 只有public可以
 * private 当前类或者内部类
 *
 * 如果在别的包下实例化 父类 就只能访问public修饰的成员，
 * 如果在别的包下用子类的构造器实例化，用父类来引用（多态）也是只能访问public,
 * 		但是之后对该对象进行强转后又能访问protected
 * 如果在别的包下实例化子类，就能访问public和protected
 */
public class A {
	public int v1 = 1;
	protected int v2 = 2;
	int v3 = 3;
	private int v4 = 4;//private一般要求使用setter和getter，不然会有警告
	
	public int getV4() {
		return v4;
	}
	
	public void setV4(int v4) {
		this.v4 = v4;
	}

}
