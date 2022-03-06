

		package collections;
		import java.util.HashSet;
		import java.util.TreeSet;
		public class collections 
		{
			public static void main(String[] args) 
			{
				HashSet<String> h=new HashSet<String>();
				h.add("chikitha");
				h.add("lucky");
				h.add("mounika");
				h.add("cherry");
				
				h.remove("mounika");
				TreeSet<String> t=new TreeSet<String>();
				t.add("oracle");
				t.add("c++");
				t.add("sql");
				t.add("js");
				t.add("java");
				t.add("python");
				
				System.out.println("before operations :"+t);
				t.remove("sap");
				t.remove("js");
				System.out.println("after removal of two :"+t);
				t.add("bootstrap");
				t.add("html");
				t.add("dot net");
				System.out.println("after the adding three:"+t);
				System.out.println("checking java is part or not?"+t.contains("java"));
				t.removeAll(t);
				System.out.println("after last operation:"+t);
				
			}

		

	}

