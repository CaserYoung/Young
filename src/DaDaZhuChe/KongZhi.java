package DaDaZhuChe;
import java.util.Scanner;
public class KongZhi {
    public static void main(String[] args) {
        System.out.println("-----------------------欢迎使用大大租车系统-------------------------");
        System.out.println("请输入是否租车：1是or0否");
        Scanner S1 = new Scanner(System.in);
        int C1 = S1.nextInt();
        Excel.getShow(C1);
        System.out.println("请输入你要租的车序号：");
        Scanner S2 = new Scanner(System.in);
        int C2 = S2.nextInt();
        Excel2.getShow(C2);
    }
}
