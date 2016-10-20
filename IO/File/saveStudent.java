package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class saveStudent {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		student stu = new student();
		stu .setName("����");
	    stu.setAge(9);
	    stu.setSdept("��Ϣϵ");
		
		File stuB = new File("f:\\Ba.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		fos = new FileOutputStream(stuB);
	    oos = new ObjectOutputStream(fos);
		oos.writeObject(stu);
		
		
		FileInputStream fis  = new FileInputStream(stuB); //�β����ļ�ָ�� 
		ObjectInputStream ois = new ObjectInputStream(fis);///����������
		student stu1 = (student )ois.readObject();
		System.out.println(stu1);
		
		
		
	}

}
