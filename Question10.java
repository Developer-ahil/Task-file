//10:Write a program to find the sum and product of the all elements of an array? 

class Question10 
{
	public static void main(String[] args) 
	{
		int a[]={3,4,5,6,7};// we declare the integer array
		int sum=0;
		for ( int i=0;i<a.length ;i++ )
		{
          sum=sum+a[i];//sum of the array
		}
		int prod=1;
        for ( int i=0;i<a.length ;i++ )
		{
          prod=prod*a[i];//product of the array
		}

		System.out.println("sum of array:" +sum);
        System.out.println("product of array:" +prod);
	}
}
