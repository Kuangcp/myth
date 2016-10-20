package try_1;
/*
 * 异常也是一个类 可以自定义一个一异常 只要继承了Exception就可以了
 * 它也有构造函数 可以来初始化异常信息
 */
public class FushuException extends Exception{
	private int value;
	FushuException(){
		super();
	}
	FushuException (String msg,int value){
		super(msg);
		this.value = value;
	}
	public int getvalue(){
		return value;
	}

}
