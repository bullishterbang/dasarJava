import java.io.*;
import java.util.Scanner;
class Tugas
{
	private int ukuran;
	private long[] antrian;
	private int depan;
	private int belakang;
	private int jumItem;
	public Tugas(int s)
	{
		ukuran  = s;
		antrian = new long[ukuran];
		depan   = 0;
		belakang= -1;
		jumItem = 0;
	}
	public void masuk(long j)
	{
		if(!isFull())
		{
			antrian[++belakang] = j;
			jumItem++;
		}
	}
	public long keluar()
	{
		long temp = antrian[0];
		for(int i=0;i<jumItem;i++)
			antrian[i]=antrian[i+1];
		jumItem--;
		belakang--;
		return temp;
	 }
	 public long peekDepan()
	 {
		 return antrian[depan];
	 }
	 public boolean isEmpty()
	 {
		 return (jumItem==0);
	 }
	 public boolean isFull()
	 {
		 return (belakang==ukuran-1);
	 }
	 public int ukuran()
	 {
		 return jumItem;
	 }

	 public void lihat()
	 {
		 for(int i=0; i<jumItem;i++)
		 	System.out.print(antrian[i]+" ");
		 System.out.println("");
	 }
 }
 class Queue
 {
	 public static void main(String[]args)
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.println("[1] Masukkan Angka");
		 System.out.println("[2] Ambil Angka");
		 System.out.println("[3] Cetak Data");
		 String ulang = "ya";
		 while (ulang.equalsIgnoreCase ("ya")){
		 System.out.print("\nSilahkan Masukkan Pilihan: ");
		 int pilihan = input.nextInt();
		 Tugas antrian = new Tugas(10);
		 switch (pilihan)
		 {
			 case 1:
			 System.out.print("Masukkan Data ke 1: ");
			 int a=input.nextInt();
			 antrian.masuk(a);
			 System.out.print("Masukkan Data ke 2: ");
			 int b=input.nextInt();
			 antrian.masuk(b);
			 System.out.print("Masukkan Data ke 3: ");
			 int c=input.nextInt();
			 antrian.masuk(c);
			 System.out.print("Masukkan Data ke 4: ");
			 int d=input.nextInt();
			 antrian.masuk(d);
			 System.out.print("Masukkan Data ke 5: ");
			 int e=input.nextInt();
			 antrian.masuk(e);
			 System.out.print("Masukkan Data ke 6: ");
			 int f=input.nextInt();
			 antrian.masuk(f);
			 System.out.print("Masukkan Data ke 7: ");
			 int g=input.nextInt();
			 antrian.masuk(g);
			 System.out.print("Masukkan Data ke 8: ");
			 int h=input.nextInt();
			 antrian.masuk(h);
			 System.out.print("Masukkan Data ke 9: ");
			 int i=input.nextInt();
			 antrian.masuk(i);
			 System.out.print("Masukkan Data ke 10: ");
			 int j=input.nextInt();
			 antrian.masuk(j);


			 break;

			 case 2:
			 antrian.keluar();
			 System.out.print("Ambil Angka: ");
			 break;
			 case 3:
			 antrian.lihat();
			 break;
			 default:
			 System.out.print("Pilihan yang anda masukkan salah");
			 System.out.print ("\nAnda ingin mengulang lagi? (ya/tidak): ");
			 ulang = input.nextLine();
		 }

		 }

	 }
	 }