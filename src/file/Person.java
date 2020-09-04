package file;

import java.io.Serializable;

public class Person implements Serializable
{
    static int age;
    transient String address;
    double height;
    public Person(int age, String address, double height)
    {
        this.age = age;
        this.address = address;
        this.height = height;
    }
}
