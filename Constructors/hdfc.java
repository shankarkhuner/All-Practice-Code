class HDFCServer
{
	float AmountBal;//Bal--> 5000
	HDFCServer(float ab)
		{
			System.out.println("Please Account Get Created");
			this.AmountBal=ab;
		}
	void GetBalance()
		{
			System.out.println("Pleace Wait Withdrawing Your Amount ");
			System.out.println(AmountBal);
		}
	void SetBalance(float Withdrawing)
		{
			System.out.println("Your Balance is...");
			AmountBal = AmountBal-Withdrawing;
		}
}
class HDFCBank
{

	public static void main(String[] args) 
	{
		HDFCServer cust1 = new HDFCServer(5000);
		cust1.GetBalance();
		cust1.SetBalance(1000);
		cust1.GetBalance();
	}
}











//

//
