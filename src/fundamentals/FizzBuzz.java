package fundamentals;

public class FizzBuzz {

    public static void main(String[] args) {
        // ciclo per stampare i numeri da 1 a 100
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 ) && (i % 5 == 0)){
                // condizione and, se messa dopo sarà sempre falsa
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                // condizione se il numero è divisibile per 5
                System.out.println("Buzz");
            } else if ((i % 3 == 0 )) {
                // condizione se il numero è divisibile per 3
                System.out.println("Fizz");
            }else {
                // qualsiasi altro numero non corrisponda a nessuna condizione
                System.out.println(i);
            }
        }
    }
}
