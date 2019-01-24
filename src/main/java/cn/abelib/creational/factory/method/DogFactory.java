package cn.abelib.creational.factory.method;


import cn.abelib.creational.simple.factory.Animal;
import cn.abelib.creational.simple.factory.Dog;

/**
 * @Author: abel.huang
 * @Date: 2019-01-24 23:01
 */
public class DogFactory extends AbstractAnimalFactory {
    @Override
    public Animal getAnimal(){
        return new Dog();
    }
}
