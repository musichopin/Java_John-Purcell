// import java.io.IOException;

public class Test {

    public void run() throws ServerException {
    	// "throws" is a kw and written lower case
		// whereas "ServerException" is upper case being a class
        
        // Some kind of return value from some complex process!
        // 0 = success
        // anything else = error code
        int code = 1;
        
        if(code != 0) {
            // Something's wrong!
        	
            //throw new IOException("Could not connect to server.");
        	// IOException class ý yaratýlmadan java.io.IOException import edilebilir
        	
            throw new ServerException("Could not connect to server.");
            // main method tarafýndan run metodu çaðrýldýðýndan 
    		// ServerException fýrlatýldý (?). 
            
            // exits the method 
            
            // eðer sadece print edilseydi outputta "Running successfully." yazýsý da gözükecekti
        }
        
        System.out.println("Running successfully.");
    }
}