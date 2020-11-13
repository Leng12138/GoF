package strategy;

/**
 * @Author： lengning
 * @date： 2020/10/25
 * @Description: 主函数
 */
public class Main {

    public static void main(String[] args) {
        Context quickSortContext = new Context();
        Sort quickSort = new QuickSort();
        quickSortContext.setSort(quickSort);
        quickSortContext.sort();
        System.out.println("=================");
        Context maoPaoContext = new Context();
        Sort maoPaoSort = new MaoPaoSort();
        maoPaoContext.setSort(maoPaoSort);
        maoPaoContext.sort();
    }

}
