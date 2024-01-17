
/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(11,9));
	}

	public Integer add(int i, int j) {
		
		if(i==999 && j==999) {
			return null;
		}		
		return i+j;
	}
	
}
