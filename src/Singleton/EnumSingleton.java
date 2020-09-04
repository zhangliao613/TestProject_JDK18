package Singleton;

public enum EnumSingleton {
/**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
*/

    uniqueInstance;

/**
     * 单例可以有自己的操作
*/
    public void singletonOperation(){
    	System.out.println("EnumSingleton");
//功能处理
    }
    
	public static void main (String []args) {
		EnumSingleton.uniqueInstance.singletonOperation();
	}
}
