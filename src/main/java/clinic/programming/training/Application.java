package clinic.programming.training;

import java.util.*;


public class Application {
    
    
		
		public List<String> greetings ;
		
		public Application(){
			System.out.println ("Inside Application COnstr");
			greetings = new ArrayList<>();
			greetings.add("CIAO");
			greetings.add("HELLO");
			greetings.add("BYE-BYE");
			greetings.add("BUONGIORNO");
			
		}
		
		public void greet(){
			for(String greet : greetings)
				System.out.println(greet);
		}
		
        
    

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}