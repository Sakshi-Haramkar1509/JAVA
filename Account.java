class Account{
    int Acc_no , balance , Y;
    static double I =10.8;
    public Account(int j, int k) {
    }
    void addInterest(int Y){
        double SI= (balance *I*Y)/100;
        System.out.println("Simple Interest="+SI);
        System.out.println("Total balance="+(balance+SI));
         
    }
    void setdata(int Ac_no,int bal)
    {
        Acc_no=Ac_no;
        balance=bal;

    }
}
class Acc_Demo{
    public static void main(String[] args) {
        Account A1 =new Account(123,10000);
        A1.addInterest(2);
        Account A2= new Account(148, 20000);
        A2.addInterest(5);
    }
}