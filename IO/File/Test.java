package File;
/**
 * Unix ϵͳ�ÿ�н�βֻ�С�<����>��������\n����Windowsϵͳ���棬ÿ�н�β�ǡ�<�س�><����>����
 * ���� \r\n����Macϵͳ�ÿ�н�β�ǡ�<�س�>����
 * һ��ֱ�Ӻ���ǣ�Unix/Macϵͳ�µ��ļ���Windows��򿪵Ļ����������ֻ���һ�У�
 * ��Windows����ļ���Unix/Mac�´򿪵Ļ�����ÿ�еĽ�β���ܻ���һ��^M���š�
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
			s.write("׷�ӵ����ݣ�\r\n".getBytes());//   \r\n
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
