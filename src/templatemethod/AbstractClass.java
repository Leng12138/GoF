package templatemethod;

/**
 * @Author： lengning
 * @date： 2020/10/26
 * @Description: 抽象类
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {

        eat();

        work();

        if (check()) {
            sleep();
        }

    }

    public void eat() {
        System.out.println("吃饭！");
    }

    public abstract void work();

    public void sleep() {
        System.out.println("睡觉！");
    }

    /**
     * 钩子方法
     *
     * @return boolean
     */
    public boolean check() {
        return true;
    }

}
