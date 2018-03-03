
package tut1;

public class Tut1 {
   int x=10;
    static int y=20;
    
    
     void show()
    {
    int z=30;
    System.out.println("instance variable"+x);
    System.out.println("static variable"+y);
    System.out.println("local variable"+z);
    x++;
    y++;
    z++;
    }
    
    public static void main(String[] args) {  
        Tut1 t=new Tut1();
        Tut1 t1=new Tut1();
         Tut1 t2=new Tut1();
          Tut1 t3=new Tut1();
           Tut1 t4=new Tut1();
           t.show();
           t1.show();
           t2.show();
           t3.show();
           t4.show();
    }
}
////////////////////OUTPUT//////////////
instance variable10
static variable22
local variable30
instance variable10
static variable23
local variable30
instance variable10
static variable24
local variable30
