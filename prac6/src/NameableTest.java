import java.util.List;

public class NameableTest {
    public static void Namer() {
        Inquisition inquisition = new Inquisition();
        inquisition.setName("Инквизиция");

        Wizards wizards = new Wizards();
        wizards.setName("Колдуны");

        Cryptozoologists cryptozoologists = new Cryptozoologists();
        cryptozoologists.setName("Криптозоологи");

        List<Nameable> nameable = List.of(inquisition, wizards, cryptozoologists);

        nameable.forEach(
                it -> System.out.println(it.getName())
        );
    }
}