package generic;

public class Plastic {
    private Plastic material;
    public Plastic(){}
    public void setMaterial(Plastic material){
        this.material = material;
    }
    public Plastic getMaterial(){
        return material;
    }
    public String toString(){
        return "플라스틱";
    }

}
