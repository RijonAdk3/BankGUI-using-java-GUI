public class BankCard
{
    //Declaration of the attributes
    private int cardID;
    private int balanceAmount;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    //For initializing instance variables constructor of BankCard class
    public BankCard(int balanceAmount , int cardID , String bankAccount , String issuerBank)
    {
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }
    
    //accessor method for each attributes
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    public int getCardID()
    {
        return this.cardID;
    }
    
    public String getClientName()
    {
        return this.clientName;
    }
    //mutator method for balanceAmount and clientName
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    //display method for displaying the values of the attributes
    public void display()
    {
        if(this.clientName.equals("")){
            System.out.println("The clientname is not set in the clientName field.");
        }
        else{
            System.out.println("The Card ID of the client is:" + " " + getCardID());
            System.out.println("The Client name is:" + " " + getClientName());
            System.out.println("The Issuer Bank is:" + " " +getIssuerBank());
            System.out.println("The Bank account is:" + " " + getBankAccount());
            System.out.println("The Balance amount is:" + " " + getBalanceAmount());
        }
    }
}
