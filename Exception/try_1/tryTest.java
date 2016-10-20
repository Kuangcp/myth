package try_1;

import java.sql.Date;

public class tryTest {

	public static void main(String[] args) throws Exception{//这里注明了抛出异常后，下面才能抛出异常
		//并且可以知道：下面那个异常是被抛出main函数的，不是抛出catch块的
		// TODO Auto-generated method stub
		Date today = null;
		try {
			System.out.println("Begin ");
			today.toString();
			System.exit(0);
		}catch (Exception  e){
			System.out.println("Wrong");
			//throw e;//如果把这行注释掉，将得到不同的结果
		}finally {
			System.out.println("Finally");
		}
		System.out.println("End");

	}

}
