class ThisKey
{
	int sum;
	ThisKey(int sum)
	{
		this.sum=sum;
	}
	void display()
	{
		System.out.println("sum=" +sum);
	}
	public static void main(String[] args)
	{
		ThisKey obj=new ThisKey(500);
		obj.display();
	}
}