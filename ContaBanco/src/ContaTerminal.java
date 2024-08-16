import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            //criando um objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println(); // pular uma linha
            System.out.println("Olá, seja bem vindo ao Banco DIO, seu banco Digital!");
            System.out.println(); // pular uma linha
                        
            System.out.println("digite seu nome");
            String nome = scanner.next();
            System.out.println(); // pular uma linha

            System.out.println(" Agora, Por favor digite seu sobrenome");
            String sobrenome = scanner.next();
            System.out.println(); // pular uma linha

            System.out.println("Digite o número da sua Agencia");
            int agencia = scanner.nextInt();
            System.out.println(); // pular uma linha

            System.out.println("Digite o número da sua conta");
            String Conta = scanner.next();
            System.out.println(); // pular uma linha

            System.out.println("Qual é o saldo atual da sua conta?");
            double saldo = scanner.nextDouble();
            System.out.println(); // pular uma linha


            //imprimindo os dados informados pelo usuario
            System.out.println("Olá, " + nome + " " + sobrenome);
            System.out.println(); // pular uma linha
            System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + Conta);
            System.out.println("E o seu saldo de " + saldo + "$ já está disponível para saque! ");
            System.out.println(); // pular uma linha
    
    
    
        }
    
    
    
    }
    