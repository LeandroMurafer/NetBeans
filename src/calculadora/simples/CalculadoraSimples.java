

package Calculadora.simples;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
        
     System.out.println("                 Calculadora                  ");
     while (true) {
        System.out.println("Digite o primeiro digito:");
        double numero1 = scn.nextDouble();
        
        System.out.println("Digite o segundo digito:");
        double numero2 = scn.nextDouble();
        
        System.out.println("Escolha o operador logico conforme a sua preferencia:");
        System.out.println("[+] Soma");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicação");
        System.out.println("[/] Divisão");
        System.out.println("Operação:");
        char operacao = scn.next().charAt(0);
        
        double resultado;
        
        switch (operacao){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("O resultado do calculo é:" + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("O resultado do calculo é:" + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("O resultado do calculo é:" + resultado);
                break;
            case '/':
                if (numero2 !=0){
                resultado = numero1 / numero2;
                System.out.println("O resultado do calculo é:" + resultado);
                } else {
                    System.out.println("Erro na divisão :(\n\nDivisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Tente novamente.");
                break;
            }
        
        String continuar;
            while (true) {
                System.out.print("\nDeseja fazer outra operação? (Sim / Não): ");
                continuar = scn.next();

                if (continuar.equalsIgnoreCase("Sim") || continuar.equalsIgnoreCase("Não")) {
                    break; 
                } else {
                    System.out.println("Opção inválida. Por favor, digite apenas 'Sim' para sim ou 'Não' para não.");
                }
            }

            if (continuar.equalsIgnoreCase("Não")) {
                System.out.println("Calculadora encerrada. Obrigado por usar!");
                break; 
            }
     }
       
     scn.close();
    }
}
    

        
     