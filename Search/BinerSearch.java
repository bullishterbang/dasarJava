import java.util.Scanner;
class BinerSearch
{
	public int pencarianBiner(int b[], int kunciPencarian, int low, int high)
	{
		int i,middle;
		while (low<=high)
		{
			middle = (low+high)/2;
			if (kunciPencarian==b[middle])
			return middle;

			else if(kunciPencarian<b[middle])
			high = middle-1;

			else low = middle+1;
		}
		return -1;
	}

	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		BinerSearch biner= new BinerSearch();
		int x,hasil;
		int data[]={9,13,14,26,34,69};
		System.out.print("Masukan data yang dicari : ");
		x=input.nextInt();
		hasil=biner.pencarianBiner(data, x, 0, data.length-1);
			if (hasil>=0)
		System.out.println("Data tersebut ada pada posisi ke-"+(hasil+1));
			else
		System.out.println("Data tidak ketemu !");
	}
}