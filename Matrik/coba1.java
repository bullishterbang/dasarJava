class coba1
{
	public static void main (String[]args)
	{
		int x,y;

		System.out.println("Matriks X");
		System.out.println("");

		int [][] X = new int [2][2];
		X [0][0] = 1;
		X [0][1] = 2;
		X [1][0] = 3;
		X [1][1] = 4;

		for(x=0;x<2;x++){
			for(y=0;y<2;y++)
				System.out.print (X[x][y] + " ");
				System.out.println("");
			}

		System.out.println("\nMatriks Y");
		System.out.println("");

		int [][] Y = new int [2][2];
		Y [0][0] = 4;
		Y [0][1] = 3;
		Y [1][0] = 10;
		Y [1][1] = 1;

		for(x=0;x<2;x++){
			for(y=0;y<2;y++)
				System.out.print (Y[x][y] + " ");
				System.out.println("");
			}

		int [][] jumlah = new int[2][2];

		for(x=0;x<2;x++){
			for(y=0;y<2;y++)
				jumlah[x][y]=X[x][y]+Y[x][y];
			}

		System.out.println("\nJumlah Tiap Matrik X dan Y");
		for(x=0;x<2;x++){
			for(y=0;y<2;y++)
			System.out.println(jumlah [x][y]+" ");
			System.out.println("");
		}
	}
}