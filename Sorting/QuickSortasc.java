import java.util.*;
class QuickSortasc
{
	public void QuickSort (float A[], int L, int R)
	{
	int i,j;
	float p;
	p=A[(L+R)/2];
	i=L;
	j=R;
	while (i<=j)

	{
		while (A[i]<p) i++;
		while (A[j]>p) j--;
		if (i<=j)
		{
			tukar(A,i,j);
			i++;
			j--;
		}
	}
	if (L<j) QuickSort (A,L,j);
	if (i>R) QuickSort (A,i,R);

	}

	public void tukar(float larik3[], int satu,int dua)
	{
		float tmp;
		tmp=larik3[satu];
		larik3[satu]=larik3[dua];
		larik3[dua]=tmp;
	}

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		QuickSort lrk = new QuickSort();
		float nilai[]=new float[5];

		System.out.println("Masukan 5 data nilai");
		for (int i=0; i<5; i++)
		{
			System.out.print((i+1)+" : ");
			nilai[i]=input.nextFloat();
		}

		System.out.println("Data nilai yang dimasukan");
		for (int i=0; i<5; i++)
			System.out.println (nilai[i]);
		System.out.println("Data hasil pengurutan");
		lrk.QuickSort(nilai, 0, nilai.length-1);
		for (int i=0; i<5; i++)
		System.out.println(nilai[i]);
	}
}