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
public class IF110119040Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int legs = 4;
       Rabbit rabbit = new Rabbit("food", false, "color", legs, "nama");
       rabbit.getName();
       rabbit.isVegetarian();
       rabbit.getEats();
       rabbit.getNoOflegs();
       rabbit.getColor();
    }
    
}
