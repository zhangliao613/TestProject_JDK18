package design.proxy.dynamic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

public class Test {
    public static void main(String[] args) {
        // 被代理的对象
        Subject realSubject = new RealSubject();

        /**
         * 通过InvocationHandlerImpl的构造器生成一个InvocationHandler对象,
         * 需要传入被代理对象作为参数
         */
        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();

        // 需要指定类装载器、一组接口及调用处理器生成动态代理类实例

        Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);

        System.out.println("动态代理对象的类型：" + subject.getClass().getName());
        subject.hello("Tom");
        subject.bye();
        
     // 将生成的字节码保存到本地，
//        createProxyClassFile();
    }
    
    private static void createProxyClassFile() {
        String name = "ProxySubject";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[] { Subject.class });
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(name + ".class");
            System.out.println((new File("hello")).getAbsolutePath());
            out.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != out)
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}