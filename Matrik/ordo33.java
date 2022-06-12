import java.util.*;
class ordo33
	{
		Scanner input = new Scanner(System.in);

		public void inputData(int data [][])
		{
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print("("+(i+1)+" . "+(j+1)+")"+" : ");
					data[i][j]=input.nextInt();}
				}
		}

		public int [][] tambah(int AA[][],int BB[][])
		{
			int hasil [][]=new int[3][3];
			for(int  i=0;i<3;i++)
				for(int j=0;j<3;j++)
				hasil [i][j]=AA[i][j]+BB[i][j];
			return hasil;
		}

		public void tampilData(int data [][], char nama)
		{
			for(int  i=0;i<3;i++){
				for(int j=0;j<3;j++)
			System.out.print(nama+" ("+(i+1)+" . "+(j+1)+"):"+data[i][j]);
			System.out.println();}
		}

		public void tampilMatriks(int data [][], char nama)
		{
			for(int  i=0;i<3;i++){
				for(int j=0;j<3;j++)
			System.out.print(data[i][j]+" ");
			System.out.println();}
		}


		public static void main (String [] args)
		{
			int A[][]=new int[3][3];
			int B[][]=new int[3][3];
			int C[][]=new int[3][3];

			ordo33 jumlah = new ordo33();
			System.out.println("Masukan data Matriks A");
			jumlah.inputData(A);
			System.out.println("Masukan data Matriks B");
			jumlah.inputData(B);
			C=jumlah.tambah(A,B);
			jumlah.tampilData( C, 'C');
			jumlah.tampilMatriks( C,'C');
		}
	}