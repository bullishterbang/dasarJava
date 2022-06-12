import java.io.*;
import java.util.Scanner;
class Antrian {

		private static int maxSize=30;
		static private int pilih;
		static private String in;
		static private String[] Antrian;
		private static int top;
		static int jumItem;
		private int belakang;
		public static void Stack(int max){
			maxSize=max;

		Antrian = new String[maxSize];
		top=-1;
		}

	public static void push(String j){
	Antrian[++top]=j;
	jumItem++;
	}

	  public static String keluar()
	  {
	  	String temp = Antrian[0];
	  	for (int i=0;i<jumItem;i++)
	  		Antrian[i]=Antrian [i+1];
	  	jumItem--;
	  	return temp;
	  }

	public static String peek(){
	return Antrian[top];
	}

	public static boolean isEmpty(){
	return (top==-1);
	}

	static void baca () {
	int i;

	System.out.println("Data yang telah anda masukkan : ");
	if(top>-1)
	{
	for(i=0;i<=top;i++)
	System.out.println(Antrian[i]);
	}
	else System.out.println("Antrian Anda Kosong");
	}


	public static void main (String[]args)
	{
	Scanner scan = new Scanner(System.in);
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
	String a;
	Stack(30);
	System.out.println("\t\t\t+------------------------------+");
	System.out.println("\t\t\t|Nama\t: Jefri Setiawan       |");
	System.out.println("\t\t\t|NPM\t: 16111100101          |");
	System.out.println("\t\t\t|Kelas\t: 16A3                 |");
	System.out.println("\t\t\t+------------------------------+\n\n");

	System.out.println("Pilihan Program");
	System.out.println("1. Masukan Data");
	System.out.println("2. Ambil Data");
	System.out.println("3. Cetak Data");

do{
	System.out.print("\nMasukkan pilihan Anda :");
	 try{
	 pilih=Integer.parseInt(read.readLine());
	 }
	 catch(IOException e){}

	switch(pilih)
	{
		case 1:
		System.out.print("Masukan data :");
		try{
		in=data.readLine();
		}
		catch(IOException e){}
		push(in);
		break;
		case 2:
			in=keluar();
			System.out.println("Ambil data :"+in);
			break;
		case 3:
		baca();
		break;

		default : System.out.println("Pilihan yang anda masukkan salah");
		break;
}
}
while (pilih!=0);
}
}