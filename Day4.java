

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if( initialAge < 0 ){
            initialAge = 0 ;  
            System.out.println("Age is not valid, setting age to 0.") ; 
        }
        
        age = initialAge ; 
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String output ; 
        if( age < 13 ){
            //System.out.println("You are young.") ;
            output = "You are young." ;  
        }
        else if( age >= 13 && age < 18 ){
            //System.out.println("You are a teenager.")
            output = "You are a teenager." ; 
        }
        else{
            //System.out.println("You are old.")
            output = "You are old." ; 
        }
        
        System.out.println(output) ; 
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++ ; 
	}

