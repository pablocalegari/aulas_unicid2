import java.util.Scanner;

public class Main {
    public static void main(String [] args){

    /*Crie um programa que receba quatro valores quaisquer e mostre a média e
soma entre eles. */

int num1;
int num2;
int num3;
int num4;

Scanner entradaUsuario = new Scanner(System.in);


System.out.println("Escreva o primeiro numero: ");
num1 = entradaUsuario.nextInt();

System.out.println("Escreva o segundo numero: ");
num2 = entradaUsuario.nextInt();

System.out.println("Escreva o terceiro numero: ");
num3 = entradaUsuario.nextInt();

System.out.println("Escreva o quarto numero: ");
num4 = entradaUsuario.nextInt();

System.out.print("A média é: ");
System.out.println(num1 + num2 + num3 + num4 /4);


System.out.print("A soma é: ");
        System.out.println(num1 + num2 + num3 + num4 );
    }
}
