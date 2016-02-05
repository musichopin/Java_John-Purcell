package world;


class Something {
    
}

public class Plant {
    // Bad practice for instance variable is public
    public String name;
    
    // Accepetable practice --- it's final.
    public final static int ID = 8;
    
    private String type;
    
    protected String size;
    
    int height;
    
    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
        // this kws are needless
    }
}