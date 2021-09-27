//5:Move all the negative element to one side of the array?

class Question5 
{
	public static void main(String[] args) 
	{ 
		int[] a={-1,6,-4,7,8,-3};//Declare the integers
		int j=0;
			for (int i=0;i<a.length-1 ;i++ )//using for and if statement swap the given elements
		{
			if (a[i]>0)
			{
			if (i!=j)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				j++;
			}
		
			}
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		
	}
	}

					