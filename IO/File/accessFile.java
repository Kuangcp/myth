package File;

import java.io.File;
import java.io.RandomAccessFile;

public class accessFile {

	public static void main(String [] s)throws Exception{
		File a = new File("a.txt");
		RandomAccessFile raf = new RandomAccessFile(a,"rw");
		raf.seek(1024*1024*1024);//跳到指定位置
	}
}
