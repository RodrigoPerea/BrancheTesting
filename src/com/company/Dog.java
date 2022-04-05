package com.company;

public class Dog extends Animal {


  @Override
  public void makeSound() {
    System.out.println("wow");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

}
