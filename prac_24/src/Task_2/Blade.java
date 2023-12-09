package Task_2;

interface Blade {
    void stab();
}

class FlambergBlade implements Blade {
    @Override
    public void stab() {
        System.out.println("Клинок с лезвием Фламберг");
    }
}
class DamassqueBlade implements Blade {
    @Override
    public void stab() {
        System.out.println("Клинок из Дамасской стали");
    }
}

class MagicBlade implements Blade {
    @Override
    public void stab() {
        System.out.println("Магический Клинок");
    }
}
