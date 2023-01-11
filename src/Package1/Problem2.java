package Package1;

public class Problem2 {
	
	//how to get index value of a specific element
	
	public static int findIndex(int [] myArray , int t )
	{
		if (myArray == null)
			
		{
			return -1;
		}
		
		int len = myArray.length;
		int i=0;
		
		while(i<len)
		{
			if(myArray[i]==t)
				{
				return i;
				}
			else i=i+1;
			
		}
		
		return -1;
			
	}
	
	public static void main (String [] args)
	{
		int [] myArray = {1,2,3,4,5,6,7,8,9,0,25,77};
		System.out.println("index position of 25 is :" + findIndex(myArray,25));
		System.out.println("Index position of 77 is  " + findIndex(myArray,77));
	}

}
