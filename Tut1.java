
package tut1;

public class Tut1 {
    int l,b,h;
    static int x=4;
    
    
    
    
    void showDim(int length,int breadth,int height)
    {
    l=length;
    b=breadth;
    h=height;        
    } 
   
    
    
    
    static void mystati()
    {
    System.out.print(x);
    //System.out.print(l); error static variable cannot called in static method
    
    }
     static
    {
    System.out.println("static block 2 ");
    }
    
    
     void show()
    { 
     System.out.println(l+" "+b+" "+h);
     int a=4,c;
     int b=6;
     c=((a>b) ? a : b);
     
     System.out.println(+c+"static variable"+x);
     
    }
     
     //init blocks (instance initialization block) 
     
      {
     System.out.println("initialization block ");
        
        }
     
      
      //static initialization block
     static
    {
    System.out.println("static block1 ");
    }
     
    
    public static void main(String[] args) {  
        Tut1 t=new Tut1();
        
       
        t.showDim(2, 4, 6);
        t=new Tut1();
        t.show();
        
        
        
    }
}
