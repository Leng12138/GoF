package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description: 三级boss
 */
public class Result extends Handler {

    public Result(String name) {
        super(name);
    }

    @Override
    public void process(Mario mario) {
        System.out.println("成功营救公主！");
    }

}
