
public class Number2 {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        if (a > b)
            for (a = 1; a <= 10; a++) {
                System.out.println("Enter the First number"+a);
                a++;
            }

        for (b = 1; b <= 20; b++) {
            System.out.println("Enter the second number"+b);
            b++;

        }
    }

}
