package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Handler levelOneBoss = new LevelOneBoss("一级boss");
        Handler levelTwoBoss = new LevelTwoBoss("二级boss");
        Handler levelThreeBoss = new LevelThreeBoss("三级boss");
        Handler result = new Result("结果");
        //创建责任链
        levelOneBoss.setNextHandler(levelTwoBoss);
        levelTwoBoss.setNextHandler(levelThreeBoss);
        levelThreeBoss.setNextHandler(result);
        //发起战斗
        levelOneBoss.process(new Mario("马里奥", 1));
        System.out.println("=====================================");
        levelOneBoss.process(new Mario("马里奥", 2));
        System.out.println("=====================================");
        levelOneBoss.process(new Mario("马里奥", 3));
        System.out.println("=====================================");
        levelOneBoss.process(new Mario("马里奥", 4));
    }

}
