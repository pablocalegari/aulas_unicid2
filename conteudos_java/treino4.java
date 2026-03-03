import java.util.Scanner;

public class Main {
    public static void main(String [] args){
/* Crie um programa que recebe três nomes quaisquer por meio da linha de
execução do programa, e os imprima na tela da seguinte maneira: o primeiro e o
último nome serão impressos na primeira linha um após o outro, o outro nome
(segundo) será impresso na segunda linha. */

 String nome1 ; //definições de Strings
 String nome2 ;
 String nome3 ;

 Scanner entradaUsuario = new Scanner(System.in); //input do usuario


System.out.println("Qual o primeiro nome?"); //perguntas de nomes
nome1 = entradaUsuario.nextLine();

System.out.println("Qual o segundo nome?");
nome2 = entradaUsuario.nextLine();

System.out.println("Qual o terceiro nome?");
nome3 = entradaUsuario.nextLine();

        System.out.print("O primeiro nome é " + nome1 );
        System.out.println("O primeiro nome é " + nome3);
        System.out.println("O primeiro nome é " + nome2);

    }
}
