
package lab.pkg4;


public class HotDogStand {
    private int StandID;
    private int hotDogSold;
    private int totalSold ;
    public HotDogStand(){
        StandID = 0;
        hotDogSold = 0;
        totalSold = 0;
    }
    public HotDogStand(int id , int sold){
        StandID = id;
        hotDogSold = sold;
        totalSold += totalSold;
    }
    public int getID(){
        return  StandID ;
    }
    public int getHotDogsSold(){
	return hotDogSold;
    }
    public int getTotalSold(){
	return totalSold;
    }
    
    public void justSold(){
	hotDogSold++;
	totalSold++;
    }
    
    
}
