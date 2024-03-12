public class User {

    String id; String name; double balance; String currency; String accountNbr;

    public User(String id, String name, double balance, String currency, String accountNbr) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.accountNbr = accountNbr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNbr() {
        return accountNbr;
    }

    public void setAccountNbr(String accountNbr) {
        this.accountNbr = accountNbr;
    }

}