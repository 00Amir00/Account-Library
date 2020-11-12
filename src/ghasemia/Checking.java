package ghasemia;

/**
 *
 * Program : Making a library
 *
 * This is a library, and it contains 3 classes. This class name is Account, and
 * it consists of 3 fields, 2 constructors, and getter and setter of fields.
 *
 * @author Amirmahdi Ghasemi, Novemeber 2020
 */
/*
   This class name is Savings, and it extends the account class. This class has
   all the above-mentioned information.
 */
public class Checking extends Account {

    /*
     This is a private double, and its name is transactionFee.
     The value of transactionFee is 0.
     */
    private double transactionFee = 0;

    /*
      This is a default constructor of Checking class, and it does not
      contain any parameters.
     */
    public Checking() {
    }

    /*
     This is the second constructor, and it contains 4 parameters that you can
     find them here.
     
     @param customerId
     @param balance
     @param overdraft
     @param transactionFee
     */
    public Checking(int customerId, double balance, double overdraft, double transactionFee) {
        super(customerId, balance, overdraft);
        setTransactionFee(transactionFee);
    }

    /*
      This method gets the transaction that was entered by the user.
     
      @return this transactionFee
     */
    public double getTransactionFee() {
        return transactionFee;
    }

    /*
       Creates a new transactionFee with a given transactionFee, and the only condition is the
       transactionFee cannot be less than or equal to zero. It will throw an exception.
     
       @param givenCustomerId
     */
    public void setTransactionFee(double transactionFee) {
        if (transactionFee < 0) {
            throw new IllegalArgumentException("The transactionFee must be greater than zero");
        } else {
            this.transactionFee = transactionFee;
        }
    }

    /*
      This method return the String of getBalance
     
      @return this toString
     */
    @Override
    public String toString() {
        return String.format("Checking account" + getBalance());
    }

    /*
       This is a method that takes a parameter and calculates the remainning money.
     
       @param givenAmount
     */
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            throw new IllegalArgumentException("Error: The number is more than what is in the checking account");
        }
    }

}
