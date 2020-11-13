package factorymethod;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 具体动物猫
 */
public class Cat implements Amimal {

    @Override
    public void show() {
        System.out.println("我是猫，喵喵喵！");
    }

}
