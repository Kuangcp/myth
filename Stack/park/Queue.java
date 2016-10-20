package park;
/*
 * ѭ��˳����й���
 */
public class Queue implements IQueue{
	Car [] Elem ;
	int front=0;
	int rear=0;
	
	public  Queue(int max){//��ʼ����С
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

	public void offer(Car x) { //������
		if ( (rear+1)!=front ) Elem[rear++] = x;
		else System.out.println("�������з�Χ");
	}

	public Car poll() {//������
		if (!isEmpty()) return Elem[front++];
		else return null;
	}
	public void display(){
		if (!isEmpty()){
			for (int i =front;i<rear;i++){
				System.out.print(Elem[i].number+" ");
			}
		}
		else System.out.println("�ö���Ϊ�գ�");
	}
	

}
