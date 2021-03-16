
package lab.pkg4;


public class Marks {
    private int stMark1;
    private int stMark2 ; 
    private int stMark3;
    public Marks(){
        stMark1 = 0;
        stMark2 = 0;
        stMark3 = 0;
    }
    public Marks(int m1 , int m2 , int m3){
        stMark1 = m1;
        stMark2 = m2;
        stMark3 = m3;
    }
    public void setM1(int m1){
        stMark1 = m1;
    }
    public void setM2(int m2){
        stMark2 = m2;
    }
    public void setM3(int m3){
        stMark3 = m3;
    }
    public int setM1(){
        return stMark1;
    }
    public int setM2(){
        return stMark2;
    }
    public int setM3(){
        return stMark3;
    }
    public void display(){
        System.out.println("Studen1 has marks = " + stMark1 + " " + stMark2  +" " + stMark3);
    }
    
    

    
    public static void main(String[] args) {
        
                     
    }
    
}
