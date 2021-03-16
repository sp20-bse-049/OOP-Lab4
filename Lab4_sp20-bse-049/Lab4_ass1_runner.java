/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;


public class Lab4_ass1_runner {
    public static void main(String[] args) {
        Marks st1 = new Marks();
        st1.display();
        Marks st2 = new Marks(23,45,67);
        st2.display();
        Marks st3 = new Marks();
        st3.setM1(10);
        st3.setM2(39);
        st3.setM3(30);
        st3.display();
        
    }
    
}
