package park;

public interface IQueue {
	public void clear();//��ն���
	public boolean isEmpty();
	public int length();
	public Car peek();//��ʱ������Object
	public void offer(Car x);//�����׳��쳣  ���
	public  Car poll();//����
}
