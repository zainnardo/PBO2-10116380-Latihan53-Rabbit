/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan53.rabbit;

/**
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang ciri ciri kelinci
 */
public class PBO210116380Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Rabbit tank = new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());
    }
        
    
    
}
