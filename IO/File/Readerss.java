/**
 * 相对路径下读取文件，复制文件之类的操作
 */
package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * 读取文件  输出
 * 
 * InputStream   所有输入流基类（建立流）（字节流）
 * InputStreamReader 将字节流  转换成 字符流
 * BufferedReader  从字符流输入流读取文件 
 * 
 */
public class Readerss {

	public static void main(String[] args) {
		
		int count =0;
		
		InputStream input = null;
		InputStreamReader ids =null;
		BufferedReader br = null;
		//1 2 3 一层层封装起来

		
		
/**以下是字节流 Stream     */		
		// 通过相对路径 获取文件
		//  第一个/ 是表示bin目录下  如果是和当前类是同一个目录不加/
		
		input = FileReader.class.getResourceAsStream("/files/files.txt");//这是bin目录下的 src 也有。是一样的文件但是Test类添加的内容是bin下的
		//怎么访问到 file路径下的文件呢
		// 获取文件作为字节流
		// 表示该类的物理目录下的文件
		try {
			System.out.println("文件字节(byte)大小："+input.available()); //尝试能否找到打开 并且是获取字节数
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/**以下是字符流 Reader    */
		
		
		try {
		    ids = new InputStreamReader(input);
		    br = new BufferedReader(ids);
		    
		
		    String content = null;
			while((content = br.readLine())!=null){
				count++;
				//System.out.printf("%2d",count);
				System.out.println(count+"."+content);    /**加行标*/
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally {//从里到外的封装关系 来关闭流 一旦顺序错了就有莫名奇妙的错误  
			try {
				input.close();
				ids.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block 待办事项自动生成的catch块
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}

}
