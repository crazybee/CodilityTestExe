import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class Main {
public static int [] input;
public static int tofind;
public static int a;
public static int b;
public static int [] i = {2,3,4,5,66,7,6,6,6,7,7};
public static int [] A = {4,3,2,1,5};
public static int [] B = {0,1,0,0,0};
public static int [] leader = {4,3,4,4,4,2};
public static int [] sum10 = {5,-7,3,5,-2,4,-1};
public static int [] maxprofit = {100,200,50,30,200};
public static int [] fengzhi = {1,2,3,2,5,4,7};
public static String reverse = "hellohello";
	
	
	
	public static void main(String args[]) throws IOException
	
	{
	 
	
		System.out.println(solutionpinghengdian(i));
		System.out.println(solutionmintape(i));
		System.out.println(solutionfrogjump(10, 85, 30));
		System.out.println(Arrays.toString(solutioncounter(3, i)));
		System.out.println(permutation(i));
		System.out.println(checkdup(i));
		System.out.println(testtriangular(i));
		System.out.println(returncube(8, 65));
		System.out.println(checknest1("((([])))"));
		System.out.println(int2string(17, 7));
		System.out.println(stonewall(i));
		System.out.println("mystonewall" + mystonewall(i));
		System.out.println(fishlive(A, B));
		System.out.println(findleader(leader));
		System.out.println(equileader(leader));
		System.out.println(maxslicesum(sum10));
		System.out.println(maxprofit(maxprofit));
		System.out.println(mymaxprofit(maxprofit));
		System.out.println(mydistinct(i));
		System.out.println(zhaofengzhi(fengzhi));
		System.out.println(perimeter(30));
		System.out.println(reversed(reverse, 0, 9));
		System.out.println("febois" + febonacci(8) + "," + fibonacci(8));
		
	}



private static int find (int [] A) {
	// TODO Auto-generated method stub
   int returnvalue = -1;
   int counter = 0;
   int length = A.length;
   long leftsum = 0;
   long rightsum = 0;
    for (int i =0;i<length;i++){
    	
    	rightsum += A[i];
    	
    	
    }
      long templeftsum = A[0];
      for (int j = 0; j < length; j++){
    	  
    	  if (templeftsum == rightsum){returnvalue = j;break;}
    	  else {
    		  templeftsum += A[j];
    	      rightsum -= A[j];
    			  
    	  }
    	  
    	  
    	  
      }
  
   return returnvalue;
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 7
    long sum = 0;
    for  (int i = 0;i < A.length; i++)
        sum += A[i];
    for (int i = 0; i < A.length; i++)
    {
        if (sum == A[i])
            return i;
        sum -= A[i]+A[i];
    }
    return -1;
        
    }
}

    public static int solutionpinghengdian(int[] A) {
        // write your code in Java SE 7
    long sum = 0;
    for  (int i = 0;i < A.length; i++)
        sum += A[i];
    for (int i = 0; i < A.length; i++)
    {
        if (sum == A[i])
            return i;
        sum -= A[i]+A[i];
    }
    return -1;
        
    }
    public static int solutionmintape(int[] A) {
        int [] diff;
        int sum1;
        int sum2=0;
        int ans, localMin;
        diff = new int[A.length-1];

        //AT P=1 sum1=A[0]
        sum1=A[0];

        for (int i =1;i<A.length;i++){
            sum2 += A[i];
        }

        ans = Math.abs(sum1- sum2);

        for (int p= 1;p<A.length;p++){
            localMin= Math.abs(sum1- sum2);

            if( localMin < ans ){
               ans = localMin;
            }
            //advance the sum1, sum2
            sum1+= A[p];
            sum2-= A[p];
            diff[p-1]=localMin;
        }
        return (getMinVal(diff));    
    }  

    public static int getMinVal(int[] arr){ 
        int minValue = arr[0]; 
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minValue){ 
                minValue = arr[i]; 
            } 
        } 
        return minValue; 
    }  
    
    public static int solutionfrogjump (int X, int Y, int D){
   int counter =0;
   
   int returnvalue = 0;
   if ((Y - X) % D == 0) {
	    return (Y - X) / D;
	}
	return (Y - X) / D + 1;
   
    	
    	
    	
    	
    	
   
    }  
    
    public static int[] solutioncounter (int N, int[] A){
    	
    	
    	  int counter[] = new int[N];
          int n = A.length;
          int max=-1,current_min=0;

          for(int i=0;i<n;i++){
              if(A[i]>=1 && A[i]<= N){
                  if(counter[A[i] - 1] < current_min) counter[A[i] - 1] = current_min;
                  counter[A[i] - 1] = counter[A[i] - 1] + 1;
                  if(counter[A[i] - 1] > max) max = counter[A[i] - 1];
              }
              else if(A[i] == N+1){
                  current_min = max;
              }
          }
          for(int i=0;i<N;i++){
              if(counter[i] < current_min) counter[i] =  current_min;
          }
          return counter;
    }
    public static int solutiondistinct (int [] A){
    	int length = A.length;
    	int dist = -1;
    	Arrays.sort(A);
    	
    	for (int i =0; i < length; i++)
    	{
    	  for (int j = 1; j< length;j++){
    		  
    		  if (A[i] == A[j]){}
    	  } 	
    		
    		
    		
    	}
    	
    	
    	return -1;
    }
    public static int permutation(int[] A){
    	
    	
    	        // write your code in Java SE 7
    	        int[] count = new int[A.length];
    	        System.out.println("length of array is "+A.length);

    	        for (int i = 0; i < A.length; i++) {

    	            int x = A[i]-1;

    	            if (x >= A.length) return 0;

    	            int check = count[x];

    	            if (check > 0) return 0;

    	            count[x] = 1;
    	        }

    	        return 1;
    	    
    }
    public static boolean checkdup (int [] A){
    	
    	
    	
        int N = A.length;
            boolean dup = false;
            for (int i=0; i<N; ++i){
                A[(A[i]%N+N)%N] -= N;
            }
            for (int i=0; i<N; ++i){
                if (A[i]>0){
                    dup = true; break;
                }
            }
            for (int i=0; i<N; ++i)
                {
            	  A[(A[i]%N+N)%N] += N;
            	}
            return dup;
        
    }
    public static int testtriangular(int[] A){
    	
    	  // write your code in Java SE 7
    	  if (null == A)
    	        return -1;
    	        if (A.length < 3)
    	        return -1;
    	        Arrays.sort(A);
    	        int tempmax =0;
    	        int [] check = new int[A.length] ;
    	        int max=0;
    	        int counter =0;
    	        
    	        for (int i = 0; i < A.length - 2 && A[i] > 0; i++) {
    	        if (A[i] + A[i + 1] > A[i + 2]){
    	            tempmax = A[i]+A[i+1]+A[i+2];
    	            check[i]= tempmax;
    	          counter ++;
    	        }
    	           
    	             
    	        }
    	       
    	        if (check.length == 1) return -1;
    	      
    	        else 
    	         {Arrays.sort(check);   }
    	          
    	        if (check[A.length-1] == 0) return -1;
    	        return check[A.length-1];
    	
    	
    }
    public static int returnmax(int[] input){
    	
    	
    	return 1;
    	
    	
    	
    	
    }
    public static int returncube(int A, int B){
    	
    	int counter =0;
    	for (int i = A; i<= B;i++){
    		for (int j = 1;j < B;j++)
    		if (j*j*j ==i){counter++;}
    		
    		
    	}
    	
    	return counter;
    }
    public static boolean checknest(String S){
    	
    	
    	   HashMap<Character, Character> matches = new HashMap<Character, Character>();
    	    matches.put('{', '}');
    	    matches.put('(', ')');
    	    matches.put('[', ']');

    	    Set<Character> specialChars = new HashSet<Character>();
    	    Deque<Character> expected = new LinkedList<Character>();
    	    for (Entry<Character, Character> ee : matches.entrySet()) {
    	        specialChars.add(ee.getKey());
    	        specialChars.add(ee.getValue());
    	    }

    	    for (int i = 0; i < S.length(); i++) {
    	        char next = S.charAt(i);
    	        Character expect = expected.peekLast();
    	        if (expect != null && expect == next) {
    	            expected.removeLast();
    	        }
    	        else if (matches.containsKey(next)) {
    	            expected.addLast(matches.get(next));
    	        }
    	        else if (specialChars.contains(next)) {
    	            return false;
    	        }
    	    }
    	    return true;
    }
    public static String int2string (int V, int R){
    	
    	String got = Integer.toString(V, R);
    	
    	
    	
    	return got;
    }
    
    public static boolean checknest1(String S){
    	
    	
    	StringBuffer strBuf = new StringBuffer(S);
    	String str2 = strBuf.reverse().toString();
         
         int l=S.length();
        
         int head =0;
         int tail = l-1;
         if (l%2!=0) return false;
         int count = (head+tail)/2;
         for (int i =0; i < count; i++) {
             if(S.charAt(head++) != S.charAt(tail--)-1)
             {
                 return false;
             }
         }
    	
    	
    return true;
    }
    public static int stonewall (int [] H){
    	
    	int length = H.length;
    	ArrayList <Integer> a = new ArrayList<Integer>();
    	int res = 0;
    	if (length < 1) return length;
    	Stack <Integer> s = new Stack<Integer>();
    	for (int i =0;i<length;i++){
    		while (!s.empty() && H[i]< s.get(s.size()-1)){
    			s.pop();
    			res++;
    			a.add(H[i]);
    			
    			
    		}
    		if (s.isEmpty()){
    			s.push(H[i]);
    			continue;
    			
    		
    		}
    		if (H[i] > s.get(s.size()-1)){
    			s.push(H[i]);
    			
    			
    		}
    		
    		
    		
    	}
    	System.out.println(s.toString()+","+a.toString());
    	res += s.size();
    	return res;
    	
    }
    public static int fishlive(int [] A, int [] B){
    	
    	int survivors = 0;
    	Stack<Integer> ones = new Stack<Integer>();
    	for (int i = 0; i < A.length; i++) {
    	if (B[i] == 0) {
    	if (ones.size() == 0) {
    	survivors++;
    	} else { // Duel
    	while (!ones.empty()) {
    	if (A[i] > ones.peek()) { // "One" dies
    	ones.pop();
    	} else { // "Zero" dies
    	break;
    	}
    	}
    	if (ones.empty()) { // "Zero" survives
    	survivors++;
    	}
    	}
    	} else {
    	ones.push(A[i]);
    	}
    	}
    	return survivors + ones.size();
    	
    	
    	
    	
    }
    public static int findleader(int [] A){
    	int length = A.length;
    	int leader = -1;
    	int count = 0;
    	Arrays.sort(A);
    	int candi = A[length/2];
    	for (int i = 0; i < length; i++)
    	{
    	  	if (A[i] == candi){count +=1;}
    		
    		
    		
    		
    	}
    	if (count > length/2){leader = candi;}
    	
    	return leader;
    }
    public static int equileader (int [] A){
    	
    	int length = A.length;
    	if (length < 2) return 0;
    	int result = 0;
    	Arrays.sort(A);
    	int leader = A[length/2];
    	int totalcount = 0;
    	for (int i = 0; i < length ; i++){
    		
    		
    		if (leader == A[i]) {
    			totalcount ++;
    			
    			
    		}
    	}
    	
    	int count = 0;
    	for (int s = 0; s< length -1; s++){
    		if (A[s] ==  leader) count ++;
    		if (count > (s+1)/2 && totalcount - count > (length-s-1)/2){
    			result ++;
    			}
    		
    		
    	}
    	
    	return result;

    }
    public static int maxslicesum(int [] A){
    	int length = A.length;
    	int end = A[0];
    	int result = end;
    	for (int i = 1; i< length; i++){
    		if (end < 0) end = 0;
    		result = getMax(result, end+=A[i]);
    		
    		
    	}
    	
    	
    	
    	
    	return result;
    }



	private static int getMax(int result, int i) {
		// TODO Auto-generated method stub
		return result > i ? result:i;
	}
    public static int maxprofit(int [] A){
    	
    	int n = A.length;
    	int profit = 0;
    	int ind = 0;
    	for (int i = 1; i < n; i++){
    		
    		if (A[i] < A[ind]) {ind = i;}
    		
    		profit = getMax(profit, A[i] - A[ind]);
    	}
    	
    	
    	
    	return profit;
    }
    public static int mystonewall(int [] A){
    	Stack <Integer> my = new Stack<Integer>();
    	int length = A.length;
    	int counter = 0;
        ArrayList <Integer> small = new ArrayList<Integer>();
    	for (int i = 0;i < length; i++){   
    		
    	
    	while (!my.isEmpty() && A[i] < my.get(my.size()-1)){
    		my.pop();
    		
    		counter ++;
    		small.add(A[i]);
    	}	
    	
    	if (my.isEmpty()){my.push(A[i]);continue;}
    	if (A[i] > my.get(my.size()-1)) {
    		my.push(A[i]);
    		}
    		
    	}
    	
    	System.out.println("blocks are"+my.toString()+","+small.toString());
    	return counter+my.size();
    }
    public static int mydistinct (int [] A){
    	
    	int length = A.length;
    	Arrays.sort(A);
    	int begin = A[0];
    	int counter =1;
    	for (int i = 1; i < length; i++){
    		if (begin != A[i] ){
    			counter ++;
    			begin = A[i];
    			
    			
    			
    		}
    		
    		
    		
    	}
    	
    	return counter;
    
    }
    public static int zhaofengzhi(int [] A){
    	int length = A.length;

    	if (length <3){return -1;}
    	ArrayList <Integer> finalresult = new ArrayList <Integer>();
    		for (int i=1;i+1<length;i++){
    			
    			if (A[i]>A[i-1] && A[i]>A[i+1]){
    				
    				finalresult.add(A[i]);
    				
    			}
    			
    		}
    		
    		
    	
    	
    	System.out.println(finalresult.toString());
    	
    	return finalresult.size();
    }
    public static int mymaxprofit(int [] A){
    	int profit = 0;
    	int test = 0;
    	for (int i = 1; i< A.length; i ++){
    		if (A[i] < test){
    			
    			test = i;
    		}
    		profit = getMax(profit, A[i]-A[test]);
    		
    		
    	}
    	
    	
    	return profit;
    }
    
    public static int perimeter (int A){
    	int sum = A+1;
    	
    	
    	for (int i = 2; i < A/i; i++){
    		int b = A%i;
    	
    		if (b == 0 ){
    			sum = getMin(sum,i+A/i);
    			
    			
    		}
    		
    		
    		
    	}
    	
    	
    	
    	return sum*2;
    }



	private static int getMin(int sum, int j) {
		// TODO Auto-generated method stub
		return sum < j ? sum:j;
	}
	
    private static String reversed (final String A, final int from, final int to){
       char [] B = A.toCharArray();
       int i,j;
       if (from <0 || to > A.length()){return "wrong input";}
    	for (i=from,j=to;i<j;i++,j--){
    		
    		char temp = B[i];
    		     B[i] = B[j];
    		     B[j] = temp;
    		
    		
    		
    	}
    	
    	return String.valueOf(B);
    }
    public static int febonacci (int N){
    	 if(N <= 2){  
             return 1;  
         }  
         int n1 = 1, n2 = 1, sn = 0;  
         for(int i = 0; i < N - 2; i ++){  
             sn = n1 + n2;  
             n1 = n2;  
             n2 = sn;
             System.out.println(sn);
         }  
         return sn;  
    }
    public static int fibonacci(int n){  
        if(n <= 2){  
            return 1;  
        }else{  
            return fibonacci(n-1) + fibonacci(n-2);  
        }  
    }  
}
