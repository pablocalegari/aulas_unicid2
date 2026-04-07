import java.util.Scanner;
public class Main {

    public static void main (String [] args ) {
Scanner entrada = new Scanner(System.in);


Pessoa mano = new Pessoa();


        System.out.println("Digite seu nome: ");
        String pegaNome = entrada.nextLine();
        mano.setNome(pegaNome);

        System.out.println("Digite sua idade: ");
        int pegaIdade= entrada.nextInt();
        mano.setIdade(pegaIdade);

        System.out.println("Digite sua altura: ");
        double pegaAlt = entrada.nextDouble();
        mano.setAlt(pegaAlt);





        System.out.println("Meu nome é: " + mano.getNome() + " e minha idade é: " + mano.getIdade() + " e minha altura é: " + mano.getAlt() );
    }





}
