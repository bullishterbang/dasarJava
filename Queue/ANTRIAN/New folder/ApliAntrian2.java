import java.util.Scanner;
class Antrian{
private int ukuran;
private long[] antrian;
private int depan;
private int belakang;
private int jumitem;
public Antrian(int s){
	ukuran = s;
	antrian = new long[ukuran];
	depan = 0;
	belakang = -1;
	jumitem = 0;
	}
public void masuk(long j){
	if(!isFull()){
		antrian[++belakang] = j;
		jumitem++;
		}
	}
public long keluar()
	{
		long temp = antrian[0];
		for(int i=0;i<jumitem;i++)
			antrian[i]=antrian[i+1];
		jumitem--;
		belakang--;
		return temp;
	 }
public long peekDepan(){
	return antrian[depan];
	}
public boolean isEmpty(){
	return (jumitem==0);
	}
public boolean isFull(){
	return (belakang==ukuran-1);
	}
public int ukuran(){
	return jumitem;
	}
public void lihat(){
	for (int i=0; i<jumitem; i++)
		System.out.print(antrian[i]+" ");
	System.out.println(" ");
	}
}
class ApliAntrian2{
public static void main (String args[]){
System.out.println("1. Masukkan Antrian ");
System.out.println("2. Keluarkan/Ambil Antrian");
System.out.println("3. Lihat Isi Antrian");
Antrian antrian = new Antrian(10);
Scanner masuk = new Scanner(System.in);
Scanner masuk2 = new Scanner(System.in);
String jawab = "ya";
while(jawab.equalsIgnoreCase("ya")){
System.out.print("Masukkan pilihan (1-3) : ");
int pilih = masuk.nextInt();
switch(pilih){
	case 1:
	System.out.print("Masukkan data ke-1 : ");
	int a = masuk.nextInt();
	System.out.print("Masukkan data ke-2 : ");
	int b = masuk.nextInt();
	System.out.print("Masukkan data ke-3 : ");
	int c = masuk.nextInt();
	System.out.print("Masukkan data ke-4 : ");
	int d = masuk.nextInt();
	System.out.print("Masukkan data ke-5 : ");
	int e = masuk.nextInt();
	System.out.print("Masukkan data ke-6 : ");
	int f = masuk.nextInt();
	System.out.print("Masukkan data ke-7 : ");
	int g = masuk.nextInt();
	System.out.print("Masukkan data ke-8 : ");
	int h = masuk.nextInt();
	System.out.print("Masukkan data ke-9 : ");
	int i = masuk.nextInt();
	System.out.print("Masukkan data ke-10 : ");
	int j = masuk.nextInt();
	antrian.masuk(a);
	antrian.masuk(b);
	antrian.masuk(c);
	antrian.masuk(d);
	antrian.masuk(e);
	antrian.masuk(f);
	antrian.masuk(g);
	antrian.masuk(h);
	antrian.masuk(i);
	antrian.masuk(j);
	break;
	case 2:
	antrian.keluar();
	break;
	case 3:
	antrian.lihat();
	break;
	default:
	System.out.println("Masukkan anda salah");
	}
	System.out.print ("Apakah Anda Ingin Mengulang Lagi ? (ya/tidak) : ");
	jawab = masuk2.nextLine();
	}
	System.out.println ("Selesai");
	}
}
