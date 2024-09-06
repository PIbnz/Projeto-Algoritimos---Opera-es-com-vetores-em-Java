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
        int[] vetor = new int[1000];
        int comando;

        do{

        System.out.printf(
        "Bem vindo ao sistema de operação com vetores\n"+
        "Escolha uma opção:\n" +
        "1. Inicializar o vetor com números aleatórios\n" +
        "2. Imprimir o vetor\n" +
        "3. Verificar se um determinado número está contido no vetor\n" +
        "4. Buscar o maior número armazenado no vetor\n" +
        "5. Calcular a média dos números pares armazenados no vetor\n" +
        "6. Calcular o percentual dos números ímpares armazenados no vetor\n" +
        "7. Calcular a média centralizada dos números armazenados no vetor\n" +
        "8. Verificar se dois números somam um valor específico\n" +
        "0. Sair\n");

        
            comando = leitor.nextInt();

            switch (comando) {
                case 1:
                    function1(vetor);
                    break;
                case 2:
                    function2(vetor);
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
                    
                    break;
            }
            
         }while(comando!=0);
    }
    



    public static void function1 (int[] vetor ){

        Random random = new Random();
    
        for(int i = 0; i < vetor.length; i++){
    
            vetor[i] = random.nextInt(1000);
    
         }
        }

       
       public static void function2(int[]vetor){

        for(int i = 0; i < vetor.length; i++){

            System.out.println(vetor[i]);

        }

       } 

       public static void function3(){


        
       }
}
