/**
 * 这里是图片移动的功能模块
 */
package PingTu;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Move {

	static int count=0;
	Image temp = null;
	Image im0 = null;
	int x0,y0, position;
	
	//控制移动
	
//		 im0=(new ImageIcon("images/h/8.jpg").getImage());//images/h/
	public Move(){
		try {
			 im0=(new ImageIcon("../T/8.jpg").getImage()); //创建一个对象（对象没销毁就一直可以用。图片一直在）
//			im0 = ImageIO.read(getClass().getResource("/T/8.jpg"));//只是单纯的读取（只有一次）
//			im0=(new ImageIcon("GUI\\JiuGong\\T\\8.jpg")).getImage();
//			im0=ImageIO.read(new File("8.jpg"));
//			 im0=(new ImageIcon(ImageIO.read(getClass().getResource("/T/8.jpg")))).getImage(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	/** 上 */
	    public  void moveW(){
	    	for(int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).im.equals(im0)) {
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y); 
	    			x0=game.TU.get(i).x; 
					y0=game.TU.get(i).y;
					position=game.TU.get(i).position;
	    		}
	    	}
	    	for (int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).x-1 == x0 && game.TU.get(i).y == y0){
	    			temp = game.TU.get(i).im;
	    			game.TU.get(i).im = game.TU.get(position).im;
	    			game.TU.get(position).im = temp;
	    			break;
	    		}
	    	}
	    	System.out.println(++count);
		}
	/** 下 */
		public void moveS(){
			for(int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).im.equals(im0)) {
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			x0=game.TU.get(i).x; 
					y0=game.TU.get(i).y;
					position=game.TU.get(i).position;
	    		}
	    	}
//			System.out.println("x "+x0+" y "+y0+" p "+position);
	    	for (int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).x+1 == x0 && game.TU.get(i).y==y0){
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			temp = game.TU.get(i).im;
	    			game.TU.get(i).im = game.TU.get(position).im;
	    			game.TU.get(position).im = temp;
	    			break;
	    		}
	    	}
	    	System.out.println(++count);
		}
	/** 左 */
		public void moveA(){
			for(int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).im.equals(im0)) {
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			x0=game.TU.get(i).x; 
					y0=game.TU.get(i).y;
					position=game.TU.get(i).position;
	    		}
	    	}
//			System.out.println("x "+x0+" y "+y0+" p "+position);
	    	for (int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).y-1 == y0 && game.TU.get(i).x==x0){
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			temp = game.TU.get(i).im;
	    			game.TU.get(i).im = game.TU.get(position).im;
	    			game.TU.get(position).im = temp;
	    			break;
	    		}
	    	}
	    	System.out.println(++count);
		}
	/** 右 */
		public void moveD(){
			for(int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).im.equals(im0)) {
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			x0=game.TU.get(i).x; 
					y0=game.TU.get(i).y;
					position=game.TU.get(i).position;
	    		}
	    	}
//			System.out.println("x "+x0+" y "+y0+" p "+position);
	    	for (int i=0;i<game.TU.size();i++){
	    		if (game.TU.get(i).y+1 == y0 && game.TU.get(i).x==x0){
//	    			System.out.println("game.TU.get(i).x = "+game.TU.get(i).x+"game.TU.get(i).y = "+game.TU.get(i).y);
	    			temp = game.TU.get(i).im;
	    			game.TU.get(i).im = game.TU.get(position).im;
	    			game.TU.get(position).im = temp;
	    			break;
	    		}
	    	}
	    	System.out.println(++count);
		}
}
