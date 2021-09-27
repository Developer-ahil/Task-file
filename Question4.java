//4:Find the occurence of an integer in the array?

class Question4 
{
	public static void main(String[] args) 
	{
		int[] a={5,8,5,7,4,5};//Declare the integers
		int count=0;
        for (int i=0;i<a.length ;i++ )//using for loop, count the given occurence
        {
			if (a[i]==5)
			{
				count++;
			}
        }
		System.out.println("occurence of the given element is "+count);
	}
}
