package File;

import java.io.File;
import java.net.URL;

public class a {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//��ȡURL
		URL url = a.class.getResource("/b.txt");
		System.out.println(url.getPath());
		File f = new File(url.getPath());//��װ�ɾ���·��
		System.out.println(f.getCanonicalPath());
		
	}

}
