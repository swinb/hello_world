package generic;

public class Powder {
    private Powder material;
    public Powder(){}
    public void setMaterial(Powder material){
        this.material = material;
    }
    public Powder getMaterial(){
        return material;
    }
    public String toString(){
        return "파우더";
    }
}
