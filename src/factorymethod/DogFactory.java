package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 狗工厂
 */
public class DogFactory implements AbstractFactory {

    @Override
    public Amimal createAnimal() {
        return new Dog();
    }

}
