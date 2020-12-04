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
public class Rabbit extends Animal {
    public String color,name;

    public Rabbit(String name,boolean vegetarian, String food, int legs,String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        System.out.println("Peter color is grey");
        return color;
    }

    public String getName() {
        System.out.println("Hello,his name is Peter");
        return name;
    } 
}
