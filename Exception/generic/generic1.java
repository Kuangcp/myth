package generic;
//ʹ�÷��;�Ҫ����Ҫ�� JRE 1.5  ������ȼ�1.6Ҳ�ܲ���
/*
 * ��1�� ���Ͱ�ȫ
 * ��2�� ������
 * ��3���������
 * ��4�����ܽϸ�
 */
import java.util.ArrayList;

class dog {
	private String name = "dog";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class cat {
	private String name = "cat";
}
public class generic1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<dog> a = new ArrayList<dog>();//������ǰ��Ķ�Ҫ�Ӽ�����
		//����һֻ��
		dog dog1 = new dog();
		a.add(dog1);
		//a.add(new cat());  ����ͻᱨ��
		dog t =  a.get(0);  // ����ǿת
		
		System.out.println(t.getName());
		//cat tt = (cat)a.get(0);//���� java.lang.ClassCastException:
		


	}

}
