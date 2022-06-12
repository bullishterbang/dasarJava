import java.util.*;
class linear
{
	public static void main (String [] args)
	{
		System.out.println("\n====================UNIVERSITAS PGRI YOGYAKARTA====================");
		System.out.println("		FAKULTAS TEKNIK - TEKNIK INFORMATIKA");
		System.out.println("\n		Nama	: Gagas Novregi Nandiwardhana");
		System.out.println("		NPM	: 16 1111 000 62");
		System.out.println("		Kelas	: TI - 16 A2");
		System.out.println("\n		Program Search Metode Linear Via Keyboard");
		System.out.println("");

		Scanner wow=new Scanner(System.in);
		int i,n,search;

		int data[]= new int [5];
		System.out.println("Masukan 5 Data Nilai");

		for(i=0;i<5;i++)
		{
			System.out.print("Data ke"+(i+1)+": ");
			data[i]=wow.nextInt();
		}

		System.out.println("\n.---------------.");
		System.out.print("|  Data Nilai	|");
			for (i=0; i<5; i++)
				System.out.print(" "+data[i]+" ");
				System.out.println("\n.---------------.");
				System.out.print("|  Cari Nilai	| ");
				search=wow.nextInt();
				System.out.println(".---------------.");

			for(i=0;i<5;i++)
			{
				if (data[i]==search)
				{
					System.out.println("|     Hasil	| Data nilai "+search+" berada pada data ke "+(i+1));
					System.out.println("'---------------'");
					break;
				}
			}
				if(i==5)
					System.out.println("|     Hasil	| Data nilai "+search+ " tidak ada");
					System.out.println("");
	}
}