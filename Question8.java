//8:How to find common element in three sorted array?

class Question8
{

	public static void main(String[] args) 
	{
		int[] a={5,10,15,20,25,30};
        int[] b={10,20,30,12};
        int[] c={10,30,50,12};
        for (int i=0;i<a.length ;i++ )
        {
			for (int j=0;j<b.length ;j++)
			{
				for (int k=0;k<c.length ;k++ )
				{
					if (a[i]==b[j]&& b[j]==c[k])
					{
System.out.println("common element of three sorted array is:"+a[i]);
					}
				}
			}
        }

		
	}
}
