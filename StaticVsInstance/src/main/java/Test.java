
public class Test {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		
		A a2 = new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.instanceCount = 15;
		
		System.out.println("object a instanceCount: " + a.instanceCount);
		System.out.println("object a2 instanceCount: " + a2.instanceCount);
		
		System.out.println("class A staticCout: " + A.staticCount);
	}
	
}
