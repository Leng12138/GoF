package simplefactory;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 主函数
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = SimpleFactory.createProduct("dog");
        if (dog != null) {
            dog.show();
        }
        System.out.println("============");
        Animal cat = SimpleFactory.createProduct("cat");
        if (cat != null) {
            cat.show();
        }
    }

}
