/**
 * 功能： File类的基本用法
 */
package File;

import java.io.*;

public class AboutFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建文件对象
//		File f = new File("e:\\ad.txt");
//		
//		//得到文件路径
//		System.out.println("文件路径:"+f.getAbsolutePath());
//		//得到字节大小
//		System.out.println("文件大小："+f.length()+"字节");
		/**
		 * 虽然只有89字节 但是它4kb，4kb的给你内存，所以占用了4069byte
		 */
		
		
		//创建文件
//		File f = new File("d:\\hsp.txt");
//		if(!f.exists()){
//			//可以创建
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else{
//			System.out.println("有文件，不能创建");
//		}
		
		//创建文件夹
//		File f = new File("d:\\ff");
//		if(f.isDirectory()){
//			System.out.println("文件夹已经存在");
//		}else {
//			//创建文件夹
//			f.mkdir();
//		}
		
//		列出文件夹下所有文件 只有一层 你可以通过递归来显示所有的文件
		File f = new File("d:\\baidu");
		if (f.isDirectory()){
			File list[] = f.listFiles();
			for (int i=0;i<list.length;i++){
				System.out.println("文件名："+list[i].getName());
			}
		}
		
		
		
		
		
		
		
	}

}
