public class PhoneNumberConverter {
    public static String convertPhoneNumber(String phoneNumber) {
        String convertedNumber = "";

        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        if (phoneNumber.startsWith("+")) {
            String countryCode = digitsOnly.substring(0, digitsOnly.length() - 10);
            String number = digitsOnly.substring(digitsOnly.length() - 10);

            convertedNumber = "+" + countryCode + "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        } else if (phoneNumber.startsWith("8")) {

            String number = digitsOnly.substring(1);

            convertedNumber = "+7-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        }

        return convertedNumber;
    }

    public static void main() {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(convertPhoneNumber(phoneNumber1));
        System.out.println(convertPhoneNumber(phoneNumber2));
        System.out.println(convertPhoneNumber(phoneNumber3));
    }
}