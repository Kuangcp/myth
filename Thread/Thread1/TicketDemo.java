package Thread1;

class Ticket implements Runnable {

	private int tick =1000;
	Object obj = new Object();
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			if (tick>0){
				System.out.println(Thread.currentThread().getName()+"...sale"+tick--);
				
			}
		}
	}
}
public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
