package Singleton;

import java.util.HashMap;

public class RegSingleton {
    static private HashMap m_registry = new HashMap();
    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(), x);
    }

   
    protected RegSingleton() {
    }

    static public RegSingleton getInstance(String name) {
        if (name == null) {
            name = "name";
        }
        if (m_registry.get(name) == null) {
            try {
                m_registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("Error happened.");
            }
        }
        return (RegSingleton) (m_registry.get(name));
    }

   
}