package synch;

public class ProdConsSyn {
public static void main(String[] args) 
{
        
        Cubbyhole c = new Cubbyhole();
        
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        
        p1.start();
       // c1.start();
  }

}
