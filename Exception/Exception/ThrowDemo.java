package Exception;
import java.io.IOException;
/*
 * throw 子句用于抛出异常
 * throws 子句用于传播异常
 * 看不懂。。。
 */
public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String fileName :args){
			try 
			{	processFile(fileName);}
			catch (IOException e)
			{System.err.println(e);}
		}
	}
	public static void processFile(String toFile) throws IOException{
		//Omitted implementation propagates all 
		//thrown IOExceptions back to the caller
	}

}
