import java.util.Arrays;
public class ArrayHW {

	  public static void main(String[] args){   
		    int y = 1;                     // make variable to fill the array z
		    int[][] z = new int[2][2];     // make two-dimensional arrays
		    
		    
		    for(int i=0; i<2; i++){        
		    	for(int j=0; j<2; j++){
		    		z[i][j]=y;        // in this for loop, i go 0 to 1, j go 0 to 1    
		    		y += 1;           // at the end of case, raise the value of y
		    	}
		    }
		    System.out.println(Arrays.deepToString(z));
	  }
}
