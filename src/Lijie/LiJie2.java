package Lijie;
import java.util.Timer;
import java.util.TimerTask;

public class LiJie2 {

	public static void g(String d,char[]s){
		for(int i=0;i<d.length();i++)
		s[i] = (char) (d.charAt(i)-5);
		
	}
	public static void p(char []f){
		for (int i=0;i<f.length;i++)
			System.out.print(f[i]);
		System.out.println();
	}
	
	public static void  ff(){
		String a1="Ijfw%Qn%Onj1%ny,x%fq|f~x%gjjs%f%mfuu~%ynrj";
	    char []as = new char[a1.length()];
	    g(a1,as);
	    p(as);
	    String b1 = "Qzhp%nx%fq|f~x%|nym%~tz3Rjww~%Hmwnxyrfx";
	    char []bs = new char[a1.length()];
	    g(b1,bs);
	    p(bs);
		int i,j,x,n=0;
	    char a=32,b=42,c=49;
		for(x=0;x<3;x++)
	    {
	        for(i=0;i<x+3;i++)
	        {
	          for(j=0;j<80;j++)
	          {
	          if(j<=25+n&&j>=25-n)
	          System.out.print(c);
	          else if((j%(n+6)==n)&&(j>25+n||j<25-n))
	          System.out.print(b);
	          else
	          System.out.print( a);
	          }
	          System.out.println();
	          n=n+2;
	        }
	        n=n-2*(x+2);
	    }
	    for(i=0;i<5;i++)
	    {
	        for(j=0;j<80;j++)
	        {
	          if(j>=22&&j<=28)
	          System.out.print(c);
	          else if((j%(n+6)==n)&&(j>25+n||j<25-n))
	          System.out.print(b);
	          else
	          System.out.print(a);
	        }
	        n=n+2;
	        System.out.println();
	    }
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<80;j++)
	        {
	          if(j%2==0)
	          System.out.print(b);
	          else
	          System.out.print(a);
	        }
	        System.out.println();
	    }
	}
	public static void aa() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                ff();
                
            }
        }, 5000);
    }
	public static void main(String[] args) {
		
		aa();
		String a1="Uqjfxj%|fny%kn{j%xjhtsix3";
	    char []as = new char[a1.length()];
	    g(a1,as);
	    p(as);
	    System.out.println("\n\n");
		   
		}

	}