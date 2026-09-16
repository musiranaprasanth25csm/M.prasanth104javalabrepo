 class banks 
{
    public static void main(String[] args) 
	{
        Bank b;            
        b = new SBI();
        System.out.println("SBI rate: "  + b.getInterestRate()); 
        b = new HDFC();
        System.out.println("HDFC rate: " + b.getInterestRate()); 
        
        Bank[] banks = { new SBI(), new HDFC(), new Bank() };
        for (Bank bank : banks)
            System.out.println(bank.getInterestRate()); 
    }
}