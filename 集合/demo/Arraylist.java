package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 *  1 ����Ա��ʱ���뵽����ϵͳ
 *  2 ���Ը��Ա���ţ���ʾԱ����Ϣ
 *  3 ������ʾ����Ա����Ϣ
 *  4 �����޸�Ա��нˮ
 *  5 ��Ա����ְʱ������Ա��ɾ��
 *  6 ��нˮ�ӵ͵�������˼���⣩
 *  7 ����ͳ��Ա����ƽ���ʺ���ͺ���߹���
 */
public class Arraylist {

	public static void main(String[] args) throws IOException {//ֱ���׳��쳣
		// TODO Auto-generated method stub
		EmpManage em = new EmpManage();
		//����һ��buffer������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			System.out.println("=================");
			System.out.println("|||��������Ҫ���еĲ���: ");
			System.out.println("|||1����ʾ���һ����Ա:  ");
			System.out.println("|||2����ʾ����һ����Ա: ");
			System.out.println("|||3���޸�һ����Ա����: ");
			System.out.println("|||4����ʾɾ��һ����Ա:   ");
			System.out.println("=================");
			
			String operType  = br.readLine();
			switch (operType){
			case "1":{
				System.out.println("�������ţ�");
				String empNo = br.readLine();
				System.out.println("���������֣�");
				String name = br.readLine();
				System.out.println("�����빤�ʣ�");
				float sal = Float.parseFloat(br.readLine());//��buffer������float��ݵķ���
				Emp emp = new Emp(empNo,name,sal);
				em.addEmp(emp);
			}break;
			case "2":{
				System.out.println("�������ţ�");
				String empNo  =  br.readLine();
				
				em.showInfo(empNo);
			}break;
			case "3":{
				System.out.println("�������ţ�");
				String empNo  =  br.readLine();
				System.out.println("������Ҫ��ĵĹ��ʣ�");
				float newSal = Float.parseFloat(br.readLine());
				em.updateSal(empNo, newSal);
			}break;
			case"4":{
				System.out.println("�������ţ�");
				String empNo  =  br.readLine();
				em.delEmp(empNo);
			}break;
			default : System.exit(0);break;
			}
		}

	}

}
//��Ա������
class EmpManage{
	private ArrayList a1 = null;
	//����
	public EmpManage(){
		a1 = new ArrayList();
	}
	
	//����Ա��
	public void addEmp(Emp emp){
		a1.add(emp);
	}
	
	//��ʾĳ��Ա���������Ϣ
	public void showInfo(String empNo){boolean flag =false;
		//�������ArrayList
		for (int i=0;i<a1.size();i++){
			//ȡ������
			Emp  emp=(Emp)a1.get(i);
			if (emp.getEmpNo().equals(empNo)){//�Ƚϱ��
				flag =true;
				System.out.println("�ҵ���Ա���������Ϣ�ǣ�");
				System.out.println("��� = "+empNo);
				System.out.println("���� = "+emp.getName());
				System.out.println("нˮ = "+emp.getSal());
			}
		}
		if (!flag){
			System.out.println("���޴���");
		}
	}
	
	//�޸Ĺ���
	public void updateSal(String empNo,float newSal){
		for (int i=0;i<a1.size();i++){
			Emp emp = (Emp)a1.get(i);
			if (emp.getEmpNo().equals(empNo)){
				//�޸�нˮ
				emp.setSal(newSal);
			}
		}
	}
	
	//ɾ��ĳ��Ա��
	public void delEmp(String empNo){boolean flag=false;
		for (int i=0;i<a1.size();i++){
			Emp emp  = (Emp)a1.get(i);
			if (emp.getEmpNo().equals(empNo)){
				flag =true;
				//ɾ��Ԫ��
				a1.remove(i);
				//a1.remove(emp);  Ҳ��������ɾ��
			}
		}
		if (!flag){
			System.out.println("���޴���");
		}
	}
}
//��Ա��
class Emp{
	private String empNo;
	private String name;
	private float sal;
	
	public Emp(String empNo,String name,float sal){//������
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}