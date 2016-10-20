package park;
/*
 * ������
 */
class N{
	int obj ;
	public N next;
}
public class LinkQueue {
	N front;                     //����ָ��
    N rear ;                     //��βָ��
   public void create (){//��������
	    rear=front = new N();//��ʼ������ʱҪע��ڵ�һ��Ҫ���ڴ�ռ䣬�������Ͳ������ڵ�д������
	    front.next= rear;
   }
	public void clear() {
		front= rear =null;
	}
	public boolean isEmpty() {
		return front == rear;
	}
	public int length() {
		int length=0;
		N f = front;
		if (!isEmpty())
			while (f!=null){
				f=f.next;
				length++;
			}
		return length;
	}
	public int peek() {
		if (front !=null)
		return front.obj;
		else return 0;
	}
	public void offer(int x) {//���ڶ�β
		if (front !=null){
			N p = new N();
			rear.obj  = x;
		    rear.next = p;
		    rear = p;
		    rear.next = null;
		}
	}
	public int poll() {//�����ڶ���
		int x;
		if (!isEmpty()){
			x=front.obj;
			front = front.next;
		    return x;
		}
		else return 0;
	}
	public void display(){
		N f = front;
		while (f.next != null ){
			System.out.print(f.obj);
			f = f.next;
		}
	}
}
