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
 This abstract class name is Account, and it contains all the
 above-mentioned information.
 */
public abstract class Account {

    /*
     This is a private int, and its name is customerId.
     The value of customerId is 0.
     */
    private int customerId = 0;
    /*
     This is a private double, and its name is balance.
     The value of balance is 0.
     */
    private double balance = 0;
    /*
     This is a private double, and its name is overdraft.
     The value of overdraft is 0.
     */
    private double overdraft = 0;

    /*
      This is a default constructor of Account class, and it does not
      contain any parameters.
     */
    public Account() {
    }

    /*
     This is the second constructor, and it contains 3 parameters that you can
     find them here.
     
     @param customerId
     @param balance
     @param overdraft
     */
    public Account(int customerId, double balance, double overdraft) {
        setCustomerId(customerId);
        setBalance(balance);
        setOverdraft(overdraft);
    }

    /*
      This method gets the customerId that was entered by the user.
     
      @return this customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /*
       Creates a new customerId with a given customerId, and the only condition is the
       customerId cannot be less than or equal to zero. It will throw an exception.
     
       @param givenCustomerId
     */
    public void setCustomerId(int givenCustomerId) {
        if (givenCustomerId < 0) {
            throw new IllegalArgumentException("The customerId must be greater than zero");
        } else {
            this.customerId = givenCustomerId;
        }
    }

    /*
      This method gets the balance that was entered by the user.
     
      @return this balance
     */
    public double getBalance() {
        return balance;
    }

    /*
       Creates a new balance with a given balance, and the only condition is the
       customerId cannot be less than or equal to zero. It will throw an exception.
     
       @param givenBalance
     */
    public void setBalance(double givenBalance) {
        if (givenBalance < 0) {
            throw new IllegalArgumentException("The balance must be greater than zero");
        } else {
            this.balance = givenBalance;
        }
    }

    /*
      This method gets the overdraft that was entered by the user.
     
      @return this overdraft
     */
    public double getOverdraft() {
        return overdraft;
    }

    /*
       Creates a new overdraft with a given overdraft, and the only condition is the
       givenOverdraft cannot be less than or equal to zero. It will throw an exception.
     
       @param givenOverdraft
     */
    public void setOverdraft(double givenOverdraft) {
        if (givenOverdraft < 0) {
            throw new IllegalArgumentException("The overdraft must be greater than zero");
        } else {
            this.overdraft = givenOverdraft;
        }
    }

    /*
       Creates a new deposit with a given amount, and the only condition is the
       givenAmount cannot be less than or equal to zero. It will throw an exception.
     
       @param givenOverdraft
     */
    public void deposit(double givenAmount) {
        if (givenAmount < 0) {
            throw new IllegalArgumentException("The amount must be greater than zero");
        } else {
            balance += givenAmount;
        }
    }

    /**
     * This is an abstract withdraw, and the abstract method cannot have body.
     * This abstract method has 2 implementations.
     *
     * @return this withdraw
     */
    public abstract void withdraw(double amount);
}
