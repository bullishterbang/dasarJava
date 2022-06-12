class bubblesortdescending
{
	public static void main (String [] args)
	{
		int data[] = {2,5,6,0,3,4,7,8,1,9};
		System.out.println("BUBBLESORT");
		System.out.print("DATA AWAL	: ");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}

		System.out.println();
		for(int i=0;i<(data.length-1);i++)
		{
			for(int j=0;j<(data.length-i-1);j++)
			{
				if(data[j]<data[j+1])
				{
					int tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}

		System.out.print("Data Sorting	: ");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}