package Rewrite;

public class father {
	//  �����У�age sex name 
	
	public    int  age=42;
	public String  name = "����";
	boolean sex;
	
	public  int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
 /////////////////��̬��
	static {
		System.out.println("����ĳ�ʼ�������\n\n");
	}
/////////////////	
	void show(){
		System.out.println("�����show����");
	}
	public father(String name) {//������
		this.name = name;
	}

}
