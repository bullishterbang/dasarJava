import java.io.*;
import java.util.Stack;
class inputstackpop
{
	public static void main(String[] args) throws Exception {
		Stack <Integer> lifo = new Stack <Integer>();
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,d;
		System.out.println("---------------------------------------------------\n");
		System.out.println("                        STACK");
		System.out.println("---------------------------------------------------\n");
		System.out.print("Masukkan berapa data yang anda input : ");
		a = Integer.parseInt(x.readLine());

		for(b=0; b<a; b++) {
			System.out.print("Masukkan datanya : ");

			c = Integer.parseInt(x.readLine());
			lifo.push(c);
		}
		System.out.println(" ");
		System.out.println("datanya               : "+lifo);
		System.out.println("Data yang paling atas : "+lifo.peek());
		System.out.println("Jumlah data           : "+lifo.size());
		System.out.println(" ");

		System.out.print("Berapa kali ingin melakukan pop : ");


		d = Integer.parseInt(x.readLine());

		for (b=0; b<d; b++)
		{
			System.out.println("Data pop : "+lifo.pop());
			System.out.println("Datanya  : "+lifo);
			System.out.println(" ");

		}

			System.out.println("Data yang paling atas : "+lifo.peek());
			System.out.println("Jumlahnya menjadi     : "+lifo.size());
	    }
}