import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner res = new Scanner(System.in);
        System.out.println("Insira o valor");
        int multiplier = res.nextInt();
        res.close();
        System.out.println("Tabela de multiplicação de " + multiplier);
        for(int i = 0 ; i <= 10; i++ ){
            System.out.println(i*multiplier);
        }
    }
}
