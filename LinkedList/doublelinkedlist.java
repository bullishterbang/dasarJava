import javax.swing.*;
public class doublelinkedlist
{
	public static void main(String args[])
	{
		classop Operasi=new classop();

		System.out.println("========================");
		System.out.println("   Double Linked List");
		System.out.println("========================");

		int jawab1=0, jawab3=0;

		do
		{
			String operasi=JOptionPane.showInputDialog
				("Operasi yang dapat anda pilih :\n1.Tambah\n2.Hapus\n3. Cetak");

			int op=Integer.parseInt(operasi);

			switch(op)
			{
				case 1:
				{
					do
					{
						String tambah=JOptionPane.showInputDialog("Menambahkan Node : ");
						System.out.print("\nMenambahkan ("+tambah+")");

						Operasi.Tambah(tambah);

						String jawab=JOptionPane.showInputDialog
							("Tekan '1' jika ingin menambahkan lagi, Tekan '2' jika ingin kembali");

						jawab1=Integer.parseInt(jawab);
					}
					while(jawab1==1);
				}
				break;

				case 2:
				{
					String hapus=JOptionPane.showInputDialog("Menghapus Node : ");
					System.out.print("\nMenghapus ("+hapus+")");

					Operasi.Hapus(hapus);
				}
				break;

				case 3:
				{
					System.out.println();

					Operasi.Cetak();
				}
				break;

				default:
				JOptionPane.showMessageDialog
					(null,"Maaf, Operasi yang anda pilih tidak ada", "LAPORAN", JOptionPane.ERROR_MESSAGE);
			}

			String jawab2=JOptionPane.showInputDialog
				("Tekan '1' Jika ingin memilih operasi yang lain");

			jawab3=Integer.parseInt(jawab2);
		}
		while(jawab3==1);

		JOptionPane.showMessageDialog
			(null,"TERIMAKASIH ATAS KUNJUNGAN ANDA","SAMPAI JUMPA",JOptionPane.INFORMATION_MESSAGE);
	}
}

//~*~

class classnd
{
	public String input;
	public classnd next;
	public classnd prev;
}

//~*~


class classop
{
	private classnd head, tail;
	public void classop()
	{
		head=null;
		tail=null;
	}

	public void Tambah(String tambah)
	{
		classnd node=new classnd();

		node.input=tambah;

		if(head==null)
		{
			head=tail=node;
		}
		else
		{
			node.prev=tail;
			tail.next=node;
			tail=tail.next;
		}
	}

	public void Hapus(String hapus)
	{
		classnd hapus1=head;

		while(hapus1!=null)
		{
			if(hapus.equals(hapus1.input))
			{
				if(hapus1==head)
				{
					head=hapus1.next;
					head.prev=null;
					hapus1=null;
					return;
				}
				else
				{
					if(hapus1.next==null)
					{
						tail=tail.prev;
						tail.next=null;
					}
					else
					{
						classnd bantu=hapus1.prev;
						bantu.next=hapus1.next;
						classnd bantu2=hapus1.next;
						bantu2.prev=bantu;
						hapus1=null;
					}

					return;
				}
			}
			else
			{
				hapus1=hapus1.next;
			}
		}

		if(hapus1==null)

		JOptionPane.showMessageDialog
			(null,"Maaf, Data yang akan anda hapus tidak ditemukan", "LAPORAN", JOptionPane.ERROR_MESSAGE);
	}

	public void Cetak()
	{
		String carcet=JOptionPane.showInputDialog
			("Cara cetak yang dapat anda pilih :\n1. Head -> Tail\n2. Tail -> Head");

		int crct=Integer.parseInt(carcet);

		switch(crct)
		{
			case 1:
			{
				classnd cetak=head;
				System.out.println("Cetak Head -> Tail : ");

				while(cetak!=null)
				{
					System.out.print(cetak.input+"->");
					cetak=cetak.next;
				}
				System.out.print("null");
				System.out.println();
			}
			break;

			case 2:
			{
				classnd cetak=tail;
				System.out.println("Cetak Tail -> Head : ");
				System.out.print("null");

				while(cetak!=null)
				{
					System.out.print("->"+cetak.input);
					cetak=cetak.prev;
				}
				System.out.println();
			}
			break;

			default:
			JOptionPane.showMessageDialog(null,"Maaf, Cara cetak yang anda pilih tidak ada", "LAPORAN", JOptionPane.ERROR_MESSAGE);
		}
	}
}