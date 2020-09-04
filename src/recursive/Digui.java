package recursive;
public class Digui {
	public int sum(int i){
		int result;
		if(i==1){
			result = 1;
	   }else {
		   result = i+sum(i-1);
		   System.out.println(i+"===result==="+result);
	   }
	   return result;
	}  
	public static void main(String[] args) { 
	   Digui test=new Digui();  
	   System.out.println("计算结果："+test.sum(5)+"!");  
	}  
}
 
