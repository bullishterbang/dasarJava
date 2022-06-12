import java.util.Scanner;
class Antrian
{
	 private int ukuran;
	  private long [] antrian;
	  private int depan;
	  private int belakang;
	  private int jumItem;
	  public Antrian(int s)
	  {
	  	ukuran = s;
	  	antrian = new long [ukuran];
	  	depan = 0;
	  	belakang =-1;
	  	jumItem =0;
	  }
	  public void masuk (long j)
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
	  	for (int i=0;i<jumItem;i++)
	  		antrian [i]=antrian [i+1];
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
		for (int i=0;i<jumItem;i++)
		System.out.print(antrian[i]+" ");
		System.out.println("");
	}
}
class apliantrian
{
	public static void main(String []args)
	{
		Scanner data=new Scanner(System.in);
		Antrian antrian = new Antrian(10);

					System.out.println("Nama\t: Bayu Safadiga Halsa");
					System.out.println("NPM\t: 16111100125");
					System.out.println("Kelas\t: 16A3");
			System.out.println("=================================================\n\n");
		System.out.print("Data ke-1 : ");
		Integer a=data.nextInt();
		System.out.print("Data ke-2 : ");
		Integer b=data.nextInt();
		System.out.print("Data ke-3 : ");
		Integer c=data.nextInt();
		System.out.print("Data ke-4 : ");
		Integer d=data.nextInt();
		System.out.print("Data ke-5 : ");
		Integer e=data.nextInt();
		System.out.print("Data ke-6 : ");
		Integer f=data.nextInt();
		System.out.print("Data ke-7 : ");
		Integer g=data.nextInt();
		System.out.print("Data ke-8 : ");
		Integer h=data.nextInt();
		System.out.print("Data ke-9 : ");
		Integer i=data.nextInt();



		antrian.masuk(a);
		antrian.lihat();
		antrian.masuk(b);
		antrian.lihat();
		antrian.masuk(c);
		antrian.lihat();
		antrian.masuk(d);
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.masuk(e);
		antrian.lihat();
		antrian.keluar();
		antrian.lihat();
		antrian.masuk(f);
		antrian.lihat();
		antrian.masuk(g);
		antrian.lihat();
		antrian.masuk(h);
		antrian.lihat();
		antrian.masuk(i);
		antrian.lihat();
		while(!antrian.isEmpty())
		{
			long n=antrian.keluar();
			System.out.print(n);
			System.out.println("");
		}
		System.out.println("");
	}
}