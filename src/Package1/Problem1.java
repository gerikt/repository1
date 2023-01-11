package Package1;

public class Problem1 {
	
	// create an array and find dublicate elements
	
	public static void main (String [] args)
	{
		String [] array1 = {"test 1 ","test2","test3","test4","test4", "test5", "test5"};
		
		for(int i=0;i<array1.length; i++)
		{
			for(int j=0; j<array1.length;j++)
			{
				
				
			if(array1[i]== array1[j] && i!=j)
			{
				
				System.out.println("the dublicate element found is " + array1[i]);
			}
			
			}
		}
	}

}
