package base;

 
  public class VariableArguments {   
	  public static void main(String[] args) {
		    print("a");
		    print("a", "b");
		    print("a", "b", "c");
		}

		public static void print(String ... s){
		    for(String a: s)
		        System.out.println(a);
		}
 }
