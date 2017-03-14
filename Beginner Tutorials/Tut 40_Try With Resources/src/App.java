// independent of App2, not with regard to files

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
    
}


public class App {

    public static void main(String[] args) {
        
        try(Temp temp = new Temp()) {
        	// close metodu da otomatik çaðýrmýþ oldu
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // alternatifi:
        /*	
        Temp temp = new Temp();
    	try {
			temp.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
        */

    }

}
/*
 Closing!
java.lang.Exception: oh no!
	at Temp.close(App.java:8)
	at App.main(App.java:21)
 */
