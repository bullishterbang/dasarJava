import java.util.Scanner;
class Tumpukan
{
	private int ukuran;
	private String[] tumpukan;
	private int top;
	public Tumpukan(int s)
	{
		ukuran = s;
		tumpukan = new String[ukuran];
		top = -1;
	}
	public void push(String j)
	{
		tumpukan[++top] = j;
	}
	public String pop()
	{
		return tumpukan[top--];
	}
	public String peek()
	{
		return tumpukan[top];
	}
	public boolean isEmpty()
	{
		return(top == -1);
	}
	public boolean isFull()
	{
		return(top == ukuran-1);
	}
	public void baca()
	{
		int i = top;
		while (i>=0)
		{
			System.out.print(tumpukan[i]);
			System.out.print(" ");
			i--;
		}
		System.out.println(" ");
	}
}
class stackviakeyboard2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		String a,b,c,d,e,nilai;
		Tumpukan stack = new Tumpukan(30);
		System.out.print ("Tumpukan ke-1: ");
		a = input.nextLine();
		System.out.print ("Tumpukan ke-2: ");
		b = input.nextLine();
		System.out.print ("Tumpukan ke-3: ");
		c = input.nextLine();
		System.out.print ("Tumpukan ke-4: ");
		d = input.nextLine();
		System.out.print ("Tumpukan ke-5: ");
		e = input.nextLine();
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.push(d);
		stack.push(e);
		while(!stack.isEmpty())
		{
			nilai = stack.pop();
			System.out.println(nilai);
			System.out.println();
		}
		System.out.println("--------POP 4X--------");
		stack.push(a);
		while(!stack.isEmpty())
		{
		nilai = stack.pop();
		System.out.println(nilai);
		System.out.println();
		}
	}
}