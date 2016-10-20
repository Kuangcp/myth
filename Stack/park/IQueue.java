package park;

public interface IQueue {
	public void clear();//清空队列
	public boolean isEmpty();
	public int length();
	public Car peek();//暂时不会用Object
	public void offer(Car x);//本该抛出异常  入队
	public  Car poll();//出队
}
