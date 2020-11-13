package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 具体动物狗
 */
public class Dog implements Amimal {

    @Override
    public void show() {
        System.out.println("我是狗，汪汪汪！");
    }

}
