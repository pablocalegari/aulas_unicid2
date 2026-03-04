import java.util.Scanner;

public class Main {
    public static void main(String [] args){

    /*Faça um aplicativo que receba três valores inteiros na linha de comando e
mostre o maior dentre eles */

int num1;
int num2;
int num3;


Scanner entradaUsuario = new Scanner(System.in);

System.out.println("Digite um numero: ");
num1 = entradaUsuario.nextInt();

System.out.println("Digite mais um numero: ");
num2 = entradaUsuario.nextInt();

System.out.println("Digite outro numero: ");
num3 = entradaUsuario.nextInt();


if(num1 > num2 && num1 > num3){
    System.out.print("O maior número é: ");
    System.out.println(num1);
} if(num2 > num1 && num2 > num3){
    System.out.print("O maior número é: ");
    System.out.println(num2);
} if(num3 > num1 && num3> num2){
    System.out.print("O maior número é: ");
    System.out.println(num3);
        }




    }
}
