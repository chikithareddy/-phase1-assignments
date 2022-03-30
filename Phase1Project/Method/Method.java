package Method;

public class Method{
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}
	public static void main(String[] args) {
    Method b=new Method();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}


	//call by value
	public class callMethod {

	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[])
	{
		
		callMethod d = null;
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
	}




	}


