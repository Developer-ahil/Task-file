//2:Write a prograame to reverse the array?

class Question2 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7,8,9};//Declare the integer value
		System.out.println("Original array");
		for ( int i=0;i<a.length ;i++ )//original array
		{
System.out.print(a[i]+"\t"+"  ");
		}
		System.out.println();
	System.out.println("Reverse array");
		for (int i=a.length-1;i>=0 ;i-- )//using for loop to reverse the given array element
		{
System.out.print(a[i]+"\t"+"  ");
		}	
	}
}
