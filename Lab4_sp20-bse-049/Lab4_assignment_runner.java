
package lab.pkg4;


public class Lab4_assignment_runner {
    public static void main(String[] args){
        HotDogStand d1 = new HotDogStand(1122, 12);
	HotDogStand d2 = new HotDogStand(2233, 4);
	HotDogStand d3 = new HotDogStand(3344, 10);
		
	d1.justSold();
	d1.justSold();
	d1.justSold();
        
        d2.justSold();
	d2.justSold();
	d2.justSold();
        d2.justSold();
	d2.justSold();
	d2.justSold();
        
        d3.justSold();
	d3.justSold();
        System.out.println("d1 having id "+ d1.getID() + " sold " + d1.getHotDogsSold());
        System.out.println("d2 having id "+ d2.getID() + " sold " + d2.getHotDogsSold());
        System.out.println("d3 having id "+ d3.getID() + " sold " + d3.getHotDogsSold());
       
        
        
    }
}
