
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.util.ArrayList;
public class BankGUI
{
    ArrayList<BankCard> BankCards = new ArrayList<BankCard>();
    private JFrame frame,debitCardFrame,creditCardFrame,withdrawFrame,setCreditLimitFrame;
 
    private JLabel cardIDLabel, cardIDLabelForCredit, balanceAmountLabel, balanceAmountLabelForCredit,
            clientNameLabel , clientNameLabelForCredit, issuerBankLabel , issuerBankLabelForCredit , 
            bankAccountLabel , bankAccountLabelForCredit, pinNumberLabel , pinNumberLabel2,
            withdrawalAmountLabel, cardIDLabelForWithdraw, cardIDLabelForCreditLimit,
            CVCNumberLabel , interestRateLabel , gracePeriodLabel, creditLimitLabel;
 
     private JTextField cardIDTextField, cardIDTextFieldForCredit, balanceAmountTextField, balanceAmountTextFieldForCredit,
             clientNameTextField, clientNameTextFieldForCredit, issuerBankTextFieldForCredit, issuerBankTextField, 
             bankAccountTextField , bankAccounTextFieldForCredit, pinNumberTextField, pinNumberTextField2,
             withdrawalAmountTextField, cardIDTextFieldForWithdraw, CVCNumberTextField, creditLimitTextField, 
             interestRateTextField, gracePeriodTextField,cardIDTextFieldForCreditLimit;
     
     private JComboBox dateOfWithdrawalComboBox, dateOfWihdrawalComboBox2 ,dateOfWithdrawalComboBox3, expirationDateComboBox,
             expirationDateComboBox2, expirationDateComboBox3;
 
     private JButton addDebitCardButton, addCreditCardButton, withdrawButton, setCreditLimitButton,
             settingCreditLimitButton, cancelCreditCardButton, displayButton, displayButtonCreditCard,
             clearButton,clearButtonCreditCard, backButtonForCreditLimit , debitCardButton, creditCardButton,
             backButton, backButtonForCredit, withdrawButton2, exitButton;
     final static int INVALID=-1;

     //creating string of year
     String[] years={"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
                        "2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012",
                        "2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024",
                        "2025","2026","2027"};

     //creating string of months
     String[] months={"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep",
                         "Oct","Nov","Dec"};
     //creating string of days
     String[] days ={"Day","1","2","3","4","5","6","7","8","9","10","11",
                          "12","13","14","15","16","17","18","19","20",
                          "21","22","23","24","25","26","27","28","29",
                          "30"};


