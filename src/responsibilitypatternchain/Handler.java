package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description: 处理器
 */
public abstract class Handler {

    /**
     * 处理者姓名
     */
    protected String name;

    /**
     * 下一个处理者
     */
    protected Handler nextHandler;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler(String name) {
        this.name = name;
    }

    /**
     * 马里奥的等级应高于boss才可以战胜
     *
     * @param mario
     * @return boolean
     */
    public abstract void process(Mario mario);

}
