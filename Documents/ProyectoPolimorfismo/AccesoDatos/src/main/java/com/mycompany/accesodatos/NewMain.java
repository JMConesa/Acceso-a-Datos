/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.accesodatos;

/**
 *
 * @author 1CFGS08
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal gato= new Cat();
        Animal perro= new Dog();
        gato.makeSound();
        perro.makeSound();
        
        PoliPara pp= new PoliPara();
        
        pp.ejemplo(12, 14);
        pp.ejemplo("Rivaldo con la pelota ", 14);
        pp.ejemplo(3.5);
    }
    
}
