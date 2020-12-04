/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.rabbit;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan biodata 
 * dengan metode pendekatan berbasis objek
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOflegs = legs;
    }
    
    

    public boolean isVegetarian() {
        System.out.println("Peter is Vegetarian? false");
        return vegetarian;
    }

    public String getEats() {
        System.out.println("Peter eats gress");
        return eats;
    }

    public int getNoOflegs() {
        System.out.println("peter has 4 legs");
        return noOflegs;
    }
}
