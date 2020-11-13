package templatemethod;

/**
 * @Author： lengning
 * @date： 2020/10/26
 * @Description: 主函数
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass teacher = new Teacher();
        teacher.templateMethod();
        System.out.println("=================");
        AbstractClass doctor = new Doctor();
        doctor.templateMethod();
    }

}
