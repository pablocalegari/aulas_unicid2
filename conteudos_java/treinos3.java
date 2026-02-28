import java.util.Scanner;

public class Main {
    public static void main(String [] args){ //padronização do Java

        String nome; //declaração de variavel
        Byte idade;


        Scanner entradausuario = new Scanner(System.in); //atribuo a variavel entradausuario que vai ser um input

        System.out.println("Qual é o seu nome?");
        nome = entradausuario.nextLine(); //atribuo ao nome que vai ser um input e vai para próxima linha

        System.out.println("Qual é a sua idade?");
        idade = entradausuario.nextByte(); //atribuo ao numero que vai ser um input e vai para o próximo byte



        System.out.println("Olá meu nome é " + nome + " e minha idade é " + idade); //printa apenas

    }
}
