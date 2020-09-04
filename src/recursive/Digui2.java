package recursive;

import java.math.BigInteger;

public class Digui2 {
	public BigInteger sum(int i) {
		if (i == 1) {
			return BigInteger.ONE;
		}
//		System.out.println(BigInteger.valueOf(i).multiply(sum(i-1)));
		return BigInteger.valueOf(i).multiply(sum(i-1));
	}
 
	public static void main(String[] args) {
		Digui2 test = new Digui2();
		try {
			System.out.println("计算结果：" + test.sum(5) + "!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 
