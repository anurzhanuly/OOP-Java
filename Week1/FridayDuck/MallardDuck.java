package com.isaxved.Week1.Week1.FridayDuck;

public class MallardDuck extends Duck  {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }


}
