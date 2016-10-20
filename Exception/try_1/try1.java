package try_1;
/*打开文件一定要注意要在finally里面关闭文件  
 * 如果没关闭那文件就不会保存
 * finally 一般放关闭的资源  {}
*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;


public class try1 {
	public static void main(String [] args){//throws Exception
		//检查异常    打开文件  
		//FileReader fr = new FileReader("d\\aa.text");
		
		//       连接一个192.168.12.12 ip的端  口号87 
		//Socket s = new Socket("192.168.1.23,78");
		
		//运行异常   0做除数
		try {	
			Socket s = new Socket("192.168.1.23", 78);// 连接这个ip 连不上就等待超时再报错
			//在抛出异常的地方就终止执行try
			FileReader fr = new FileReader("d\\aa.text");//有一个异常抛出就从这里跳到catch停止try块的执行
		
			
		} 
		catch (Exception e){
			System.out.println("异常");
			e.printStackTrace();
			
		} 
		finally {
			System.out.println("finally");
		}//  finally 一般都会得到执行 除了这四种：
		//  1）finally中有异常 2）程序所在线程死亡 3）在前面用了System.exit() 4）关闭cpu
		System.out.println("try catch 后的语句");
		
		/* catch (FileNotFoundException e) {
			//把异常的信息输出，利于排除bug
			e.printStackTrace();
		}
		catch (IOException e2){
			e2.printStackTrace();
		}*/
		
		try {
			int x = 44/0;
		}catch (Exception e){
			e.printStackTrace(); //输出错误栈 ，最上面的是最根源的错误
			System.out.println("请输入正确数值");
		}finally {
			System.out.println("程序正常运行");
		}
		
	}

}
