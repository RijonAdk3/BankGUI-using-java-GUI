public class DebitCard extends BankCard
{
    //Declaration of the attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //For initializing instance variables constructor of DebitCard class
    public DebitCard(int balanceAmount , int cardID , String bankAccount , String issuerBank , String clientName , int pinNumber)
    {
    super(balanceAmount , cardID , bankAccount , issuerBank);//Calling superclass constructor
    super.setClientName(clientName);
    this.pinNumber=pinNumber;
    this.withdrawalAmount = 0;
    this.dateOfWithdrawal = "";
    this.hasWithdrawn = false;
    }
    
    //accessor method for each attributes
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //Mutator method for withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    //Withdraw method for withdrawing
    public void withdraw(int withdrawalAmount , String dateOfWithdrawal , int pinNumber)
    {
        if(this.pinNumber==pinNumber && withdrawalAmount<=super.getBalanceAmount()){
            {
                super.setBalanceAmount(getBalanceAmount()-withdrawalAmount);//Call to method in superclass to update balanceAmount
                this.setWithdrawalAmount(withdrawalAmount);
                this.dateOfWithdrawal=dateOfWithdrawal;
                this.hasWithdrawn = true;
                System.out.println("The amount has been withdrawn");
            }
        }   
            else if(withdrawalAmount>=super.getBalanceAmount()){
                System.out.println("The balance is insufficient.");
            }
            else{
                System.out.println("The pinNumber entered is invalid pinNumber.");
            }
    }
    //Method overriding
    public void display()
    {
        super.display();//calling display method of superclass
        if(hasWithdrawn==false){
            System.out.println("Your total balance is:" + " " + super.getBalanceAmount());
        }
        else{
            System.out.println("The pinNumber is:" +" "+ getPinNumber());
            System.out.println("The withdrawalAmount is:" + " " + getWithdrawalAmount());
            System.out.println("The dateOfWithdrawal is:" + " " + getDateOfWithdrawal());
        }
    }
    }

