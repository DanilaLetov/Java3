public class PhoneTest {
    public static void phone() {
        Phone phone1 = new MobilePhone("123456789", "iPhone", 0.2, true);
        Phone phone2 = new LandLinePhone("987654321", "Panasonic", 1.5, 12);
        Phone phone3 = new MobilePhone("555555555", "Samsung", false);

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.weight);

        System.out.println();

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вес: " + phone2.weight);

        System.out.println();

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.weight);

        System.out.println();

        phone1.receiveCall("John");
        phone2.receiveCall("Alice");
        phone3.receiveCall("Bob");

        System.out.println();

        ((MobilePhone) phone1).takePhoto();
        ((LandLinePhone) phone2).dialNumber("123456");

        System.out.println();

        phone3.sendMessage("111111111", "222222222", "333333333");
    }
}
