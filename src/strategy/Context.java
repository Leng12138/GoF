package strategy;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 策略环境
 */
public class Context {

    private Sort sort;

    public void sort() {
        sort.sort();
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

}
