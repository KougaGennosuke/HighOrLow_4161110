import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighOrLow00 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
	    int num=0;
	    int count;

	    try{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("発展！1から100までの数字を当てろ！");
	      for(count=0;num!=answer;count++){
	        System.out.print("数字に魂を込めろ！: ");
	        num=Integer.parseInt(br.readLine());
	        if(num<answer)
	          System.out.println("上だ！");
	        else if(num>answer)
	          System.out.println("下よ");
	      }
	      System.out.println("BOUNUS確定"+count+"G");
	      if(count < 3)
	    	  System.out.println("お前が第69代北斗神拳伝承者か…");
	      else if(count <50)
	    	  System.out.println("あれ、間違えたかな？俺の求める北斗神拳伝承者はまだ遠い");
	      else if(count > 100)
	    	  System.out.println("お前はもう死んでいる");
	    }
	    catch(NumberFormatException e){
	      System.err.println("");
	    }
	    catch(IOException e){
	      System.err.println("エラー");
	    }

	  }
	}
