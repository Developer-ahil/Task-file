//6:Find duplicates in an array?

class Question6 
{
	public static void main(String[] args) 
	{
		int[] a={1,3,6,3,4,5};//Declare the integers
         for (int i=0;i<a.length ;i++ )
         {
			 for (int j=i+1;j<a.length ;j++ )//using for loop increment the i,j values
			 {
				 if (a[i]==a[j])//if both vlues are equal then print the duplicate value
				 { 
System.out.println("The Duplicate element is:"+a[j]);
				 }
			 }
         }
		
	}
}
