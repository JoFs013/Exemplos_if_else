import javax.swing.JOptionPane;
import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valora;
        int valorb;

        System.out.println("Digite um número");
        valora = leitor.nextInt();
        // valora = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        System.out.println("Digite outro número");
        valorb = leitor.nextInt();
        // valorb = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um
        // número"));

        if (valora == valorb) {
            // JOptionPane.showMessageDialog(null, "Os números digitados são iguais");
            System.out.println("Os números digitados são iguais");
        } else {
            // JOptionPane.showMessageDialog(null, "Os números digitados são diferentes");
            System.out.println("Os números digitados são diferentes");
        }
    }
}