package Exception;
import java.io.IOException;
/*
 * throw �Ӿ������׳��쳣
 * throws �Ӿ����ڴ����쳣
 * ������������
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
