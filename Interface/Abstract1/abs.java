package Abstract1;
/*
 * 抽象类有着接口类似的性质，但是却可以拥有接口所没有的普通成员，总之灵活一点，
 * 但是以我目前的水平还没得到应用
 */
abstract class MineBase{
	abstract void method();
	static int i;
}
public abstract class abs extends MineBase{
	//继承一个抽象类，本该重写抽象方法的，但是这里没有，虽然有编译错误，跑起来还是会正常输出
   //  如果这个子类也注明是抽象类，就不用重写method方法了
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] s = new int [5];
		 for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}

	}

	

}
