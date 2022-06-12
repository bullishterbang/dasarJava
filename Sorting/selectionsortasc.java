class selectionsortasc
{
	public static void main (String [] args)
	{
	int a[]={2,4,0,5,7,9,1,6,8,3};

	for (int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+ " ");
	}

	System.out.println();

	for (int i=0; i<a.length; i++)
	{
		int tmp=i;
		for (int j=i; j<a.length; j++)
		{
			if (a[j] < a[tmp])
			tmp=j;
		}

	int c=a[i];
	a[i]=a[tmp];
	a[tmp]=c;
	}

	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
}