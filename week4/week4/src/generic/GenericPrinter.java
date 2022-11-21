package generic;

public class GenericPrinter<T> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return "재료는 " + material.toString() + "입니다.";
    }

}

