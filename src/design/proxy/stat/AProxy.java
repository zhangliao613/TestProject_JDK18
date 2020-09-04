package design.proxy.stat;

public class AProxy {
	AInterface obj = null;
	public AProxy(AInterface obj){
		this.obj = obj;
	}
	public void ProxySay(){
		obj.say();
	}
}
