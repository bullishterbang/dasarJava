import java.util.Scanner;
class Tumpukan
	{
		private int ukuran;
		private long [] tumpukan;
		private int top;
		public Tumpukan(int s)
		{
			ukuran=s;
			tumpukan=new long [ukuran];
			top=-1;
		}

		public void push (long j)
		{
			tumpukan[++top]=j;
		}
		public long pop()
		{
			return tumpukan[top--];
		}
		public long peek()
		{
			return tumpukan[top];
		}
		public boolean isEmpty()
		{
			return (top == -1);
		}
		public boolean isFull()
		{
			return (top == ukuran-1);
		}
		public void baca()
		{
			int i=top;
			while (i>=0)
			{
				System.out.print(tumpukan[i]);
				System.out.print(" ");
				i--;
			}
			System.out.println(" ");
		}
}
class stackviakeyboard
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		int a,b,c,d;
		long nilai;
		Tumpukan stack = new Tumpukan(10);
		System.out.print ("Tumpukan ke-1: ");
		a = input.nextInt();
		System.out.print ("Tumpukan ke-2: ");
		b = input.nextInt();
		System.out.print ("Tumpukan ke-3: ");
		c = input.nextInt();
		System.out.print ("Tumpukan ke-4: ");
		d = input.nextInt();
		stack.push(a);
		stack.baca();stack.push(b);
		stack.baca();stack.push(c);
		stack.baca();stack.push(d);
		while(!stack.isEmpty())
		{
			nilai = stack.pop();
			System.out.print(nilai);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}