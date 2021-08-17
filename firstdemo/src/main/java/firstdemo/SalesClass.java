package firstdemo;

public class SalesClass {
	public void display() {
		int[] arr= {23,24,25};
		int sum=0;
		for(int num:arr) {
			sum+=1;
			System.out.println(num);
		}
	    System.out.println(sum);
	}  
	public void print() {
		System.out.println("Print Array");
		display();
		
	}
	
}
