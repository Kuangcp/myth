package jiekou;

class BY implements car{ //BYDʵ����car�ӿ� �൱�ڸ�BYD�ټ�����һ�����ͣ�ǿ����car���͵� 
	public String getName() {
		return "BYD";
	}
	public int getprice() {
		return 90;
	}
}

class h implements Bike{  // ʵ����Bike�ӿ�  �����൱��˵����Bike���͵�  
}
public class nonTest {

	public static void main(String[] args) {
		h bike = new h(); //ʵ����һ�� �̳���Bike�ӿڵ���
		BY byd = new BY();  //ʵ����һ���̳���car��ӿڵ���
		if (bike instanceof Bike){//  ��instanceof ��������ж϶���Ľӿڣ�Ҳ���������ж��ࣩ��˭  
			                                 //��ʱ����ǿսӿڷ��������ˣ���ʹ�ǲ�ͬ���࣬��ͬ�ĽӿھͿ�����һ����ͬ��������
			System.out.println("����һ�����г�");
		}
		if (byd instanceof car){
			System.out.println("����һ����");
		}

	}

}
