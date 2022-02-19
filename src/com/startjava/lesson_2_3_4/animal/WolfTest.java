package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("man");
        wolfOne.setNickname("Scary");
        wolfOne.setWeight(50);
        wolfOne.setAge(7);
        wolfOne.setColor("black");

        System.out.println(wolfOne.getGender() + "\n" + wolfOne.getNickname() + "\n" + wolfOne.getWeight() + "\n" + wolfOne.getAge() + "\n" + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
