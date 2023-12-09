public class MobilePhone extends Phone {
    private boolean hasCamera;

    public MobilePhone(String number, String model, double weight, boolean hasCamera) {
        super(number, model, weight);
        this.hasCamera = hasCamera;
    }

    public MobilePhone(String number, String model, boolean hasCamera) {
        super(number, model);
        this.hasCamera = hasCamera;
    }

    public MobilePhone(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public void takePhoto() {
        if (hasCamera) {
            System.out.println("Фото сделано");
        } else {
            System.out.println("У телефона нет камеры");
        }
    }
}