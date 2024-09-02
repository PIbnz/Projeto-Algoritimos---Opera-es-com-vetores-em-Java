/*
Entrega a Atividade 1 - Algoritmos e Programação II

Nós,

Pedro Ibanez Carvalho 
Lucas de Lima Benicio
Tadeu Henrique Alves dos Santos

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.util.Random;
import java.util.Scanner;

public class Projeto_Alg2_Vet {
    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        
        menu();
    }
    public static void menu(){
        System.out.printf("Escolha uma opção:\n" +
        "1. Inicializar o vetor com números aleatórios\n" +
        "2. Imprimir o vetor\n" +
        "3. Verificar se um determinado número está contido no vetor\n" +
        "4. Buscar o maior número armazenado no vetor\n" +
        "5. Calcular a média dos números pares armazenados no vetor\n" +
        "6. Calcular o percentual dos números ímpares armazenados no vetor\n" +
        "7. Calcular a média centralizada dos números armazenados no vetor\n" +
        "8. Verificar se dois números somam um valor específico\n" +
        "9. Voltar\n" +
        "10. Sair\n");
        receberComando();
    }

    public static void receberComando(){
        int comando;
        do{
        comando = leitor.nextInt();
        if(comando<0 || comando>10){
            System.out.println("Comando invalido, tente novamente");
        }
        }while(comando<0 || comando>10);
        determinarFunção(comando);
    }

    public static void determinarFunção(int comando){
        switch (comando) {
            case 1:
                function1(null);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            default:
                System.out.println("Erro, voltando para o menu");
                menu();
                break;
        }
    }

    public static int[] function1 (int[] n ){

        Random r = new Random();
    
        for(int i = 0; i < n.length; i++){
    
            n[i] = r.nextInt(100);
    
        }
        return n;
        }

}