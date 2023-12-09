package Task_1;

public class Generic<T, V, K> {
    private T t;
    private V v;
    private K k;


    public Generic(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setK(K k) {
        this.k = k;
    }


}
