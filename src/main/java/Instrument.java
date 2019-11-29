public abstract class Instrument {

    private String name;
    private String material;
    private String colour;
    private String family;

    public Instrument(String name, String material, String colour, String family){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getFamily() {
        return family;
    }
}
