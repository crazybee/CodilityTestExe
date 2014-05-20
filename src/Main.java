
import java.util.LinkedList;
public class Main {
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 7
		 int length = A.length;
		 int sum = A[0];
		 int last = sum;
		 
		 for(int i=1;i<length;i++) {
		        last = getmax(A[i],A[i]+last);
		        if(last<sum)
		            sum = last;
		    }

		return sum;
		
	
				 
				 
		 }
		
		
	
	private static int getmax(int i, int j) {
		// TODO Auto-generated method stub
		return i > j ? i:j;
	}



	public static void main (String args[]){
		int [] a = {2,-7,3,4};
		
	  System.out.println(solution(a));
		
	}

}
