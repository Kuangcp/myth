package File;

import java.io.Serializable;

public class student implements Serializable{//���л� �ӿ� ����ʵ�ַ���
	private String name;
	private String sdept;
	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//��дtoString����
	public String toString() {
		return "student [name=" + name + ", sdept=" + sdept + ", age=" + age
				+ "]";
	}
 
	
}
