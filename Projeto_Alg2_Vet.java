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
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);
        
        int comando = 0;
        int voltas = 0;
        int n = 0;
        int m = 0;

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

            if(voltas == 0){
            do {
                System.out.println("Por favor escolha a primeira função para assim poder utilizar as proximas");
                comando = leitor.nextInt();
            }while (comando!=1);
            }else{
                comando = leitor.nextInt();
            }

            
            if(comando == 1 && voltas == 0){

                System.out.println("Qual tamanho deseja para no seu vetor ?");

                do{

                n = leitor.nextInt();

                if(n<0){
                    System.out.println("Porfavor, tome cuidado, não é possivel criar vetores negativos. Tente colocar um numero positivo");
                }

                if(n>1000){
                    System.out.println("Ops, este programa tem como limite maximo do vetor 1000, escolha um numero menor.");
                }

                }while(n<0 || n>1000);

                System.out.println("Qual o maior numero desse vetor?");

                do{

                m = leitor.nextInt();

                if(m<0){
                    System.out.println("O numero maximo tem que ser um numero inteiro positivo");
                }

                }while (m<0);
                    
                voltas++;
            }

            int[] vetor = new int[n];

            for(int i = 0; i < vetor.length; i++){
    
            vetor[i] = random.nextInt(m);

            }

            switch (comando) {
                case 1:
                if(voltas>0){
                    System.out.println("Você ja inicializou o vetor, tente fazzer alguma operação.");
                }
                break;
                case 2:
                    System.out.println("Imprimindo vetor ...");
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

         leitor.close();
    }
    

       
       public static void function2(int[]vetor){

        for(int i = 0; i < vetor.length; i++){
            System.out.println();
            System.out.print(vetor[i] + " ");

        }
        System.out.println();
       } 

       public static void function3(){


        
       }
}
