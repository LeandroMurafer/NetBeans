package animal_virtual;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ClassAnimal animal = new ClassAnimal(null, null, 0);
        String Nome, tipo;
        int escolha, idade;

        System.out.println("Antes de tudo, registre o seu animal primeiro");
        
        System.out.println("Qual o nome do seu animal?");
        Nome = scn.nextLine();
        animal.setNOME(Nome);
        
        System.out.println("E qual o tipo do seu animal?");
        tipo = scn.nextLine();
        animal.setTIPO(tipo);
        
        System.out.println("E Qual a idade de " + Nome + "?");
        idade = scn.nextInt();
        animal.setIDADE(idade);

        System.out.println("Seu animal foi registrado com sucesso!");
        do {
            System.out.println("\nO que você planeja fazer com " + Nome + "?");
            
            System.out.println("(1) Alimentar");
            System.out.println("(2) Brincar");
            System.out.println("(3) Dormir");
            System.out.println("\n(0) Encerrar o programa.");
            escolha = scn.nextInt();

            switch (escolha) {
                case 1:
                    
                    System.out.println("Otima escolha, vamos alimetar" + Nome + "Com a sua comida favorita!");
                    System.out.println("\n"+ Nome + " Está cheio");

                    break;
                case 2:
                 
                    System.out.println(""+ Nome +" adoraria brincar com você");
                    System.out.println("\nEstá cansado agora");
             break;
                case 3:
                    
                    System.out.println("" + Nome + " está dormindo, para acordalo execute outra opção");
                    
                    break;
                    
                case 0:
                    escolha = 0;
                    break;
                default:
                    System.out.println("Ops... opção não encontrada, escolha outra opção");
                    break;
            }
        } while (escolha != 0);
        scn.close();
    }
}

        