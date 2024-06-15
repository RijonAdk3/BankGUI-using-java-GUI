public class CreditCard extends BankCard
{
    //Declaration of the attributes
    private int CVCNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //For initializing instance variables constructor of CreditCard class
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, int balanceAmount, int CVCNumber, double interestRate,
    String expirationDate)
    {
        super(balanceAmount , cardID , bankAccount , issuerBank);//Calling superclass constructor
        super.setClientName(clientName);
        this.CVCNumber = CVCNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted=false;
        
    }
    
    //accessor method for each attributes
    public int getCVCNumber()
    {
        return this.CVCNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    //mutator method for creditLimit
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        if (this.isGranted) {
            System.out.println("Sorry, credit cannot be granted. Credit issued already");
            return;
        }
    
        if (creditLimit <= 2.5 * super.getBalanceAmount()) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            System.out.println("The creditLimit has been set sucessfully.");
        } else {
            System.out.println("The credit can't be issued.");
            this.isGranted = false; // make sure isGranted is set to false if credit limit is not granted
        }
    }
    
    
    //cancelCreditCard method to cancel credit
    public void cancelCreditCard()
    {
            this.CVCNumber=0;
            this.creditLimit=0;
            this.gracePeriod=0;
            this.isGranted=false;
            System.out.println("The credit has been cancelled");
    }
    
    //method overriding
    public void display()
    {
        super.display();//calling display method of superclass
        if(this.isGranted==true){
            System.out.println("The CVCNumber is:" +" "+ getCVCNumber());
            System.out.println("The InterestRate is:" +" "+ getInterestRate());
            System.out.println("The ExpirationDate is:" +" "+ getExpirationDate());
            System.out.println("The CreditLimit is:" +" "+ getCreditLimit());
            System.out.println("The GracePeriod is:" +" "+ getGracePeriod());
        }
        else{
            System.out.println("The CreditLimit and GracePeriod is not available for you");
            System.out.println("The CVCNumber is:" +" "+ getCVCNumber());
            System.out.println("The InterestRate is:" +" "+ getInterestRate());
            System.out.println("The ExpirationDate is:" +" "+ getExpirationDate());
        }
    }
}
    
