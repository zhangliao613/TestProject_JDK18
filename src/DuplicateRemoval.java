  
 import java.text.SimpleDateFormat;   
 import java.util.*;   

  public class DuplicateRemoval {   
   public static void main(String[] args) {   
       List<Account> list = new ArrayList<Account>();   
       Calendar c = Calendar.getInstance();   
        c.add(Calendar.SECOND, 1);   
        Date date = c.getTime();   
        
        Account account1 = new Account(1, DuplicateRemoval.getFormat(date));   
        c.add(Calendar.HOUR, 1);   
        date = c.getTime();   
        list.add(account1);   
        list.add(account1); 
        
        Account account2 = new Account(2, DuplicateRemoval.getFormat(date));   
        c.add(Calendar.HOUR, 1);   
        date = c.getTime();   
        list.add(account2);   
        list.add(account2);   
        
        Account account3 = new Account(3, DuplicateRemoval.getFormat(date));   
        c.add(Calendar.HOUR, 1);   
        date = c.getTime();   
        list.add(account3);   
        list.add(account3);   
        
        Account account4 = new Account(4, DuplicateRemoval.getFormat(date));   
        c.add(Calendar.HOUR, 1);   
        date = c.getTime();   
        list.add(account4);   
        list.add(account4);   
        
        System.out.println(list.size());   
        
        Iterator it = list.iterator();   
        if (list != null && list.size() != 0) {   
            HashMap map = new HashMap();   
            while (it.hasNext()) {   
                Account account = (Account) it.next();   
                Account accountmap = (Account) map   
                        .get(account.getAccounttype());   
                if (accountmap == null) {   
                    map.put(account.getAccounttype(), account);   
                } else {   
                    it.remove();   
                }   
            }   
        }   
        it = list.iterator();   
        while (it.hasNext()) {   
            System.out.println("==="+it.next());   
        }   
    }   
  
    public static String getFormat(Date date) {   
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmss");   
        return dataFormat.format(date);   
    }   
 }   
  
  class Account {   
    private int accounttype;   
  
    private String applyTime;   
  
    public Account(int accounttype, String applyTime) {   
        this.accounttype = accounttype;   
        this.applyTime = applyTime;   
    }   
  
    public int getAccounttype() {   
        return accounttype;   
    }   
  
    public void setAccounttype(int accounttype) {   
        this.accounttype = accounttype;   
    }   
  
    public String getApplyTime() {   
        return applyTime;   
    }   
  
    public void setApplyTime(String applyTime) {   
        this.applyTime = applyTime;   
    }   
  
    public String toString() {   
        return this.getApplyTime() + this.getAccounttype();   
    }   
  }
