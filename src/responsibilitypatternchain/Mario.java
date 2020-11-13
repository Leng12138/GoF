package responsibilitypatternchain;

/**
 * @Author： lengning
 * @date： 2020/11/5
 * @Description: 马里奥
 */
public class Mario {

    private String name;

    private Integer level;

    public Mario(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
