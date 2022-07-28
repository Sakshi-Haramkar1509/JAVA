public class Demo5 {
    static int area(int l, int  b){
        return  l*b;
    }
    static int Peri(int l,int b){
        return 2*(l+b);
        
    }
    public static void main(String args[]){
        System.out.println("Area"+area(10,20));
        System.out.println("Perimeter"+Peri(10,20));        
    }
    
}
