package simplefactory;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 简单工厂
 */
public class SimpleFactory {

    public static Animal createProduct(String type) {
        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                return null;
        }
    }

}
