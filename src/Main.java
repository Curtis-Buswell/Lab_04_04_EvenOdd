public class Main {
    public static void main(String[] args) {
        int numToExamine = 2;
        int EVEN_OR_ODD_CHECKER = 2;
        int evenOrOddResult; evenOrOddResult = numToExamine % EVEN_OR_ODD_CHECKER;
        if (evenOrOddResult == 0)
            System.out.println("Your number, " + numToExamine + ", is even.");
        else
            System.out.println("Your number, " + numToExamine + ", is odd.");
    }
}