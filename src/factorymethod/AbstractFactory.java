package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 抽象工厂接口
 */
public interface AbstractFactory {

    /**
     * 创建动物
     *
     * @return factorymethod.Animal
     */
    Amimal createAnimal();

}
