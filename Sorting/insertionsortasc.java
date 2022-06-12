import java.util.*;
class insertionsortasc
{
	public static void main (String [] args)
	{
		System.out.println("\n====================UNIVERSITAS PGRI YOGYAKARTA====================");
		System.out.println("		FAKULTAS TEKNIK - TEKNIK INFORMATIKA");
		System.out.println("\n		Nama	: Gagas Novregi Nandiwardhana");
		System.out.println("		NPM	: 16 1111 000 62");
		System.out.println("		Kelas	: TI - 16 A2");
		System.out.println("\n		Selamat Datang di Program Insertionsort ASCENDING Via Keyboard");
		System.out.println("");

		Scanner masuk=new Scanner(System.in);
				int data[]=new int[5];
				System.out.println("Masukan 5 buah data nilai");
					for(int a=0;a<5;a++){
						System.out.print("Data ke "+(a+1)+": ");
						data[a]=masuk.nextInt();
			}

		System.out.println("");
		System.out.print("DATA TERSORTING	: ");
		int tmp;
		for (int a=1; a<data.length; a++)
			{
				tmp=data[a];
				int posisi=a;
				for(int b=0; b<a; b++)
					{
						if (data[b]>tmp)
							{
								posisi=b;
								for (int c=a; c>posisi; c--)
								data[c]=data[c-1];
								break;
							}
					}
					data[posisi]=tmp;
				}
				for(int a=0; a<data.length; a++)
					{
						System.out.print(data[a] + " ");
					}
					System.out.println();
			}
	}