package park;

/*
 * û�취ֻ������дһ����ջ�Ĵ����� ջԪ����Car
 */
 class Node {
	public Car car;//һ����Ա�����ǳ���
	public Node next;
	public Node (){
		this (null,null) ;
	}
	public Node(Car car){
		this(car,null);
	}
	public Node(Car car,Node next){
		this.car = car;
		this.next = next;
	}

 }
 
public class LinkStack {
		public Node top;//topֻ��ָ�����
		public void clear(){
			top = null;
		}
		
		public int length(){//����ջ�ĳ���
			int length=0;Node p=top;
			while (p!=null){
				length++;p = p.next;
			}
			return length;
		}
		
		public boolean isEmpty(){//�ж���ջ�Ƿ�Ϊ��
			return top == null;
		}
		public Car peek(){//ȡջ��Ԫ��
			if (!isEmpty()) return top.car;
			else return null;       //�����׳��쳣��
		}
		public void push (Car car){//��ջ
			
			Node p = new Node(car);
			 if (top != null)p.next = top;
			top = p;
		}
		public Car  pop(){//��ջ
			Car a;
			a = top.car;
			top = top.next;
			return a;
		}
		public void display(){   //������ջ
			Node p = top;
			while(p!=null){
				System.out.print("->"+p.car.number);
				p = p.next;
			}
		}
		
}

