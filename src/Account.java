public class Account {
    private String first;
    private String last;
    private int AcctNum;
    private double balance;

    public Account(String first, String last, double balance){
        this.first=first;
        this.last=last;
        this.balance=balance;
        this.AcctNum=(int)Math.random()*998+1;
    }
    public Account(){
        this("","",0);
    }
    public Account(Account dup){
        this(dup.first,dup.last, dup.balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getFirst() {
        return first;
    }

    public int getAcctNum() {
        return AcctNum;
    }
    public String getLast(){
        return last;
}
public String setLast(String last){
       return this.last=last;

}
public String setFirst(String first){
        return this.first=first;
}
public void deposit(double money){
        balance+=money;
}
public boolean withdrawal(double money){
        if (balance>=money){
            balance-=money;
            return true;
        }else {
            return false;
        }

}
public String toString(){
        return "Customer Name: "+first+" "+last+"\n"+"Account #: "+AcctNum+"\n"+"Current Balance: $"+balance;
}


}
