/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.accesodatos;

/**
 *
 * @author 1CFGS08
 */
public class Animal {
    
    public void makeSound() {
    System.out.println("Grr...");
  }
}
class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}
class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof");
  }
}

