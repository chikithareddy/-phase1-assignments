package Assignment29;

public class Stac {
	
	
	    	static final int MAX = 1000; 
	    	int top; 
	    	int a[] = new int[MAX];  
	  	boolean isEmpty() 
	    	{ 
	        		return (top < 0); 
	    	} 
	    	void Stack() 
	    	{ 
	        		top = -1; 
	    	} 
	  	boolean push1(int x) 
	    	{ 
	        		if (top >= (MAX-1)) 
	        		{ 
	            			System.out.println("Stack Overflow"); 
	            			return false; 
	        		} 
	        		else
	        		{ 
	            			a[++top] = x; 
	            			System.out.println(x + " pushed into stack"); 
	            			return true; 
	        		} 
	    	} 
	int pop1() 
	    	{ 
	        		if (top < 0) 
	        		{ 
	            			System.out.println("Stack Underflow"); 
	            			return 0; 
	        		} 
	        		else
	        		{ 
	            			int x = a[top--]; 
	            			return x; 
	        		} 
	    	} 
	    
	    	public static void main(String args[])
	{
	        		Stac s = new Stac(); 
	        		s.push1(10); 
	        		s.push1(20); 
	        		s.push1(30); 
	        		System.out.println(s.pop1() + " Popped from stack"); 
	    	}
	

	public void push(int i) {
		// TODO Auto-generated method stub
		
	}

	public String pop() {
		// TODO Auto-generated method stub
		return null;
	} 	


}
