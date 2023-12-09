import java.util.Scanner;

public class TestAuthor {

    public void test(){
        String name;
        String email;
        char gender;
        Author aut_1 = new Author("Killjoy", "Rogue@mgu.ru", 'm');
        Author aut_2 = new Author("Killjoy", "Rogue@mgu.ru", 'm');
        System.out.println(aut_1.toString());
        Scanner source = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = source.nextLine();
        aut_2.setName(name);
        System.out.println("Введите почту: ");
        email = source.nextLine();
        aut_2.setEmail(email);
        System.out.println("Выберите пол (m - мужской, f - женский): ");
        gender = source.findInLine(".").charAt(0);
        aut_2.setGender(gender);
        System.out.println(aut_2.toString());
    }

}
