package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 猫工厂
 */
public class CatFactory implements AbstractFactory {

    @Override
    public Amimal createAnimal() {
        return new Cat();
    }

}
