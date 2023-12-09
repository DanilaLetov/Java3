package Task_2;

abstract class BladeFactory<T extends Blade> {
    public abstract T createBlade();
}

class FlambergBladeFactory extends BladeFactory<FlambergBlade> {
    @Override
    public FlambergBlade createBlade() {
        return new FlambergBlade();
    }
}

class DamassqueBladeFactory extends BladeFactory {
    @Override
    public Blade createBlade() {
        return new DamassqueBlade();
    }
}

class MagicBladeFactory extends BladeFactory {
    @Override
    public Blade createBlade() {
        return new MagicBlade();
    }
}
