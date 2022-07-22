
package waterfallproblem1;

import java.util.LinkedList;
import java.util.Queue;


public class Waterfallproblem1 {
    
  
public	static float[] waterfallalgorithm(int[][] input, int pos)
	{
		int height = input[0].length;
		int width = input[1].length;

		float[] result = new float[width];
		
		Queue<wtr> wtrQueue = new LinkedList<>();

		wtrQueue.add(new wtr(0,pos,100));
                
             while(wtrQueue.size()!=0)
		{
	         wtr tmp = wtrQueue.remove();

		    if(input[tmp.h][tmp.w] == 0){
		        if(tmp.h+1 < height)
		            wtrQueue.add(new wtr(tmp.h+1, tmp.w, tmp.water));
		        else
		           result[tmp.w] += tmp.water;
		    }
		    else
		    {
		        if(tmp.h+1 < height)
		        {
		            if(tmp.w > 0)
		                wtrQueue.add(new wtr(tmp.h+1, tmp.w-1, tmp.water/2));
		            if(tmp.w+1 < width)
		                wtrQueue.add(new wtr(tmp.h+1, tmp.w+1, tmp.water/2));
		        }
		        else
		        {
		            if(tmp.w > 0)
		                result[tmp.w-1] += tmp.water/2;
		            if(tmp.w+1 < width)
		                result[tmp.w+1] += tmp.water/2;
		        }
		    }
		}

		return result;
}


    public static void main(String[] args) {
        
          int [][] input = new int[][]{
			{0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0},
			{0,0,1,1,1,0,0},
			{0,0,0,0,0,0,0},
			{1,1,1,0,0,1,0},
			{0,0,0,0,0,0,1},
                        {0,0,0,0,0,0,0}
		};

     int pos = 3;

 for(float x: waterfallalgorithm(input, pos)){
			
	  System.out.println(x);
			
		}
     
    }}

