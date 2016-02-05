package world;

public class Oak extends Plant {
    
    public Oak() {
        
        // Won't work -- type is private
        // type = "tree";
        
        // This works --- size is protected, Oak is a subclass of plant and is within the same package.
        this.size = "large";
        // this kw is not compulsory
        
        // No access specifier; works because Oak and Plant in same package
        this.height = 10;
    }

}