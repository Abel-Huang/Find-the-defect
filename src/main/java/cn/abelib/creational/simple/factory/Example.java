package cn.abelib.creational.simple.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-24 00:23
 */
public class Example {
    public static void main(String[] args) {
        Animal cat = new AnimalFactory().getAnimal("cat");
        if (cat == null) {
            return;
        }
        cat.eat();
        Animal dog = new AnimalFactory().getAnimal(Dog.class);
        if (dog == null) {
            return;
        }
        dog.eat();
    }
}
