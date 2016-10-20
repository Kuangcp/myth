package GuanJi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuanLi extends JFrame implements ActionListener {

	JTextArea input;
	JButton bu1;
	JPanel j ,p;
	JTextField jtf[] = new JTextField[5];
	JLabel jl[] = new JLabel[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GuanLi();
		
	}
	public GuanLi(){
		input = new JTextArea();//不能添加在画板上
		for(int i=0;i<jtf.length;i++)
		    jtf[i] = new JTextField(10);//可以添加在画板上
		for(int i=0;i<jl.length;i++)
			jl[i] = new JLabel(""+i);
		bu1 = new JButton("退出");
		bu1.addActionListener(this);
		bu1.setActionCommand("退出");
		j = new JPanel();
		p = new JPanel();
		
		
		for(int i=0;i<jtf.length;i++)
		    j.add(jtf[i]);
		p.add(bu1);

		Runtime rt =  Runtime.getRuntime();
		try {
//	       rt.exec("shutdown.exe -s -t 40"); 40s后关机
//			rt.exec("at 23:00 shutdown.exe -s");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		this.add(j,BorderLayout.CENTER);
		this.add(p,BorderLayout.SOUTH);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getActionCommand().equals("退出")){
			String g = jtf[0].getText();
			System.out.println(g);
		}
	}

}
