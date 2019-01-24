package cn.abelib.creational.factory.method;


import cn.abelib.creational.simple.factory.Animal;
import cn.abelib.creational.simple.factory.Cat;

/**
 * @Author: abel.huang
 * @Date: 2019-01-24 23:03
 */
public class CatFactory extends AbstractAnimalFactory {
    /**
     *  具体如何产生对象是由子类决定的
     * @return
     */
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
