//3:Write a program to sort a given array?

class Question3 
{
	public static void main(String[] args) 
	{
		int[] a={4,5,6,2,3,1};
	    int temp=0;
		System.out.println("Element of original array ");
		for ( int i=0;i<=a.length-1 ;i++ )
		{ 
			System.out.print(a[i]+" ");
		}
		for ( int i=0;i<a.length-1 ;i++ )// sorted into Ascending order
		{
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
System.out.println();
		System.out.println("Element of sorted in ascending array ");
		for ( int i=0;i<=a.length-1 ;i++ )
		{ 
			System.out.print(a[i]+" ");
		}


for ( int i=0;i<a.length-1 ;i++ )// sorted into Decending order
		{
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
System.out.println();
		System.out.println("Element of sorted in decending array ");
		for ( int i=0;i<=a.length-1 ;i++ )
		{ 
			System.out.print(a[i]+" ");
		}

	}
}
