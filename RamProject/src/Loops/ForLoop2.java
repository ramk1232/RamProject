package Loops;

public class ForLoop2 {
	int a=2, b=7,c=0;
	public void let() {
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ForLoop2 FF = new ForLoop2();
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			FF.let();
		}	
	}
}
