public class ChangeAdder {
    public static void main(String[] args){
        int quarters = 10;
        int dimes = 3;
        int nickels = 7;
        int pennies = 6;
        
        int cents = 25*quarters + 10*dimes + 5*nickels + pennies;
        System.out.print(cents/100 + "." + cents%100 + " dollars");
    }
}
