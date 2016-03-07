class Frog {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name; 
        // name parameter variable masked the name instance variable
        // that's why this kw used to refer to the instance variable
    }
    
    public void setAge(int age) {
        this.age = age; 
        // this kw is a reference to the object/instance we are in
        // this.age = frog1.age (ama frog1.age sadece main method'da kullanılabilir)
    }
    
    public String getName() {
        return name; // this kw is unnecessary
    }
    
    public int getAge() {
        return age;
    }
    
    public void setInfo(String name, int age) {
        setName(name); // this kw is unnecessary
        setAge(age);
    }
}

public class App {

    public static void main(String[] args) {
    
        Frog frog1 = new Frog();
        
        //frog1.name = "Bertie";
        //frog1.age = 1;
        
        frog1.setName("Bertie"); 
        // variable'lar private olmasına rağmen 
        // setter metodlar ile modifiye edilirken 
        // getter metodlar ile print ediliyor
        frog1.setAge(1);
        
        System.out.println(frog1.getName());
    }

}
/*
Bertie
*/