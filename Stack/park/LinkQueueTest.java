package park;
/*
 * 队列：先进先出
 */
public class LinkQueueTest {
	public static void main(String [] args){
		
		LinkQueue dl = new LinkQueue();
		dl.create();
		dl.offer(1);
		dl.offer(2);
		dl.offer(3);
		System.out.println("出列："+dl.poll());
		dl.display();
	}

}
