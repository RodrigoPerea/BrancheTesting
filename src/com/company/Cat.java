package com.company;



public class Cat extends Animal {

  @Override
  public void makeSound(){
    System.out.println("Mijaw");
  }


  @Override
  public boolean eat(String foodType) {
    return true;
  }
}
