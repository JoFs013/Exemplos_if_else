import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Digite o valor de A");
        a = leitor.nextInt();

        System.out.println("Digite o valor de B");
        b = leitor.nextInt();

        System.out.println("Digite o valor de C");
        c = leitor.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A é o maior");
            } else {
                System.out.println("C é o maior");
            }
        } else {
            if (b > c) {
                System.out.println("B é o maior");
            } else {
                System.out.println("C é o maior");
            }
        }

    }

}
