
package tut1;

public class Tut1 {
    int length,breadth;
    
     void setDim(int l,int b)
    {
        l=length;
        b=breadth;
    }
   
    
    void showDim()
    {
    System.out.println("Length is"+length+"Breadth is"+breadth);    
    } 
   
    public static void main(String[] args) {  
        Tut1 t=new Tut1();
        t.setDim(2,3);
        t.showDim();       
    }
}
