public class Demo2 {

    public static void main(String[] args) {
        long fact = 1;
        int num = Integer.parseInt(args[0]);
        int i = 1;
        while (num >= i) {
            fact = fact * i;
            i++;
            {
                System.out.println("the Descending order is " + i);

            }
        }
    }
}               
