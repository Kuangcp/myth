package File;
/**
 * Unix 系统里，每行结尾只有“<换行>”，即“\n”；Windows系统里面，每行结尾是“<回车><换行>”，
 * 即“ \r\n”；Mac系统里，每行结尾是“<回车>”。
 * 一个直接后果是，Unix/Mac系统下的文件在Windows里打开的话，所有文字会变成一行；
 * 而Windows里的文件在Unix/Mac下打开的话，在每行的结尾可能会多出一个^M符号。
 */
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		File f = new File(Test.class.getResource("/b.txt").getPath());
//		URL d = FileReader.class.getResource("/b.txt");
//		File f = new File(d.getPath());
		
//		System.out.println(Test.class.getResource("/files/files.txt").getPath());
		try{
			RandomAccessFile s = new RandomAccessFile("h.txt","rw");
			s.seek(s.length());
			s.write("追加的内容！\r\n".getBytes());//   \r\n
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
