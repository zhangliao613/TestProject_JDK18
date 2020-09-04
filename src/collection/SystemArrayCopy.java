package collection;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;

import net.sf.json.JSONArray;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

//import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/*System中提供了一个native方法arraycopy()*/  
public class SystemArrayCopy {  
    public static void main(String[] args) {  
       User [] users=new User[]{new User(1,"admin","admin@qq.com"),new User(2,"maco","maco@qq,com"),new User(3,"kitty","kitty@qq,com")};//初始化对象数组  
       
       for (User user : users){  
           System.out.println(user);  
       } 
       
       User [] target=new User[users.length];//新建一个目标对象数组  
       System.arraycopy(users, 0, target, 0, users.length-1);//实现复制  
       System.out.println("源对象与目标对象的物理地址是否一样："+(users[0] == target[0]?"浅复制":"深复制"));  
       target[0].setEmail("aaaa");  
       System.out.println("修改目标对象的属性值后源对象users：");  
       for (User user : users){  
           System.out.println(user);  
       }           
       
       for (User user : target){  
           System.out.println(user);  
       }     
    }  
}  
class User{  
    private Integer id;  
    private String username;  
    private String email;  
    //无参构造函数  
    public User() { }  
    //有参的构造函数  
    public User(Integer id, String username, String email) {  
        super();  
        this.id = id;  
        this.username = username;  
        this.email = email;  
    }  
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }  
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    @Override  
    public String toString() {  
        return "User [id=" + id + ", username=" + username + ", email=" + email  
                + "]";  
    }  
}
