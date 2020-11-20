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
public class Animal {
     protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
      public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
