import java.io.*;
class StackPop
{
	private static int maxSize=30;
	static private int pilih;
	static private String in;

	static private String[] stackArray;

	private static int top;

	public static void Stack(int max)
	{
		maxSize = max;
		stackArray = new String[maxSize];
		top = -1;
	}
	public static void push(String j)
	{
		stackArray[++top]=j;
	}
	public static String pop()
	{
		return stackArray[top--];
	}
	public static String peek()
	{
		return stackArray[top];
	}
	public static boolean isEmpty()
	{
		return (top == -1);
	}
	static void baca()
	{
		int i;
		System.out.println("Isi Stacknya: ");
		if(top>-1)
		{
			for(i=0;i<=top;i++)
			System.out.print(stackArray[i]+" ");
		}
		else System.out.println("Kosong\n");
	}
	public static void main(String[]args)
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

		Stack(30);

		System.out.println("Silahkan Pilih Menu Berikut: ");
		System.out.println("===========================");
		System.out.println("\n(1)Push");
		System.out.println("\n(2)Pop");
		System.out.println("\n(3)Cetak Stack");

		do
		{
			System.out.print("\nSilahkan Masukkan Pilihan: ");
			try
			{
				pilih = Integer.parseInt(read.readLine());
			}
			catch(IOException e){}

			switch (pilih)
			{
				case 1:
					System.out.print("Push:");
				try
				{
					in = data.readLine();
				}
				catch(IOException e){}
				push(in);
				break;

				case 2:
				in = pop();
					System.out.print("Pop:"+in);
				break;

				case 3:
				baca();
				break;

				case 0:
				break;

				default:
					System.out.println("Tidak ada pilihan, silahkan coba lagi\n");
				break;
			}
			System.out.println("\n");
		}
		while (pilih!=0);
	}
}