     public BankGUI()
     {
         //creating frame
        frame = new JFrame("MainFrame");
        frame.setSize(380,280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setResizable(false);
      
        //creating buttons for debitCard and creditCard
        debitCardButton = new JButton("DebitCard");
        debitCardButton.setBounds(60, 100, 100, 40);
        debitCardButton.setBackground(Color.DARK_GRAY);
        debitCardButton.setForeground(Color.WHITE);
        debitCardButton.setFocusPainted(false);
        creditCardButton = new JButton("CreditCard");
        creditCardButton.setBounds(200, 100, 100, 40);
        creditCardButton.setBackground(Color.DARK_GRAY);
        creditCardButton.setForeground(Color.WHITE);
        creditCardButton.setFocusPainted(false);
        frame.add(debitCardButton);
        frame.add(creditCardButton);
      
    
        //creating another frame for DebitCard
        debitCardFrame = new JFrame("DebitCardFrame");
        debitCardFrame.setSize(520,580);
        debitCardFrame.setLayout(null);
        debitCardFrame.setLocationRelativeTo(null);
        debitCardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        debitCardFrame.setResizable(false);
        debitCardFrame.getContentPane().setBackground(Color.YELLOW);

              
        //creating labels for DebitCard frame
        balanceAmountLabel = new JLabel("Balance Amount :");
        balanceAmountLabel.setBounds(30,60,100,40);
        debitCardFrame.add(balanceAmountLabel);

        cardIDLabel = new JLabel("Card Id :");
        cardIDLabel.setBounds(30, 100, 100, 40);
        debitCardFrame.add(cardIDLabel);

        bankAccountLabel = new JLabel("Bank Account :");
        bankAccountLabel.setBounds(30, 140, 100, 40);
        debitCardFrame.add(bankAccountLabel);

        issuerBankLabel = new JLabel("Issuer Bank :");
        issuerBankLabel.setBounds(30, 200, 100, 40);
        debitCardFrame.add(issuerBankLabel);

        clientNameLabel = new JLabel("Client Name :");
        clientNameLabel.setBounds(30, 240, 100, 40);
        debitCardFrame.add(clientNameLabel);

        pinNumberLabel = new JLabel("Pin Number :");
        pinNumberLabel.setBounds(30,280, 120, 40);
        debitCardFrame.add(pinNumberLabel);

        //creating text field for balanceAmount
        balanceAmountTextField= new JTextField();
        balanceAmountTextField.setBounds(160,70,200,25);
        debitCardFrame.add(balanceAmountTextField);

        //creating text field for cardID
        cardIDTextField = new JTextField();
        cardIDTextField.setBounds(160, 110, 200, 25);
        debitCardFrame.add(cardIDTextField);

        //creating text field for bankAccount
        bankAccountTextField = new JTextField();
        bankAccountTextField.setBounds(160, 150, 200, 25);
        debitCardFrame.add(bankAccountTextField);
        
        //creating text field for issuerBank
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(160, 210, 200, 25);
        debitCardFrame.add(issuerBankTextField);

        //creating text field for clientName
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(160, 250, 200, 25);
        debitCardFrame.add(clientNameTextField);

        //creating text field for pinNumber
        pinNumberTextField = new JTextField();
        pinNumberTextField.setBounds(160, 290, 200, 25);
        debitCardFrame.add(pinNumberTextField);


        //creating buttons for debitCard frame
        addDebitCardButton = new JButton("Add a Debit Card");
        addDebitCardButton.setBounds(160, 340, 200, 40);
        addDebitCardButton.setBackground(Color.LIGHT_GRAY);
        addDebitCardButton.setForeground(Color.BLACK);
        addDebitCardButton.setFocusPainted(false);
        debitCardFrame.add(addDebitCardButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(160, 410, 200, 40);
        withdrawButton.setBackground(Color.LIGHT_GRAY);
        withdrawButton.setForeground(Color.BLACK);
        withdrawButton.setFocusPainted(false);
        debitCardFrame.add(withdrawButton);

        displayButton = new JButton("Display");
        displayButton.setBounds(10, 375, 90, 40);
        displayButton.setBackground(Color.DARK_GRAY);
        displayButton.setForeground(Color.WHITE);
        displayButton.setFocusPainted(false);
        debitCardFrame.add(displayButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 375, 90, 40);
        clearButton.setBackground(Color.DARK_GRAY);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        debitCardFrame.add(clearButton);

        backButton = new JButton("Back");
        backButton.setBounds(160,480,200,40);
        backButton.setBackground(Color.DARK_GRAY);
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        debitCardFrame.add(backButton);
        

        //creating frame for withdraw
        withdrawFrame = new JFrame(" Withdraw ");
        withdrawFrame.setSize(400,280);
        withdrawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        withdrawFrame.setLocationRelativeTo(null);
        withdrawFrame.setResizable(false);
        withdrawFrame.setLayout(null);

        //creating cardIDLabel for withdraw
        cardIDLabelForWithdraw = new JLabel("Card Id :");
        cardIDLabelForWithdraw.setBounds(10,10,200,40);
        withdrawFrame.add(cardIDLabelForWithdraw);

        //creating cardIDTextFieldForWithdraw
        cardIDTextFieldForWithdraw = new JTextField();
        cardIDTextFieldForWithdraw.setBounds(160, 20, 200, 25);
        withdrawFrame.add(cardIDTextFieldForWithdraw);

        //creating withdrawalAmount label
        withdrawalAmountLabel = new JLabel("Withdrawal Amount :");
        withdrawalAmountLabel.setBounds(10, 50, 120, 40);
        withdrawFrame.add(withdrawalAmountLabel);
        
        //creating text field for withdrawalAmount
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(160, 60, 200, 25);
        withdrawFrame.add(withdrawalAmountTextField);

        //creating label for pin Number
        pinNumberLabel2 = new JLabel("Pin Number :");
        pinNumberLabel2.setBounds(10, 90, 120, 40);
        withdrawFrame.add(pinNumberLabel2);


        //creating textfield for pinNumber
        pinNumberTextField2 = new JTextField();
        pinNumberTextField2.setBounds(160, 100, 200, 25);
        withdrawFrame.add(pinNumberTextField2);


        //creating withdraw button for withdrawframe
        withdrawButton2 = new JButton("Withdraw");
        withdrawButton2.setBackground(Color.LIGHT_GRAY);
        withdrawFrame.add(withdrawButton2);
        withdrawButton2.setBounds(160, 180, 200, 40);

        //creating exit button for withdrawframe
        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.WHITE);
        withdrawFrame.add(exitButton);
        exitButton.setBounds(20,180,90,40);
        
        //creating combobox for withdraw frame
        dateOfWithdrawalComboBox = new JComboBox<>(years);
        withdrawFrame.add(dateOfWithdrawalComboBox);
        dateOfWithdrawalComboBox.setBounds(160,140,60,30);

        dateOfWihdrawalComboBox2 = new JComboBox<>(months);
        withdrawFrame.add(dateOfWihdrawalComboBox2);
        dateOfWihdrawalComboBox2.setBounds(220,140,80,30);

        dateOfWithdrawalComboBox3 = new JComboBox<>(days);
        withdrawFrame.add(dateOfWithdrawalComboBox3);
        dateOfWithdrawalComboBox3.setBounds(300, 140, 60, 30);

        //creating frame for CreditCard 
        creditCardFrame = new JFrame("Credit Card");
        creditCardFrame.setSize(420,580);
        creditCardFrame.setLayout(null);
        creditCardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creditCardFrame.setResizable(false);
        creditCardFrame.setLocationRelativeTo(null);
        creditCardFrame.getContentPane().setBackground(Color.YELLOW);

        //creating labels for credit card frame
        cardIDLabelForCredit = new JLabel("Card Id :");
        cardIDLabelForCredit.setBounds(30,40,100,40);
        creditCardFrame.add(cardIDLabelForCredit);

        clientNameLabelForCredit = new JLabel("Client Name :");
        clientNameLabelForCredit.setBounds(30, 80, 100, 40);
        creditCardFrame.add(clientNameLabelForCredit);

        issuerBankLabelForCredit = new JLabel("Issuer Bank :");
        issuerBankLabelForCredit.setBounds(30, 120, 100, 40);
        creditCardFrame.add(issuerBankLabelForCredit);

        bankAccountLabelForCredit = new JLabel("Bank Account :");
        bankAccountLabelForCredit.setBounds(30, 160, 100, 40);
        creditCardFrame.add(bankAccountLabelForCredit);

        balanceAmountLabelForCredit = new JLabel("Balance Amount :");
        balanceAmountLabelForCredit.setBounds(30,200,100,40);
        creditCardFrame.add(balanceAmountLabelForCredit);

        CVCNumberLabel = new JLabel("CVC Number :");
        CVCNumberLabel.setBounds(30,240,100,40);
        creditCardFrame.add(CVCNumberLabel);

        interestRateLabel = new JLabel("Interest Rate :");
        interestRateLabel.setBounds(30,280,100,40);
        creditCardFrame.add(interestRateLabel);

        //creating textfield for cardID for creditCard frame
        cardIDTextFieldForCredit = new JTextField();
        cardIDTextFieldForCredit.setBounds(160, 50, 200, 25);
        creditCardFrame.add(cardIDTextFieldForCredit);

        //creating textfield for clientName for creditCard frame
        clientNameTextFieldForCredit = new JTextField();
        clientNameTextFieldForCredit.setBounds(160,90,200,25);
        creditCardFrame.add(clientNameTextFieldForCredit);

        
        //creating textfield for issuerBank for creditCard frame
        issuerBankTextFieldForCredit = new JTextField();
        issuerBankTextFieldForCredit.setBounds(160,130,200,25);
        creditCardFrame.add(issuerBankTextFieldForCredit);


        //creating text field for bankAccount for creditCard frame
        bankAccounTextFieldForCredit = new JTextField();
        bankAccounTextFieldForCredit.setBounds(160, 170, 200, 25);
        creditCardFrame.add(bankAccounTextFieldForCredit);


        //creating textfield for balanceAmount for creditCard frame
        balanceAmountTextFieldForCredit = new JTextField();
        balanceAmountTextFieldForCredit.setBounds(160,210,200,25);
        creditCardFrame.add(balanceAmountTextFieldForCredit);


        //creating textfield for CVCNumber for creditCard frame
        CVCNumberTextField = new JTextField();
        CVCNumberTextField.setBounds(160,250,200,25);
        creditCardFrame.add(CVCNumberTextField);


        //creating textfield for interestRate for creditCard frame
        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(160, 290, 200, 25);
        creditCardFrame.add(interestRateTextField);

        //creating comboBox for expirationDate for creditCard frame
        expirationDateComboBox = new JComboBox<>(years);
        creditCardFrame.add(expirationDateComboBox);
        expirationDateComboBox.setBounds(160,340,60,30);

        expirationDateComboBox2 = new JComboBox<>(months);
        creditCardFrame.add(expirationDateComboBox2);
        expirationDateComboBox2.setBounds(220,340,80,30);

        expirationDateComboBox3 = new JComboBox<>(days);
        creditCardFrame.add(expirationDateComboBox3);
        expirationDateComboBox3.setBounds(300, 340, 60, 30);


        //creating button to add a credit card for creditCardFrame
        addCreditCardButton = new JButton("Add a credit Card");
        addCreditCardButton.setBackground(Color.LIGHT_GRAY);
        addCreditCardButton.setForeground(Color.BLACK);
        creditCardFrame.add(addCreditCardButton);
        addCreditCardButton.setBounds(160, 390, 200, 40);

        //creating button for set credit Limit
        setCreditLimitButton = new JButton("Set credit limit");
        setCreditLimitButton.setBackground(Color.LIGHT_GRAY);
        setCreditLimitButton.setForeground(Color.BLACK);
        creditCardFrame.add(setCreditLimitButton);
        setCreditLimitButton.setBounds(160, 440, 200, 40);


        //creating button for cancelcreditcard
        cancelCreditCardButton = new JButton("Cancel");
        cancelCreditCardButton.setBackground(Color.LIGHT_GRAY);
        cancelCreditCardButton.setForeground(Color.BLACK);
        creditCardFrame.add(cancelCreditCardButton);
        cancelCreditCardButton.setBounds(30,420,90,40);

        //creating button for display
        displayButtonCreditCard = new JButton("Display");
        displayButtonCreditCard.setBackground(Color.LIGHT_GRAY);
        displayButtonCreditCard.setForeground(Color.BLACK);
        creditCardFrame.add(displayButtonCreditCard);
        displayButtonCreditCard.setBounds(30, 340, 90, 40);

        //creating button for clear
        clearButtonCreditCard = new JButton("Clear");
        clearButtonCreditCard.setBackground(Color.DARK_GRAY);
        clearButtonCreditCard.setForeground(Color.WHITE);
        creditCardFrame.add(clearButtonCreditCard);
        clearButtonCreditCard.setBounds(30, 490, 90, 40);

        //creating back button
        backButtonForCredit = new JButton("Back");
        backButtonForCredit.setBackground(Color.DARK_GRAY);
        backButtonForCredit.setForeground(Color.WHITE);
        creditCardFrame.add(backButtonForCredit);
        backButtonForCredit.setBounds(160,490,200,40);


        //creating frame for setCreditLimit
        setCreditLimitFrame = new JFrame("Set Credit Limit");
        setCreditLimitFrame.setSize(400,300);
        setCreditLimitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setCreditLimitFrame.setLayout(null);
        setCreditLimitFrame.setLocationRelativeTo(null);
        setCreditLimitFrame.setResizable(false);


        //creating label for setCreditLimitFrame
        cardIDLabelForCreditLimit = new JLabel("Card Id :");
        cardIDLabelForCreditLimit.setBounds(10,10,200,40);
        setCreditLimitFrame.add(cardIDLabelForCreditLimit);

        //creating cardId textfield for creditLimit frame
        cardIDTextFieldForCreditLimit = new JTextField();
        cardIDTextFieldForCreditLimit.setBounds(160,20,200,25);
        setCreditLimitFrame.add(cardIDTextFieldForCreditLimit);

        //creating label for gracePeriod
        gracePeriodLabel = new JLabel("Grace Period :");
        gracePeriodLabel.setBounds(10,50,200,40);
        setCreditLimitFrame.add(gracePeriodLabel);

        //creating textfield for gracePeriod
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(160,60,200,25);
        setCreditLimitFrame.add(gracePeriodTextField);

        //creating a label for creditLimit
        creditLimitLabel = new JLabel("Credit Limit :");
        creditLimitLabel.setBounds(10,90,200,40);
        setCreditLimitFrame.add(creditLimitLabel);

        //creating textfield for creditLimit
        creditLimitTextField = new JTextField();
        creditLimitTextField.setBounds(160,100,200,25);
        setCreditLimitFrame.add(creditLimitTextField);
       
       
        //creating set CreditLimit Button for credit limit
        settingCreditLimitButton = new JButton("Set Credit Limit");
        settingCreditLimitButton.setBackground(Color.LIGHT_GRAY);
        settingCreditLimitButton.setBounds(160, 150, 200, 40);
        setCreditLimitFrame.add(settingCreditLimitButton);
       
       
        //creating back button for creditlimit frame
        backButtonForCreditLimit = new JButton("Back");
        backButtonForCreditLimit.setBackground(Color.DARK_GRAY);
        backButtonForCreditLimit.setForeground(Color.WHITE);
        backButtonForCreditLimit.setBounds(10,150,100,40);
        setCreditLimitFrame.add(backButtonForCreditLimit);
       




        //adding action listener to the debitCardButton to make debitCardFrame visible
        debitCardButton.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                        debitCardFrame.setVisible(true);
                        frame.dispose();

                }
        });

        //adding action listener to the debitCardButton
        creditCardButton.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                        creditCardFrame.setVisible(true);
                        frame.dispose();

                }
        });

        //adding action listener to add debitcardbutton
        addDebitCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k){
            addDebitCard();
            }      
        });

        //adding actionlistener to display button of debit card
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l){
                displayDetails();
            }
        });

        //adding actionlistener to back button of debit card
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent j){
                debitCardFrame.dispose();
                frame.setVisible(true);
            }
        });


        //adding actionlistener to withdrawbutton2 to withdraw amount
        withdrawButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent q){
                withdrawFromDebitCard();
            }
        });


        //adding action listener to withdraw button
        withdrawButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent b){
                        withdrawFrame.setVisible(true);
                        withdrawFrame.getContentPane().setBackground(Color.YELLOW);
                }
        });

    
        //adding action listener to set creditLimit button for opening credit limit frame
        setCreditLimitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent s){
                setCreditLimitFrame.setVisible(true);
                setCreditLimitFrame.getContentPane().setBackground(Color.YELLOW);
            }
        });
        
        //adding action listener to back button 
        backButtonForCreditLimit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent u){
                creditCardFrame.setVisible(true);
                setCreditLimitFrame.dispose();;
            }
        });
        
        //adding action listener to credit card
        addCreditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c){
                addCreditCard();
            }
        });

        //adding actionlistener to display
        displayButtonCreditCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x){
                displayDetailsCreditCard();
            }
        });
        
        //ading actionListener to set creditLimit button of creditLimitFram
        settingCreditLimitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                grantCreditLimit() ;

            }
        });

        //adding actionListener to cancel button
        cancelCreditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent p){
                cancellingCreditCard();
            }
        });

        //adding actionListener to back button
        backButtonForCredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y){
                creditCardFrame.dispose();
                frame.setVisible(true);
            }
        });

        //clearing the textfields of debitCard
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent o){

                //clearing textfields
                balanceAmountTextField.setText("");
                cardIDTextField.setText("");
                bankAccountTextField.setText("");
                issuerBankTextField.setText("");
                clientNameTextField.setText("");
                pinNumberTextField.setText("");
                withdrawalAmountTextField.setText("");
                
                //resets comboBox
                dateOfWithdrawalComboBox.setSelectedIndex(0);
                dateOfWihdrawalComboBox2.setSelectedIndex(0);
                dateOfWithdrawalComboBox3.setSelectedIndex(0);
            }
        });

        //clearing textfields of creditcard
        clearButtonCreditCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l){

                //clearing textFields
                cardIDTextFieldForCredit.setText("");
                clientNameTextFieldForCredit.setText("");
                issuerBankTextFieldForCredit.setText("");
                bankAccounTextFieldForCredit.setText("");
                balanceAmountTextFieldForCredit.setText("");
                CVCNumberTextField.setText("");
                interestRateTextField.setText("");
                gracePeriodTextField.setText("");
                creditLimitTextField.setText("");

                //resets comboBox
                expirationDateComboBox.setSelectedIndex(0);
                expirationDateComboBox2.setSelectedIndex(0);
                expirationDateComboBox3.setSelectedIndex(0);

            }
        });

        //adding action listener to back button
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent t)
            {
                frame.setVisible(true);
                debitCardFrame.dispose();
            }
        });

        //adding action listener to the exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent z)
            {
                debitCardFrame.setVisible(true);
                withdrawFrame.dispose();
            }
        });

        //adding action listener to the creditCardButton
        creditCardButton.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                        creditCardFrame.setVisible(true);
                        frame.setVisible(false);
                }
        });

        frame.setVisible(true);
     }

    //creating getter method for the BalanceAmount textfield
    public int getBalanceAmount()
    {
        String balanceAmountText = balanceAmountTextField.getText().trim();
        int balanceAmount=INVALID;
        try{
            balanceAmount = Integer.parseInt(balanceAmountText);
            if(balanceAmount<0){
                balanceAmount=INVALID;
            }
        }
        catch(NumberFormatException g)
        {
            JOptionPane.showMessageDialog(debitCardFrame,"Invalid input for balance amount","Error",JOptionPane.ERROR_MESSAGE);
        }
        return balanceAmount;
    }


    //creating getter method for the cardID textfield
    public int getCardID()
    {
        String cardIDText = cardIDTextField.getText().trim();
        int cardID= INVALID;
        try{
            cardID = Integer.parseInt(cardIDText);
            if(cardID<=0){
            cardID = INVALID;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(debitCardFrame,"Invalid input for cardID","Error",JOptionPane.ERROR_MESSAGE);
        }
        return cardID;
    }


    //creating getter method for the BankAccount textfield
    public String getBankAccount()
    {
        return bankAccountTextField.getText().trim();
    }


    //creating getter method for the IssuerBank textfield
    public String getIssuerBank()
    {
        return issuerBankTextField.getText().trim();
    }

    //creating getter method for the ClientName textfield
    public String getClientName()
    {
        return clientNameTextField.getText().trim();
    }

    //creating getter method for the PinNumber textfield
    public int getPinNumber()
    {
        String pinNumberText = pinNumberTextField.getText().trim();
        int pinNumber = INVALID;
        try{
            pinNumber=Integer.parseInt(pinNumberText);
            if(pinNumber<=0){
                pinNumber=INVALID;
            }
        }
        catch(NumberFormatException j)
        {
            JOptionPane.showMessageDialog(debitCardFrame,"Invalid input for pin number","Error",JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }

     //creating getter method for withdrawalAmount of withdraw frame
    public int getWithdrawalAmount()
    {
        String withdrawalAmountText= withdrawalAmountTextField.getText().trim();
        int withdrawalAmount = INVALID;
        try{
            withdrawalAmount = Integer.parseInt(withdrawalAmountText);
            if(withdrawalAmount<=0){
                withdrawalAmount = INVALID;
            }
        }
        catch(NumberFormatException o)
        {
            JOptionPane.showMessageDialog(withdrawFrame,"Invalid input for withdrawalAmount","Error",JOptionPane.ERROR_MESSAGE);
        }
        return withdrawalAmount;
     }

    //creating getter method for the PinNumber textfield of withdraw frame
    public int getPinNumber2()
    {
        String pinNumberTextWithdraw = pinNumberTextField2.getText().trim();
        int pinNumberWithdraw = INVALID;
        try{
            pinNumberWithdraw=Integer.parseInt(pinNumberTextWithdraw);
            if(pinNumberWithdraw<=0){
                pinNumberWithdraw=INVALID;
            }
        }
        catch(NumberFormatException j)
        {
            JOptionPane.showMessageDialog(withdrawFrame,"Invalid input for pin number","Error",JOptionPane.ERROR_MESSAGE);
        }
        return pinNumberWithdraw;
    }

    //getter method for date of withdrawal of withdrawframe
    public String getDateOfWithdrawal() 
    {
        String date = "";
        String year = dateOfWithdrawalComboBox.getSelectedItem().toString();
        String month = dateOfWihdrawalComboBox2.getSelectedItem().toString();
        String day = dateOfWithdrawalComboBox3.getSelectedItem().toString();
        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = null;
            
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    // getter method for the cardID of withdraw frame
    public int getCardIDForWithdraw() {
        String cardIDTextForWithdraw = cardIDTextFieldForWithdraw.getText().trim();
        int cardID = INVALID;
        try {
            cardID = Integer.parseInt(cardIDTextForWithdraw);
            if (cardID <= 0) {
                cardID = INVALID;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(withdrawFrame, "Invalid input for cardID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cardID;
    }

    //getter methods for textfield of creditCard frame

    //getter method for cardID of creditCard frame
    public int getCardIDForCredit() {
        String cardIDTextForCredit = cardIDTextFieldForCredit.getText().trim();
        int cardID = INVALID;
        try {
            cardID = Integer.parseInt(cardIDTextForCredit);
            if (cardID <= 0) {
                cardID = INVALID;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(creditCardFrame, "Invalid input for cardID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cardID;
    }

    //getter method for clientName textfield of creditCard frame
    public String getClientNameForCredit(){
        return clientNameTextFieldForCredit.getText().trim();
    }

    //getter method for issuerBank textfield of creditCard frame
    public String getIssuerBankForCredit(){
        return issuerBankTextFieldForCredit.getText().trim();
    }

    //getter method for bankAccount textfield of creditCard frame
    public String getBankAccountForCredit(){
        return bankAccounTextFieldForCredit.getText().trim();
    }

    //getter method for balanceAmount textfield of creditCard frame
    public int getBalanceAmountForCredit() {
        String balanceAmountTextForCredit = balanceAmountTextFieldForCredit.getText().trim();
        int balanceAmount = INVALID;
        try {
            balanceAmount = Integer.parseInt(balanceAmountTextForCredit);
            if(balanceAmount<0){
                balanceAmount = INVALID;
            }
        }catch(NumberFormatException w){
            JOptionPane.showMessageDialog(creditCardFrame, "Invalid input for balance Amount", "Error",
             JOptionPane.ERROR_MESSAGE);

        }
        return balanceAmount;
    }

    //getter method for CVC number textfield of creditCard frame
    public int getCVCNumberForCredit(){
        String CVCNumberTextForCredit = CVCNumberTextField.getText().trim();
        int CVCNumber = INVALID;
        try{
            CVCNumber = Integer.parseInt(CVCNumberTextForCredit);
            if(CVCNumber<=0){
                CVCNumber=INVALID;
            }
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(creditCardFrame, "Invalid input for CVC Number", "Error", 
            JOptionPane.ERROR_MESSAGE);

        }
        return CVCNumber;
    }

    //getter method for interestRate textField of creditCard frame
    public double getInterestRate(){
        String interestRateTextForCredit = interestRateTextField.getText().trim();
        double interestRate = INVALID;
        try{
            interestRate = Double.parseDouble(interestRateTextForCredit);
            if(interestRate<=0){
                interestRate=INVALID;
            }
        }catch(NumberFormatException s){
            JOptionPane.showMessageDialog(creditCardFrame, "Invalid input for interestRate", "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
        return interestRate;
    }

    //getter method for date of expiration of credit limit frame
    public String getExpirationDate() 
    {
        String date = "";
        String year = expirationDateComboBox.getSelectedItem().toString();
        String month = expirationDateComboBox2.getSelectedItem().toString();
        String day = expirationDateComboBox3.getSelectedItem().toString();
        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }
    
    //getter method for CardID of credit limit frame
    public int getCardIDForCreditLimit()
    {
        String CardIDTextForCreditlimt = cardIDTextFieldForCreditLimit.getText().trim();
        int cardID = INVALID;
        try{
            cardID = Integer.parseInt(CardIDTextForCreditlimt);
            if(cardID<=0){
                cardID = INVALID;
            }
        }
        catch(NumberFormatException s){
            JOptionPane.showMessageDialog(setCreditLimitFrame,"Invalid input for cardID","Error",JOptionPane.ERROR_MESSAGE);
        }
        return cardID;
    }
    
    //getter method for gracePeriod of credit limit frame
    public int getGracePeriod()
    {
        String gracePeriodText = gracePeriodTextField.getText().trim();
        int gracePeriod = INVALID;
        try{
            gracePeriod = Integer.parseInt(gracePeriodText);
            if(gracePeriod<=0){
                gracePeriod = INVALID;
            }
        }
        catch(NumberFormatException s){
            JOptionPane.showMessageDialog(setCreditLimitFrame,"Invalid input for gracePeriod","Error",JOptionPane.ERROR_MESSAGE);
        }
        return gracePeriod;
    }
    
    //getter method for creditlimit of credit limit frame
    public double getCreditLimit()
    {
        String creditLimitText = creditLimitTextField.getText().trim();
        double creditLimit = INVALID;
        try{
            creditLimit = Double.parseDouble(creditLimitText);
            if(creditLimit<=0){
                creditLimit = INVALID;
            }
        }
        catch(NumberFormatException s){
            JOptionPane.showMessageDialog(setCreditLimitFrame,"Invalid input for creditLimit","Error",JOptionPane.ERROR_MESSAGE);
        }
        return creditLimit;
    }
    
    //method to add a debit card
    public void addDebitCard() 
    {
        int balanceAmount = getBalanceAmount();
            if (balanceAmount == INVALID) {
               JOptionPane.showMessageDialog(debitCardFrame,"Enter a positive value for balance amount","Error Box",
                                           JOptionPane.ERROR_MESSAGE);
               return;
        }
        
        int cardID = getCardID();
            if (cardID == INVALID) {
            JOptionPane.showMessageDialog(debitCardFrame,"Enter a positive value for card ID","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        //checking if the card with same cardid already exists or not
        for(BankCard card : BankCards){
            if(card.getCardID()==cardID){
                JOptionPane.showMessageDialog(debitCardFrame,"Card with same cardID already exist","Error Box",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
         String bankAccount = getBankAccount();
            if (bankAccount.equals("")) {
                JOptionPane.showMessageDialog(debitCardFrame,"Please don't leave the bank account field empty","Error Box",
                                           JOptionPane.ERROR_MESSAGE);
                return;
        }

        String issuerBank = getIssuerBank();
            if (issuerBank.equals("")) {
                JOptionPane.showMessageDialog(debitCardFrame,"Please don't leave the issuer bank field empty","Error Box",
                                 JOptionPane.ERROR_MESSAGE);
                return;
        }

        String clientName = getClientName();
            if (clientName.equals("")) {
                JOptionPane.showMessageDialog(debitCardFrame,"Please don't leave the client name field empty","Error Box",
                                              JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        int pinNumber = getPinNumber();
            if (pinNumber == INVALID) {
                JOptionPane.showMessageDialog(debitCardFrame,"Enter a positive value for pin number","Error Box",
                                              JOptionPane.ERROR_MESSAGE);
                return;
        }

        if(cardIDDistinct(cardID)){
        // Create DebitCard object only if all fields are valid and cardID is unique
        DebitCard obj = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber);
        BankCards.add(obj);

        JOptionPane.showMessageDialog(debitCardFrame,"Debit card added successfully!\nCard ID: " + obj.getCardID() + 
                                                 "\nBalance amount: " + obj.getBalanceAmount() + "\nPin number: " + 
                                                 obj.getPinNumber() + "\nIssuer bank: " + obj.getIssuerBank() + 
                                                 "\nClient name: " + obj.getClientName() + "\nBank account: " +
                                                  obj.getBankAccount(),"Success",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(withdrawFrame,"Please enter the unique cardID","Error box",JOptionPane.ERROR_MESSAGE);
        }
    }

    //creating method for withdrawing
    public void withdrawFromDebitCard() 
    {
        int withdrawalAmount = getWithdrawalAmount();
        String withdrawalDate = getDateOfWithdrawal();
        int pinNumber = getPinNumber2();
        int cardID = getCardIDForWithdraw();
        boolean debitCardFound=false;

        if(withdrawalDate==null){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter the date properly","Error Box",JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (BankCard card : BankCards) {
            if (card instanceof DebitCard) {
                if (card.getCardID() == cardID) {
                    ((DebitCard) card).withdraw(withdrawalAmount, withdrawalDate, pinNumber);
                    debitCardFound = true;
                    JOptionPane.showMessageDialog(withdrawFrame,"Please watch the terminal to know whether\n the amount has been withdrawn or not",
                                                  "Message",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                else{
                    debitCardFound = false;
                }
            }
        }
        if(!debitCardFound){
            JOptionPane.showMessageDialog(withdrawFrame,"Please enter the correct cardID!!","Error box",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //creating method for display details for debit card
    public void displayDetails() 
    {
        for (BankCard card : BankCards) {
            if (card instanceof DebitCard) {
                ((DebitCard) card).display();
            }
        }
    }

    //creating method to add credit card
    public void addCreditCard()
    {
        int cardID = getCardIDForCredit();
        if(cardID == INVALID){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter a positive value for card ID","Error Box",
                                              JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //checking that cardid is unique or not
        for(BankCard cards : BankCards){
            if(cards instanceof CreditCard && cards.getCardID() == cardID ){
                JOptionPane.showMessageDialog(creditCardFrame,"Card ID with same cardID already exits","Error Box",
                                              JOptionPane.ERROR_MESSAGE);
            return;
            }
        }

        String clientName = getClientNameForCredit();
        if(clientName.equals("")){
            JOptionPane.showMessageDialog(creditCardFrame,"Please don't leave the client Name field empty","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        String issuerBank = getIssuerBankForCredit();
        if(issuerBank.equals("")){
            JOptionPane.showMessageDialog(creditCardFrame,"Please don't leave the issuer Bank field empty","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        String bankAccount = getBankAccountForCredit();
        if(bankAccount.equals("")){
            JOptionPane.showMessageDialog(creditCardFrame,"Please don't leave the bank account field empty","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        int balanceAmount = getBalanceAmountForCredit();
        if(balanceAmount==INVALID){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter a positive value for balance amount","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        int CVCNumber = getCVCNumberForCredit();
        if(CVCNumber==INVALID){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter a positive value for CVC Number","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }

        double interestRate = getInterestRate();
        if(interestRate==INVALID){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter a positive value for interest rate","Error Box",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String expirationDate = getExpirationDate();
        if(expirationDate==null){
            JOptionPane.showMessageDialog(creditCardFrame,"Enter the date properly","Error Box",JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        //checking unique cadID for credit card
        if(cardIDUnique(cardID))
        {
            // Create creditCard object only if all fields are valid
            CreditCard cardcredit = new CreditCard(cardID, clientName, issuerBank, bankAccount, balanceAmount, CVCNumber, interestRate,expirationDate);

            BankCards.add(cardcredit);
    
            JOptionPane.showMessageDialog(creditCardFrame,"Credit card added successfully!\nCard ID: " + cardcredit.getCardID() + 
                                                     "\nBalance amount: " + cardcredit.getBalanceAmount() + "\nInterest Rate:"+
                                                      cardcredit.getInterestRate()+"\nExpiration Date:"+cardcredit.getExpirationDate()+
                                                      "\nCVC Number:"+ cardcredit.getCVCNumber() + "\nIssuer bank: " + cardcredit.getIssuerBank()+ 
                                                     "\nClient name: " + cardcredit.getClientName() + "\nBank account: " +
                                                      cardcredit.getBankAccount(),"Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(creditCardFrame,"Please enter the unique cardID","Error box",JOptionPane.ERROR_MESSAGE);
        }

    }


    //creating method for display details for debit card
    public void displayDetailsCreditCard() {
        for (BankCard card : BankCards) {
            if (card instanceof CreditCard) {
                ((CreditCard) card).display();
            }
        }
    }


    //boolean method to check unique cardId for debitcard
    public boolean cardIDDistinct(int cardID)
    {
        boolean isFound = true;
        for(BankCard card: BankCards)
        {
            if(card instanceof DebitCard){
            DebitCard debit = (DebitCard)card;
            if(debit.getCardID()==cardID){
                isFound=false;
                break;
            }
            }
        }
        return isFound;
    }


    //boolean method to check unique cardid for creditcard
    public boolean cardIDUnique(int cardID)
    {
        boolean exist=true;
        for(BankCard credit:BankCards)
        {
            if(credit instanceof CreditCard){
                CreditCard creditObj = (CreditCard)credit;
                if(creditObj.getCardID()==cardID){
                    exist=false;
                    break;
                }
            }
        }
        return exist;
    }
    

    //creating method to grant credit limit
    public void grantCreditLimit() {
        int cardID = getCardIDForCreditLimit();
        double creditLimit = getCreditLimit();
        int gracePeriod = getGracePeriod();
        boolean creditCardFound = false;
        for (BankCard card : BankCards) 
        {
            if (card instanceof CreditCard && card.getCardID() == cardID) {
                CreditCard creditCard = (CreditCard) card;
                creditCard.setCreditLimit(creditLimit, gracePeriod);
                JOptionPane.showMessageDialog(setCreditLimitFrame, "Credit limit for card ID " + cardID + " is set to " + creditLimit + 
                                              " with grace period " + gracePeriod);
                creditCardFound = true;
                return;
            }
            else{
                creditCardFound = false;
            }
        }
        if(!creditCardFound){
            JOptionPane.showMessageDialog(withdrawFrame,"Please enter the correct cardID to set creditLimit!!","Error box",JOptionPane.WARNING_MESSAGE);
        }
    }


    //creating method to cancel CreditCard
    public void cancellingCreditCard(){
        for (BankCard cancelCard : BankCards) 
        {
            if (cancelCard instanceof CreditCard) {
                ((CreditCard) cancelCard).cancelCreditCard();
                JOptionPane.showMessageDialog(creditCardFrame, "Credit card cancelled successfully","Cancelled creditCard",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    //main method 
    public static void main(String[] args)
    {
        //creating object of BankGui class 
        BankGUI obj= new BankGUI();
    }
}