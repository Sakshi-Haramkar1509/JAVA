public class Rect
{
	public static void main(String args[])
	{
	int L , B, A, P;
	L= Integer.parseInt(args[0]);
	B= Integer.parseInt(args
[1]);
	A= (L*B);
	P= 2*(L+B);
	System.out.println("Area of rect="+A);
	System.out.println("Area of parameter="+P);
}
}