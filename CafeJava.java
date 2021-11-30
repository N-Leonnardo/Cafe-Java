public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double capuccinoPrice = 2.5;
        double expressoPrice = 1.5;
        double lattesPrice = 2.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        boolean isReadyOrder5 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + "is " + isReadyOrder1 + " That your order is ready");
        System.out.println("*********************");
        System.out.println(generalGreeting + customer4);
        if( isReadyOrder4 == true){
            System.out.println(customer4 + " your order is ready");
        }
        else{
            System.out.println(customer4 + " your order is not ready");
        }
        System.out.println("*********************");

        System.out.println(generalGreeting + customer2); 
        System.out.println("Your total is: "+ (lattesPrice + lattesPrice));

        if( isReadyOrder2 == true){
            System.out.println(customer2 + " your order is ready");
        }
        else{
            System.out.println(customer2 + " your order is not ready");
        }
        System.out.println("*********************");
        System.out.println(generalGreeting + customer1);
        double Total = lattesPrice - expressoPrice;
        System.out.println("You owes " + (Total));
        // ** Your customer interaction print statements will go here ** //

    }
}
