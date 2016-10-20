/**
 * ���±� �н���
 */
package NotePad;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Note extends JFrame implements ActionListener{

	//�����������
	JTextArea jta = null;
	//�˵���
	JMenuBar jmb = null;
	JMenu jm1 = null,jm2 = null;
	JMenuItem jmi1 = null,jmi2=null;
	JScrollPane jsp = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Note n = new Note();
	}

	public Note(){
		jta = new JTextArea();
		jmb = new JMenuBar();
		jm1 = new JMenu("��");
		jm2 = new JMenu("����");
		
		jm1.setMnemonic('F');
		jmi1 = new JMenuItem("��",new ImageIcon());//���Է�ͼƬ
		jmi2 = new JMenuItem("����");
		
		//ע�����
		jmi1.addActionListener(this);
		jmi1.setActionCommand("��");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("����");
		//����
		this.setJMenuBar(jmb);
		//��jm1����jmb
		jmb.add(jm1);
		jmb.add(jm2);
		//��item���뵽Menu
		jm1.add(jmi1);
		jm2.add(jmi2);
//		jm1.add(jmi2);
		
		jsp = new JScrollPane (jta);
		
		this.add(jsp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent N) {
		// TODO Auto-generated method stub
		if (N.getActionCommand().equals("��")){
//			System.out.println("��");
			
			//�Ƽ�JFileChooser ���
			JFileChooser jc = new JFileChooser();
			//��������
			jc.setDialogTitle("��ѡ���ļ�...");
			//Ĭ�Ϸ�ʽ
			jc.showOpenDialog(null);
			jc.setVisible(true);
			
			//��֪���û�ѡ����ļ� ����·��
			String filePath = jc.getSelectedFile().getAbsolutePath();
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(filePath));
				
				//���ļ���ȡ��Ϣ��ʾ��jta
				String s ="";
				String result = "";
				while((s=br.readLine())!=null){
					
					result+=s+"\r\n";
					
				}
				//�����jta
				jta.setText(result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			
		}
		else if (N.getActionCommand().equals("����")){
			System.out.println("����");
			//���ֱ���Ի���
			JFileChooser jc = new JFileChooser();
			jc.setDialogTitle("���Ϊ...");
			//��Ĭ�Ϸ�ʽ��ʾ
			jc.showSaveDialog(null);
			jc.setVisible(true);
			
			//�õ��û�ϣ�����ļ����浽�δ�
			String file = jc.getSelectedFile().getAbsolutePath();
			BufferedWriter bw = null;
			//׼��д�뵽ָ��Ŀ¼��
			try{
				bw = new BufferedWriter(new FileWriter(file));

				bw.write(this.jta.getText());
				
			}catch (Exception e){
				e.printStackTrace();
			}finally{
				try {
					bw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
	}
}

















