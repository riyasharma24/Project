package first;

class calc
{
	public int add(int i,int j) {
		return i+j;
	}
}
class caladv extends calc
{
	public int sub(int i, int j) {
		return i-j;
	}
}
class calveryadv extends caladv
{
	public int multiplication(int i,int j) {
		return i*j;
	}
}
public class DemoInheritance{
	public static void main(String[] args) {
		calveryadv c1 = new calveryadv();
		int result1 = c1.add(3,5);
		int result2 = c1.sub(9, 8);
		int result3 = c1.multiplication(5, 9);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	
		
		
	}


 




 
 





	
			
		
		
		
	
	


	

	
