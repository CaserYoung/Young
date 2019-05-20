package DaDaZhuChe;

class Excel {
    private static int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
    private static String[] carName = {"奥迪", "奔驰", "金杯", "依维柯", "五菱"};
    private static int[] carPrice = {45, 55, 17, 15, 5};
    private static int[] carPerson = {4, 4, 6, 8, 5};
    private static int[] carRong = {0, 0, 5, 5, 6};
    private static Excel show;


    public static Excel getShow(int a) {
        System.out.println("序号"+" "+"汽车名称"+" "+"租车价格"+" "+"载人"+"  "+"载物");
        if (a != 0) {
            for (int i = 0; i < carName.length; i++) {
                System.out.println(num[i]+"         "+carName[i]+"      "+carPrice[i]+"      "+carPerson[i]+"      "+carRong[i]);
            }
        }else {
            System.out.println("感谢您的使用！");
        }
        return new Excel();
    }
}
