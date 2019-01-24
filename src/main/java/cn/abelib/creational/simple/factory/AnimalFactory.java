package cn.abelib.creational.simple.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-24 00:26
 */
public class AnimalFactory {
    /**
     * 通过传入参数进行判断
     * @param type
     * @return
     */
    public Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }

    /**
     *  通过类型反射创建对象，可以方便的进行扩展
     * @param clazz
     * @return
     */
    public Animal getAnimal(Class clazz) {
        Animal animal = null;
        try {
            animal = (Animal) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return animal;
    }
}
