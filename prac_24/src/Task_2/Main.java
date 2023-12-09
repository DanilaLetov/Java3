package Task_2;

public class Main {
    public static void main(String[] args) {
        BladeFactory flambergBladeFactory = new FlambergBladeFactory();
        Blade flambergBlade = flambergBladeFactory.createBlade();

        BladeFactory damassqueBladeFactory = new DamassqueBladeFactory();
        Blade damassqueBlade = damassqueBladeFactory.createBlade();

        BladeFactory magicBladeFactory = new MagicBladeFactory();
        Blade magicBlade = magicBladeFactory.createBlade();

        Client client = new Client();
        client.stab(flambergBlade);
        client.stab(damassqueBlade);
        client.stab(magicBlade);
    }
}
