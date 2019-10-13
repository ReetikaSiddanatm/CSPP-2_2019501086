class bank{
    public static void main(String[] args) {
        BankAccount person = new CheckingAccount();
        
        person.setaccount("35201258");
        person.setbal(500000.11);
        person.getaccount();
        person.getbal();
        System.out.println(person.toString());




        
    }

}
class BankAccount{
  String accountnumber;
  double balance; 
 BankAccount(){

 }
 BankAccount(String ac,double bal){
     this.accountnumber = ac;
     this.balance = bal;
 }
public String toString(){
    return (this.accountnumber + " "+ this.balance);
}
public void setaccount(String acb){
    this.accountnumber = acb;
}
public void setbal(double bala){
    this.balance = bala;
}
public String getaccount(){
    return this.accountnumber;
}
public double getbal(){
    return this.balance;
}
}
class CheckingAccount extends BankAccount{
    double limit;
    CheckingAccount(){

    }
     
}
class SavingAccount extends BankAccount{
     SavingAccount(){

     }
}
class CertificateofDevice extends BankAccount{

}