public class Java {
    public static void main(String[] args) {
    	
    	boolean user = true;
    	if ( user == true) {
    	System.out.println("it's true");
    	}
    	else {
    	System.out.println("it's false");
    	} 
    	
    	boolean user2 = false;
    	if ( !user2 ) { // if not true
    	System.out.println("it's false");
    	}
    	else {
    	System.out.println("it's true");
    	}
        
    	int a = 5;
		boolean b = a < 10; 
		if (b) { // if (b = a < 10)  veya if (b == true) da denebilirdi 
			// ilk sağlanan condition olduğu için bu condition sağlanır
			// if (!b) {...} dense idi if (b!=true){...} anlamına gelecekti 
			System.out.println("it is " + b);
		} else if (a < 15) {
			System.out.println("it is false");
		} else {
			System.out.println("none above");
		}
        // Some useful conditions:
    	boolean test = 7 <= 6; // assignment operations olan += veya -= ile karıştırma
    	// = ile (assignment operator) variable için assignment yapılırken,
    	// == ile (relational operator) testing gerçekleştirilir
    	System.out.println(test);
        System.out.println(5 == 5);
        System.out.println(10 != 11);
        System.out.println(3 < 6);
        System.out.println(10 > 100);
        
        // Using loops with "break": 
        int loop = 0;
        
        while(true) { // while true ile loop, break command ile sonlanana kadar devam eder
            System.out.println("Looping: " + loop);
            
            if(loop == 3) {
            	System.out.println("Continued");
            	loop++;
            	continue; // continue and break statements cannot be used only with if-else sta without a loop occuring
            }
            
            if(loop == 5) {
            	System.out.println("Terminated");
                break;
            }
            
            loop++;
        
            System.out.println("Running");
            
            
        }
    }
}
