package try_1;

public class ExceptionDemo1 {

	public static void main(String[] args){  //  可以加上 throws FushuException
		// TODO Auto-generated method stub
		Demo d  = new Demo();
		try {
			int x = d.div(4, -9);
			System.out.println("x="+x);
		}catch (FushuException F){
			
			System.out.println(F.toString());
			System.out.println(" 除数出现了负数");
			System.out.println("错误的负数是："+F.getvalue());
		}
		System.out.println("over");

	}

}
