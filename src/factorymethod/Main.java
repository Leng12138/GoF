package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 主函数
 */
public class Main {

    public static void main(String[] args) {
        Amimal dog;
        AbstractFactory abstractDogFactory;
        abstractDogFactory = new DogFactory();
        dog = abstractDogFactory.createAnimal();
        dog.show();
        System.out.println("=================");
        Amimal cat;
        AbstractFactory abstractCatFactory;
        abstractCatFactory = new CatFactory();
        cat = abstractCatFactory.createAnimal();
        cat.show();
    }

}
