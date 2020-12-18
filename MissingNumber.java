
/*
MissingNumber in array with numbers 1...2..n.
(n(n+1)/2) - Σ Xi (i=0 to n-2)
find sum of N natural numbers and substact the array of given numbers so that we will get missing numbers
**NOTE: THIS LOGIC APPLIES ONLY FOR NATURAL NUMBER SERIES WITHOUT ANY REPETETION
@autho: Siva Ganesh
*/
public class MissingNumber
{
	public static void main(String[] args) {
	    
		System.out.println("Testing");
		int n[]={4,3,1,5,6};
		System.out.println(new MissingNumber().getMissingNumber(n,6));
	}
	
	private  int getMissingNumber(int numbers[], int size)
	{
	    int sum=0;
	    for (int i=0;i<size-1;i++){
	        sum+=numbers[i];
	    }
	    return (size*(size+1)/2)-sum;
	}
}
