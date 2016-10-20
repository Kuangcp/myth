package stacks;
/*
 * ��ջ��topָ��ǰջ��Ԫ��
 * 
 */
public class LinkStack implements IStack{
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
	public int peek(){
		if (!isEmpty()) return top.data;
		else return -999;//�����׳��쳣��
	}
	public void push (int data){//��ջ
		//Node p = new Node(data,top);//p����top֮����
		Node p = new Node(data);
		 if (top != null)p.next = top;
		top = p;
	}
	public int  pop(){//��ջ
		int a;
		a = top.data;
		top = top.next;
		return a;
	}
	public void display(){//������ջ
		Node p = top;
		while(p!=null){
			System.out.print(p.data);
			p = p.next;
		}
	}
	public boolean found(char c){//��ջ�в���ָ���ַ�
		Node p = top;
		while (p!=null){
			if(p.data == c) return true;
			p = p.next;
		}
		return false;
	}
	/*public void display1(){
		if (!isEmpty()){
			do
			{
				System.out.print(top.data);
				top = top.next;//�����top���� �˸Ķ��������пպ�����Ӱ�죬����Ϊʲô������
			}while(top.next == null);
		}
	}*/
}
 

