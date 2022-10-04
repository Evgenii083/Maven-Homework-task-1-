public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int amount = 1000;
        boolean registered = true;
        int expected = 30;

        long actual = service.calculate(amount, registered);
        System.out.println(expected + " / " + actual);
    }
}
