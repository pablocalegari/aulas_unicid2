import java.util.Scanner;

public class Main {
    public static void main(String [] args){

/*Faça um programa que receba a quantidade e o valor de dois produtos, no
seguinte formato: quantidade1 valor1 quantidade2 valor2. O programa deve
calcular esses valores seguindo a fórmula total = (quantidade1 x valor1) +
(quantidade2 x valor2). O valor total deve ser apresentado no final da execução */


    
int quantidade1;
int valor1;
int quantidade2;
int valor2;

Scanner entradaUsuario = new Scanner(System.in);

System.out.println("Quanto é a primeira quantidade?");
quantidade1 = entradaUsuario.nextInt();

System.out.println("Quanto é o primeiro valor?");
valor1 = entradaUsuario.nextInt();

System.out.println("Quanto é a segunda quantidade?");
quantidade2 = entradaUsuario.nextInt();

System.out.println("Quanto é o segundo valor?");
valor2 =  entradaUsuario.nextInt();

System.out.print ("O resultado é: ")
System.out.println ( quantidade1 * valor1 + quantidade2 * valor2);

    }
}
