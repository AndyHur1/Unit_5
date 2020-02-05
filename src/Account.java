public class Account {
    private String first;
    private String last;
    private int accNum;
    private double balance;

    public Account(String first, String last, int accNum){
        this.first=first;
        this.last=last;
        this.balance=balance;
        this.accNum=(int)Math.random()*998+1;
    }
    public Account(){
        this("","",0);
    }
    public Account(Account dup){
        this(dup.first,dup.last,dup.accNum);
    }

    public double getBalance() {
        return balance;
    }

    public String getFirst() {
        return first;
    }

    public int getAccNum() {
        return accNum;
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
public void depsoit

}
