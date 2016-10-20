package PingTu;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 2016/1/1 19:00开始敲第一行代码
 * 拼图游戏 有图片
 * 奖一个图片包装成一个类 
 * 基本完成，已经可以做到简单的移动
 *   但是：还需要加入
 *      
 *       每次进入游戏随机分配一套图片，或者自己选择
 *       提供完整图片的缩略图来参考
 *       计时器 
 *       计步器
 *       成功判断机制
 *       排行榜机制
 *       图片存储相对路径的熟练使用，才能打包出去运行
 *  键盘监听 和鼠标点击 冲突 解决方案？？？
 *  按钮的布局问题。。。
 *  
 */
@SuppressWarnings("serial")
public class game extends JFrame{

//	Vector <JLabel>tu;  集合更好些 只是不太会用
	
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
	JButton jb1;
	static Panelp jp1,jp2;
	button Button;
	static Vector<Part> TU = new Vector<Part>();
	Part p ;
	
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		game j = new game();
	}

	public game(){
		for (int i=0;i<Part.MAX*Part.MAX;i++){
			p = new Part(i/Part.MAX,i%Part.MAX,i);//构造时便传入x y坐标
			TU.add(p);
		}
		
		Button = new button();
		jb1 = new JButton ("开始游戏");
		jb1.addActionListener(Button);//注册监听
		jb1.setActionCommand("开始");//指定特定的命令
		
		jp2 = new Panelp();
		jp2.add(jb1,BorderLayout.SOUTH);
		
		jp1 = new Panelp();
		jp1.setSize(800,600);
		//设置监听 不过为什么是要写当前对象，而不是写jp画板呢
		//事件源是JFrame 事件监听者是jp1
		this.addKeyListener(jp1);
		
		this.add(jp2,BorderLayout.CENTER);
//		this.add(jp2,BorderLayout.SOUTH);
		//加上按钮的监听后，键盘监听就失效了。？？？
//		jp.add(jb1,BorderLayout.SOUTH);
//		this.setSize(597, 615);
		this.setSize(750, 730);
		this.setLocation(600,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		for (int i=0;i<80;i++){
			Move k = new Move();
			int dir;
			dir = (int)Math.random()*5;
			switch(dir){
			case 1:k.moveA(); break;
			case 2:k.moveD();break;
			case 3:k.moveS();break;
			case 4:k.moveW();break;
			default:break;
			}
		}
	}
	
	
}
//每部分的图片类
class Part {
	static int MAX=3; //拼图的行列规格
	int x=0;
	int y=0;
	int position;
	JLabel l;
	Image im;
	
	public Part(int x,int y,int position){
		this.x = x;
		this.y = y;
		this.position  = y+MAX*x;
//		String path = "PTGame/T/";
		
		/*try {
			im=(new ImageIcon(position+".jpg")).getImage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
/** 图片路径问题*/
//		im = (new ImageIcon("images/h/"+position+".jpg").getImage());//"images/h/"+
		im = (new ImageIcon("../T/"+position+".jpg").getImage());//失败 

//		try {
//			im = ImageIO.read(getClass().getResource("/T/"+position+".jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
//对按钮监听的类
class button implements ActionListener{
	public void actionPerformed(ActionEvent e) {
//		System.out.println("开始监听按钮的点击");
		if (e.getActionCommand().equals("开始")){
			System.out.println("开始游戏");
		}
	}
}

/*失败的尝试
int x0,y0,position;
public void moveW(){
	x0 = -1;y0 = -1;position = 0;
	for (int i=0;i<game.TU.size();i++){
		try {
			if (game.TU.get(i).l.getText().equals(" ")){ 
				x0=game.TU.get(i).x; 
				y0=game.TU.get(i).y;
				position=game.TU.get(i).position;
			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("没找到");
			continue;
		}
		System.out.println("X="+x0+" Y="+y0);
	}
	for (int i=0;i<game.TU.size();i++){
		if ((game.TU.get(i).y-1) == y0){
			temp = game.TU.get(i);
			game.TU.set(i, game.TU.get(position));
			game.TU.set(position, temp);
			
		}
	}
	for(int i=0;i<9;i++){
		game.jp.add(game.TU.get(8-i).l);
	}
}

		//设置网格布局
/*		jp.setLayout(new GridLayout(3,3));
		
		//加入图片
		TU.get(0).l = new JLabel(new ImageIcon("images/h/11_0.jpg"));
		TU.get(1).l = new JLabel(new ImageIcon("images/h/11_1.jpg"));
		TU.get(2).l = new JLabel(" "); //设置空白格  不能直接就赋值一个null 会报错空指针异常
//		TU.get(2).l = new JLabel(new ImageIcon("images/h/11_2.jpg"));
		TU.get(3).l = new JLabel(new ImageIcon("images/h/11_3.jpg"));
		TU.get(4).l = new JLabel(new ImageIcon("images/h/11_4.jpg"));
		TU.get(5).l = new JLabel(new ImageIcon("images/h/11_5.jpg"));
		TU.get(6).l = new JLabel(new ImageIcon("images/h/11_6.jpg"));
		TU.get(7).l = new JLabel(new ImageIcon("images/h/11_7.jpg"));
		TU.get(8).l = new JLabel(new ImageIcon("images/h/11_8.jpg"));
		
		for(int i=0;i<9;i++){
			jp.add(TU.get(i).l);
		}
		*/
//		if (TU.get(2).l.getText().equals(" ")) System.out.println(" 空白格可以判断");//如果是空白格就能运行，否者就会抛空指针异常



