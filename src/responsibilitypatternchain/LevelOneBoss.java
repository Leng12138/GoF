package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description: 一级boss
 */
public class LevelOneBoss extends Handler {

    public LevelOneBoss(String name) {
        super(name);
    }

    @Override
    public void process(Mario mario) {
        String result = mario.getLevel() > 1 ? "胜利" : "失败";
        System.out.println("boss名字:" + this.name + ", " + mario.getName() + "等级:" + mario.getLevel() + ", 结果:" + result);
        if ("失败".equals(result)) {
            return;
        }
        nextHandler.process(mario);
    }

}
