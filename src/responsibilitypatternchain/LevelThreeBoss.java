package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description: 三级boss
 */
public class LevelThreeBoss extends Handler {

    public LevelThreeBoss(String name) {
        super(name);
    }

    @Override
    public void process(Mario mario) {
        String result = mario.getLevel() > 3 ? "胜利" : "失败";
        System.out.println("boss名字:" + this.name + ", " + mario.getName() + "等级:" + mario.getLevel() + ", 结果:" + result);
        if ("失败".equals(result)) {
            return;
        }
        nextHandler.process(mario);
    }

}
