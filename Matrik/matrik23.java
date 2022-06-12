class matrik23
{
	public static void main(String [] args)
	{
		int matrik [][]=new int[2][3];
		matrik[0][0]=70 ;
		matrik[0][1]=18 ;
		matrik[0][2]=45 ;
		matrik[1][0]=75 ;
		matrik[1][1]=66 ;
		matrik[1][2]=69 ;

		int b,k;
		for(b=0;b<2;b++){
			for(k=0;k<3;k++)
			System.out.print(matrik[b][k]+" ");
			System.out.println("");
		}
	}
}