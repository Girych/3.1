public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int m = 70;
        double h = 1.9;
        float imt = service.calculate(m, (float) h);
        System.out.println("Ваш Индекс массы тела = " + imt);
    }
}
