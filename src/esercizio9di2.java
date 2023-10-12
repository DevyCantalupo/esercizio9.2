public class esercizio9di2 {
    public static String algebra(char z, int x, int y){
        switch (z){
            case '+':
                int somma = x + y;
                String StringSomma = Integer.toString(somma);
                return StringSomma;

            case '-':
                int resta = x + y;
                String StringResta = Integer.toString(resta);
                return StringResta;

            case '*':
                int moltiplicazione = x * y;
                String StringMoltiplicazione = Integer.toString(moltiplicazione);
                return StringMoltiplicazione;

            case '/':
                int divisione = x / y;
                String StringDivisione = Integer.toString(divisione);
                return StringDivisione;

            default:
                return "Error";
        }
    }
    public static void main(String[] args) {
        String risultato = algebra('*',9,9);
        System.out.println("risultato = " + risultato);
    }
}
