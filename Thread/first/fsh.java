package first;

public class fsh extends Thread{


	private num n;
	public void setNum(num n){
		this.n = n;
	}
	
	//��д  �߳����е�������
	public void run (){
		n.disp();
	}
}
