package fundamentals;
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
        double lattePrice = 2.5;
        double dripCoffeePrice = 1.5;
        int cappuccinoPrice = 3;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 ="Jimmy";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder2==true){
            System.out.println("Noah's Order is ready");
        }
        else{
            System.out.println("Noah's Order is not ready");
        }
        if(isReadyOrder3==true){
            System.out.println("Sam's Order is ready");
            System.out.println("Price is "+lattePrice*2);
        }
        else{
            System.out.println("Sam's Order is not ready");
            System.out.println("Price is "+lattePrice*2);
        }
        System.out.println("Jimmy's new total is "+ (lattePrice-dripCoffeePrice));
    }
}
