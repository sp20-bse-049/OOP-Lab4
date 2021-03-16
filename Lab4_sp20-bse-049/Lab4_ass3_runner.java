
package lab.pkg4;


public class Lab4_ass3_runner {
    public static void main(String[] args){
       
        int[] R = new int [5];
        
        R[0] = 23;
        R[1] = 63;
        R[2] = 53;
        R[3] = 43;
        R[4] = 33;
        Student s1 =  new Student("Farhan",R);
        s1.Average();
        double av1 = s1.getAvg();
        String st1 = s1.getName();
        
        R[0] = 56;
        R[1] = 78;
        R[2] = 23;
        R[3] = 56;
        R[4] = 23;
        
        Student s2 =  new Student("Asad",R);
        s2.Average();
        double av2 = s2.getAvg();
        String st2 = s2.getName();
        // comparing both students average
        
        if (av1 > av2)
            System.out.println(st1 +" has greater average than " + st2);
        else if(av1 < av2)
            System.out.println(st2 +" has greater average than " + st1);
        else
            System.out.println("Both have same average.");
         
        
    }
    
}
