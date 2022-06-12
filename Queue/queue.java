import java.io.*;
import java.util.*;
class queue
{
		private static int maxSize=999;

		static private int pilih;
		static private String nama;
		static private String b;
		static private String kartu;
		static private String atm;
		static private String adm;
		static private String[] Antrian;

		private static int top;
		static int jumAntrian;
		private int belakang;

		public static void Stack(int max)
		{
			maxSize=max;
			Antrian = new String[maxSize];
			top=-1;
		}

		public static void push(String j)
		{
			Antrian[++top]=j;
			jumAntrian++;
		}

	  	public static String keluar()
	  	{
	  		String temp = Antrian[0];
	  		for (int i=0; i<jumAntrian; i++)
	  		Antrian[i]=Antrian [i+1];
	  		jumAntrian--;
	  		return temp;
	  	}

		public static String peek()
		{
			return Antrian[top];
		}

		public static boolean isEmpty()
		{
			return (top==-1);
		}

		static void baca ()
		{
			int i;
			System.out.println("\nDaftar Antrian Customer Service : ");
			if(top>-1)
			{
				for(i=0;i<=top;i++)
					System.out.println("\n"+Antrian[i]);
					System.out.println("-----------");
			}
			else System.out.println("Antrian Customer Service Kosong!!");
			}
		public static void main (String[]args)
		{
			Scanner input = new Scanner(System.in);
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

	Stack(30);
	System.out.println("\n====================UNIVERSITAS PGRI YOGYAKARTA====================");
	System.out.println("		FAKULTAS TEKNIK - TEKNIK INFORMATIKA");
	System.out.println("\n		Nama	: Gagas Novregi Nandiwardhana");
	System.out.println("		NPM	: 16 1111 000 62");
	System.out.println("		Kelas	: TI - 16 A2");
	System.out.println("\n");
	System.out.println("\t		Layanan Customer Service");
	System.out.println("\n\t\t\t1. Input Data");
	System.out.println("\t\t\t2. Hapus Data");
	System.out.println("\t\t\t3. Cetak Data");
	System.out.println("\t\t\t4. Selesai");

do{
	System.out.print("\nMasukan pilihan :");
	try
	{
		pilih=Integer.parseInt(read.readLine());
	}
	catch(IOException e){}

	switch(pilih)
	{
		case 1:

			for(String ulang = "y"; ulang.equalsIgnoreCase("y");){ //---equalIgnorecase tidak membedakan huruf kapital atau kecil---
			System.out.println("\t\t\t+-----------------------+");
			System.out.println("\t\t\t|\tMasukkan Data\t|");
			System.out.println("\t\t\t+-----------------------+");
			System.out.print("\n\t\tNama Pemilik [KTP] : ");
			try
			{
				nama=data.readLine();
			}
			catch(IOException e){}
			push(nama); //---memasukan nama----

			System.out.print("\t\tNo KTP :");
			try
			{
				kartu=data.readLine();
			}
			catch(IOException e){}
			push(kartu);//---memasukan no ktp---

			System.out.print("\t\tJenis Kartu Debit/Kredit :");
			try
			{
				atm=data.readLine();
			}
			catch(IOException e){}
			push(atm);//---memasukan jenis kartu atm---

			System.out.print("\t\tBiaya Administrasi :Rp.");
			try
			{
			adm=data.readLine();
			}
			catch(IOException e){}
			push(adm); //---memasukan biaya ADM.---

			System.out.print("Tambah Antrian ? (Y/T) ");
			ulang = input.next();} //---variable 'ulang' untuk mengembalikan ke proses dari awal atau yang sudah di tuju---
			break;

		case 2:
			//---menghapus semua data custumer service---
			nama=keluar();
			kartu=keluar();
			atm=keluar();
			adm=keluar();
			System.out.println("\nAmbil Antrian :");
			System.out.println("Nama  :"+nama);
			System.out.println("No KTP :"+kartu);
			System.out.println("Jenis Kartu :"+atm);
			System.out.println("Biaya Adm. :Rp."+adm);
			break;

		case 3:
			//---mencetak data yang sudah di inputkan---
			baca();
			break;

		case 4:
			System.out.println("\n\t\t\tTerimakasih telah menggunakan program ini");
			break;

		default : System.out.println("\t\t\tPilihan tidak tersedia !");
			break;
		}
	}
while (pilih!=0);
	}
}
