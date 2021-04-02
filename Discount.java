import java.util.Scanner; 
class Discount
{
	public static void main(String args[])
	{
		double  dis,amount,markedprice,s;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter markedprice ");	
		markedprice=sc.nextDouble();
        System.out.print("enter discount percentage ");	
        dis=sc.nextDouble();			
        s=100-dis;
        amount= (s*markedprice)/100;
        System.out.println("amount after discount="+amount);
	}
}