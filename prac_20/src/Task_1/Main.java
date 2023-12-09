package Task_1;

public class Main {
    public static void main(String[] args) {

        Generic<String, Integer, Double> genericObj = new Generic<>("Viva Revolution", 17, 16.15);

        System.out.println("T: " + genericObj.getT());
        System.out.println("V: " + genericObj.getV());
        System.out.println("K: " + genericObj.getK());

        genericObj.setT("Viva Caesar");
        genericObj.setV(228);
        genericObj.setK(30.005);

        System.out.println("T: " + genericObj.getT());
        System.out.println("V: " + genericObj.getV());
        System.out.println("K: " + genericObj.getK());
    }
}
