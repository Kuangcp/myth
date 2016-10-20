package park;
/*
 * 链队列
 */
class N{
	int obj ;
	public N next;
}
public class LinkQueue {
	N front;                     //队首指针
    N rear ;                     //队尾指针
   public void create (){//创建队列
	    rear=front = new N();//初始化创建时要注意节点一定要有内存空间，否则后面就不能往节点写入数据
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
	public void offer(int x) {//入在队尾
		if (front !=null){
			N p = new N();
			rear.obj  = x;
		    rear.next = p;
		    rear = p;
		    rear.next = null;
		}
	}
	public int poll() {//出是在队首
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
