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
class stack
{
	public static void main (String [] args)
	{
		Tumpukan stack = new Tumpukan (10);
		stack.push(1);
		stack.baca();stack.push(2);
		stack.baca();stack.push(3);
		stack.baca();stack.push(4);
		while ( !stack.isEmpty())
		{
			long nilai=stack.pop();
			System.out.print(nilai);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}