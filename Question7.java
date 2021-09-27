//7:Find the factorial of the large number?

class Question7 
{
	public static void main(String[] args) 
	{
		int a=30;
		int prod=1;
		for (int i=1;i<=a ;i++ )
		{
			prod=prod*i;
		}
		System.out.println("Factorial of "+a+" "+"is:"+prod);
	}
}
