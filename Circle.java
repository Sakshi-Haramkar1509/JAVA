public class Circle {
    static void area(int R){
        int r;
        r=R;
        double A= 3.14*r*r;
        System.out.println("Area of Circle="+A);
    }
    static void circum (int a)
    {
        System.out.println("Circumfarance of Circle="+(2*3.14*a));

    }
    public static void main(String args[]){
        area(20);
        circum(20);
    }
        

    }
    

