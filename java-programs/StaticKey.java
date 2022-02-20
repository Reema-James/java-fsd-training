class StaticKey
{
	static int count=0;
	StaticKey()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		StaticKey a=new StaticKey();
		StaticKey b=new StaticKey();
		StaticKey c=new StaticKey();
	}
}