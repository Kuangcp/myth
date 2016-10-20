package park;
/*
 * 循环顺序队列构建
 */
public class Queue implements IQueue{
	Car [] Elem ;
	int front=0;
	int rear=0;
	
	public  Queue(int max){//初始化大小
		front = rear = 0;
		Elem = new Car[max];
	}
	
	public void clear() {
		front = rear =  0;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public int length() {
		return (rear - front + Elem.length)%Elem.length;
	}

	public Car peek() {
		if (front!= rear) return Elem[front];
		else return null;
	}

	public void offer(Car x) { //进队列
		if ( (rear+1)!=front ) Elem[rear++] = x;
		else System.out.println("超出队列范围");
	}

	public Car poll() {//出队列
		if (!isEmpty()) return Elem[front++];
		else return null;
	}
	public void display(){
		if (!isEmpty()){
			for (int i =front;i<rear;i++){
				System.out.print(Elem[i].number+" ");
			}
		}
		else System.out.println("该队列为空！");
	}
	

}
