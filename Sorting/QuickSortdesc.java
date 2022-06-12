import java.util.*;
class QuickSortdesc
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
		while (A[i]>p) i++;
		while (A[j]<p) j--;
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
		System.out.println("\n====================UNIVERSITAS PGRI YOGYAKARTA====================");
		System.out.println("		FAKULTAS TEKNIK - TEKNIK INFORMATIKA");
		System.out.println("\n		Nama	: Gagas Novregi Nandiwardhana");
		System.out.println("		NPM	: 16 1111 000 62");
		System.out.println("		Kelas	: TI - 16 A2");
		System.out.println("\n		Selamat Datang di Program QuickSort DESCENDING Via Keyboard");
		System.out.println("");
		Scanner input = new Scanner(System.in);
		QuickSort lrk = new QuickSort();
		float nilai[]=new float[5];

		System.out.println("Masukan 5 data nilai");
		for (int i=0; i<5; i++)
		{
			System.out.print((i+1)+" : ");
			nilai[i]=input.nextFloat();
		}

		System.out.println("\nData nilai yang dimasukan");
		for (int i=0; i<5; i++)
			System.out.println (nilai[i]);
		System.out.println("\nData hasil pengurutan");
		lrk.QuickSort(nilai, 0, nilai.length-1);
		for (int i=0; i<5; i++)
		System.out.println(nilai[i]);
	}
}