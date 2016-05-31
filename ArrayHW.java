import java.util.Arrays;
public class ArrayHW {

	  public static void main(String[] args){   
		    int y = 1;
		    int[][] z = new int[2][2];
		    
		    
		    for(int i=0; i<2; i++){
		    	for(int j=0; j<2; j++){
		    		z[i][j]=y;
		    		y += 1;
		    	}
		    }
		    System.out.println(Arrays.deepToString(z));
	  }
}
