package Package1;

public class problem3 {
	
	//remove element

	public static void main ( String [] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int t =2;
		removeElement(arr,t);
		
		
		
	}
	
	public static void removeElement(int [] arr,int t)
		{
			for(int i = 0;i<arr.length;i++)
			{
				if (arr[i]==t)
				{
					arr[i]=arr[i+1];
				}
			}
			
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]);
			}
					
		}
}
