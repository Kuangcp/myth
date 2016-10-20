package park;

/*
 * 没办法只能重新写一遍链栈的代码了 栈元素是Car
 */
 class Node {
	public Car car;//一个成员变量是车类
	public Node next;
	public Node (){
		this (null,null) ;
	}
	public Node(Car car){
		this(car,null);
	}
	public Node(Car car,Node next){
		this.car = car;
		this.next = next;
	}

 }
 
public class LinkStack {
		public Node top;//top只是指针而已
		public void clear(){
			top = null;
		}
		
		public int length(){//求链栈的长度
			int length=0;Node p=top;
			while (p!=null){
				length++;p = p.next;
			}
			return length;
		}
		
		public boolean isEmpty(){//判断链栈是否为空
			return top == null;
		}
		public Car peek(){//取栈顶元素
			if (!isEmpty()) return top.car;
			else return null;       //本该抛出异常的
		}
		public void push (Car car){//进栈
			
			Node p = new Node(car);
			 if (top != null)p.next = top;
			top = p;
		}
		public Car  pop(){//出栈
			Car a;
			a = top.car;
			top = top.next;
			return a;
		}
		public void display(){   //遍历链栈
			Node p = top;
			while(p!=null){
				System.out.print("->"+p.car.number);
				p = p.next;
			}
		}
		
}

