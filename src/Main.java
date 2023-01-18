import java.util.Scanner;

public class Main {

    /**
     * Ho creato il metodo dividendDivisor al di fuori del metodo main in cui ho creato uno scanner per permettere
     * all'utente di inserire i due numeri, dividend e divisor, a cui ho dato il numero che inserira l'utente.
     * Ho poi creato un if in cui mi assicuravo che nel caso in cui il divisor fosse uguale a 0 il programma non si
     * blocasse ma che lanciasse una ArithmeticException.
     * @throws ArithmeticException viene lanciata nel caso in cui il divisor e uguale a 0 e uscira il messaggio
     * "It's not possible to divide by 0".
     * Poi ho creato la division in cui divido dividend per divisor, ed infine ho inserito in un System.out division.
     * Ho anche aggiuto "throws ArithmeticException" all'inizio del metodo per indicare che questo metodo puo lanciare
     * eccezioni.
     */
    public static void dividendDivosr() throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a dividend and a divisor: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        if(divisor == 0){
            throw new ArithmeticException("It's not possible to divide by 0");
        }
        int division = dividend/divisor;
        System.out.println(division);
    }



    public static void main(String[] args) {

        /**
         * All'interno del main ho poi inserito il metodo all'interno di un try catch.
         * Nel try ho inserito il metodo che voglio provare e all'interno del catch ho inserito la tipologia di
         * eccezione devo gestire e che mi printasse il messaggio inserito precendentemente all'interno del metodo
         * in caso di eccezione.
         */
        try{
            Main.dividendDivosr();
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}