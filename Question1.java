//1:Find the min and max element in an array? 

class Question1 
{
	public static void main(String[] args) 
	{
		int[] a={2,5,97,45,6,3};//Declare the integers 
		int min=a[0];
		int max=a[0];
		for ( int i=0;i<a.length ;i++ )//using for loop to define the max and min element
		{
			if (a[i]<min)
			{
				min=a[i];
			}
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("minimum" +" "+ min);
		System.out.println("maximum" +" "+ max);
	}
}
