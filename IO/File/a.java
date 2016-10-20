package File;

import java.io.File;
import java.net.URL;

public class a {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//获取URL
		URL url = a.class.getResource("/b.txt");
		System.out.println(url.getPath());
		File f = new File(url.getPath());//封装成绝对路径
		System.out.println(f.getCanonicalPath());
		
	}

}
