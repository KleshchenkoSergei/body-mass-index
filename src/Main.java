public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 68;
        double height = 1.70;
        double index = service.calculate(weight, height);
        System.out.format("Ваш индекс массы: " + "%.2f", index);
    }
}
