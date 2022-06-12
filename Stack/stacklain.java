class stacklain
{
	int stack[]=new int[6];
	public void push(int value)
	{
		if (stack[0]==0){
			stack[0]=value;
		}else if (stack[1]==0){
			stack[1]=value;
		}else if (stack[2]==0){
			stack[2]=value;
		}else if (stack[3]==0){
			stack[3]=value;
		}else if (stack[4]==0){
			stack[4]=value;
		}else if (stack[5]==0){
			stack[5]=value;
		}else{
			isiFull();}
	}

	public void isiFull()
	{
		System.out.println("STACK WES KEBAK");
	}
	public void pop()
	{
		if (stack [5]!=0){
			stack[5]=0;
		}else if (stack[4]!=0){
			stack[4]=0;
		}else if (stack[3]!=0){
			stack[3]=0;
		}else if (stack[2]!=0){
			stack[2]=0;
		}else if (stack[1]!=0){
			stack[1]=0;
		}else if(stack[0]!=0){
			stack[0]=0;
		}else{
			isiEmpty();}
	}

	public void isiEmpty()
	{
		System.out.println("STACK ISIH KOSONG");
	}

	public void clear()
	{
		stack[0]=0;
		stack[1]=0;
		stack[2]=0;
		stack[3]=0;
		stack[4]=0;
		stack[5]=0;
	}

	public void cetak()
	{
		for(int i=0;i<stack.length;i++)
		{
			if(stack[i]!=0){
				System.out.println(stack[i]+" ");}
		}
	}

	public static void main (String [] GNovregiNandiwardhana)
	{
		stacklain s=new stacklain();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		System.out.println("-----------PUSH----------");
		s.cetak();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("-----------POP-----------");
		s.cetak();
	}
}