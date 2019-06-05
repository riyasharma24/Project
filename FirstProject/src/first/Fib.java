package first;

public class Fib {

	public static void main(String[] args) {
		int n = 20, a1=0, a2=1;
		
		for(int i=1;i<=n;++i) {
			
		System.out.print(a1 + " +");
		int sum=a1+a2;
		a1=a2;
		a2=sum;
		}
		
		// TODO Auto-generated method stub

	}

}
