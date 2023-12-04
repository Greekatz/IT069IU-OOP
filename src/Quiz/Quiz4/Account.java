/*Implement a class Account with two private attribute balance and customerID.

The class have no public getter for any attribute.

Now, implement a function to compare whether 2 accounts objects are the same with respect to balance and customerID

 */

 // NguyenThanhHung_ITCSIU22051
package Quiz.Quiz4;
public class Account {
    private float balance;
    private int customerID;

    public Account(float balance, int customerID) {
        this.balance = balance;
        this.customerID = customerID;
    }

    
    
    // Method to compare 2 objects
    private float getBalance() {
        return balance;
    }



    private int getCustomerID() {
        return customerID;
    }



    public boolean CompareAccount(Account target) {
        return balance == target.balance && customerID == target.customerID ;
    }
    
    public static void main(String[] args) {
        Account account1 = new Account(500, 001);
        Account account2 = new Account(500, 001);

        if (account1.CompareAccount(account2)) {
            System.out.println("Two accounts have the same ID and balance");
        }
        else {
            System.out.println("No");
        }
    }
}