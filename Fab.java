public class Fab
{
		public static void main(String args[])
		{
			  System.out.println("�������������:");
			  int age = sc.nextInt();
				System.out.println("���������:"+age);
				System.out.println(method(5));
		} 
		public static int method(int n)
		{
				if(n==1||n==2)
						return 1;
				else
						return method(n-1)+method(n-2);
		}
}