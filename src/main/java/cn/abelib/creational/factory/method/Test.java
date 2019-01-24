package cn.abelib.creational.factory.method;


import cn.abelib.creational.simple.factory.Animal;

/**
 * @Author: abel.huang
 * @Date: 2019-01-24 23:05
 */
public class Test {
    public static void main(String[] args) {
        AbstractAnimalFactory animalFactory = new DogFactory();
        Animal dog = animalFactory.getAnimal();
        dog.eat();
    }
}
