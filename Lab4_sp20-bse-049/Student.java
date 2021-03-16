
package lab.pkg4;


public class Student {
    private String name;
    private int[] Result_array = new int[5];
    private double average;
    public Student(String n , int[] arr){
       name = n;
       for(int x=0 ; x<5 ; x++){
            Result_array[x] = arr[x]; 
       }
    }
    public void setResult_array(int[] arr){
         for(int x=0 ; x<5 ; x++){
            Result_array[x] = arr[x]; 
         }
    }
    public int[] getResult_array(){
        return Result_array;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public double getAvg(){
        return average;
    }
    public void Average(){
        int sum =0;
        for(int x = 0 ; x < 5 ; x++){
            sum += Result_array[x];
        }
        average = sum/5;
        System.out.println(name + " has average =  " + average);
    }

   
}
