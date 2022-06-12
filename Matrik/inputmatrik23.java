import java.util.*;
class inputmatrik23
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int nilai [][]=new int[2][3];
		System.out.println("Masukan Data Nilai");
		for(int b=0;b<2;b++){
			for(int k=0;k<3;k++){
				System.out.print("("+(b+1)+","+(k+1)+")"+": ");
				nilai[b][k]=input.nextInt();
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Data nilau yang dimasukan");
		for(int b=0;b<2;b++){
			for(int k=0;k<3;k++)
				System.out.print(nilai [b][k]+" ");
				System.out.println();
			}
	}
}