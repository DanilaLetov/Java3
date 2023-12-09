public class LandLinePhone extends Phone {
    private int numberOfButtons;

    public LandLinePhone(String number, String model, double weight, int numberOfButtons) {
        super(number, model, weight);
        this.numberOfButtons = numberOfButtons;
    }

    public LandLinePhone(String number, String model, int numberOfButtons) {
        super(number, model);
        this.numberOfButtons = numberOfButtons;
    }

    public LandLinePhone(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public void dialNumber(String number) {
        System.out.println("Набирается номер " + number);
    }
}
