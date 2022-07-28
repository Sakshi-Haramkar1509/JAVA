
public class Demo6 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i , sum = 0;
        for(i = 0; i <a.length;i++);
        {
            a[i]= Integer.parseInt(args[i]);
            a[0]= Integer.parseInt(args[0]);
        }
        System.out.println("Sum of elements="+sum);
        for(i=0; i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of elements="+sum);
    } 
    
}
