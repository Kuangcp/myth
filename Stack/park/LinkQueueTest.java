package park;
/*
 * ���У��Ƚ��ȳ�
 */
public class LinkQueueTest {
	public static void main(String [] args){
		
		LinkQueue dl = new LinkQueue();
		dl.create();
		dl.offer(1);
		dl.offer(2);
		dl.offer(3);
		System.out.println("���У�"+dl.poll());
		dl.display();
	}

}
