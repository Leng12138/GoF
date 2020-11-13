package abstractfactory;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 抽象工厂接口
 */
public interface AbstractFactory {

    /**
     * 创建动物
     *
     * @return abstractfactory.Animal
     */
    Animal createAnimal();

    /**
     * 创建植物
     *
     * @return abstractfactory.Plant
     */
    Plant creatPlant();

}
