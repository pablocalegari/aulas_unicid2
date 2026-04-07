import java.util.Scanner;

public class Pessoa {
   private String nome;
   private int idade;
   private double alt;


    public String getNome(){
         return nome;
     }
     public void setNome (String nome){
         this.nome = nome;
     }


    public int getIdade(){
        return idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }

    public double getAlt(){
        return alt;
    }
    public void setAlt (double alt){
        this.alt = alt;
    }
}
