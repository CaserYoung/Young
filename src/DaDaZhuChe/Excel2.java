package DaDaZhuChe;

class Excel2 {
    private static int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
    private static String[] carName = {"奥迪", "奔驰", "金杯", "依维柯", "五菱"};
    private static int[] carPrice = {45, 55, 17, 15, 5};
    private static int[] carPerson = {4, 4, 6, 8, 5};
    private static int[] carRong = {0, 0, 5, 5, 6};
    private static Excel2 show;

    public static Excel2 getShow(int a) {
        System.out.println("序号"+" "+"汽车名称"+" "+"租车价格"+" "+"载人"+"  "+"载物");
        switch (a) {
            case 1:
                System.out.println(num[0]+"     "+carName[0]+"     "+carPrice[0]+"     "+carPerson[0]+"      "+carRong[0]);break;
            case 2:
                System.out.println(num[1]+"     "+carName[1]+"     "+carPrice[1]+"     "+carPerson[1]+"      "+carRong[1]);break;
            case 3:
                System.out.println(num[2]+"     "+carName[2]+"     "+carPrice[2]+"     "+carPerson[2]+"      "+carRong[2]);break;
            case 4:
                System.out.println(num[3]+"     "+carName[3]+"     "+carPrice[3]+"     "+carPerson[3]+"      "+carRong[3]);break;
            case 5:
                System.out.println(num[4]+"     "+carName[4]+"     "+carPrice[4]+"     "+carPerson[4]+"      "+carRong[4]);break;
        }
        return new Excel2();
    }
}
