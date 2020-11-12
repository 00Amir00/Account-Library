package ghasemia;

/**
 * Assignment 2
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
public class Savings extends Account {

    /*
     This is a private double, and its name is interest_rate.
     The value of interest_rate is 0.
     */
    private double interest_rate = 0;


    /*
      This is a default constructor of Savings class, and it does not
      contain any parameters.
     */
    public Savings() {
    }

    /*
     This is the second constructor, and it contains 4 parameters that you can
     find them here.
     
     @param customerId
     @param balance
     @param overdraft
     @param interest_rate
     */
    public Savings(int customerId, double balance, double overdraft, double interest_rate) {
        super(customerId, balance, overdraft);
        setInterest_rate(interest_rate);
    }

    /*
      This method gets the interest_rate that was entered by the user.
     
      @return this interest_rate
     */
    public double getInterest_rate() {
        return interest_rate;
    }

    /*
       Creates a new interest_rate with a given interest_rate, and the only condition is the
       interest_rate cannot be less than or equal to zero. It will throw an exception.
     
       @param givenCustomerId
     */
    public void setInterest_rate(double givenInterest_rate) {
        if (givenInterest_rate < 0) {
            throw new IllegalArgumentException("The interest_rate must be greater than zero");
        } else {
            this.interest_rate = givenInterest_rate;
        }
    }

    /*
    It calculates the interest with multiplying balance with interest_rate
     */
    public void addInterest() {
        double interest = getBalance() * interest_rate;
    }

    /*
      This method return the String of getBalance
     
      @return this toString
     */
    @Override
    public String toString() {
        return String.format("Savings account" + getBalance());
    }

    /*
       This is a method that takes a parameter and calculates the remainning money.
     
       @param givenAmount
     */
    @Override
    public void withdraw(double givenAmount) {
        if (getBalance() >= givenAmount) {
            setBalance(getBalance() - givenAmount);
        } else {
            throw new IllegalArgumentException("Error: The number is more than what is in the savings account");
        }
    }

}
