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

public class Projeto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);

        int comando = 0;
        int n = 0;
        int m = 0;
        

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

            
            do {
                System.out.println("Por favor escolha a primeira função para assim poder utilizar as proximas");
                comando = leitor.nextInt();
            }while (comando!=1);

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

            int[] vetor = new int[n];
            for(int i = 0; i < vetor.length; i++){

            vetor[i] = random.nextInt(m);
            }

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
                    System.out.println("Você ja inicializou o vetor, tente fazer alguma operação.");
                break;
                case 2:
                    System.out.println("Imprimindo vetor ...");
                    function2(vetor);
                    break;
                case 3:
                    System.out.println("Qual numero deseja procurar no vetor?");
                    int numero = leitor.nextInt();
                 ;
                    if(function3(vetor, numero) == -1){

                         System.out.println(numero + " não está no vetor");
          
                    }
                    else{
                          System.out.println("O numero " + numero + " está na posição: " + function3(vetor, numero));
                   
                        
                    }
                    
                    break;
                case 4:
                    System.out.println("O maior numero no vetor é: " + function4(vetor));

                    break;
                case 5:
                    System.out.println("A média dos números pares é: " + function5(vetor));

                    break;
                case 6:
                    System.out.println("O percentual de numeros impares armazenado no vetor é : " + function6(vetor) + "%");
                    break;
                case 7:
                    System.out.println("A media centralizada do vetor é : " + function7(vetor));
                    break;
                case 8:
                    System.out.println("Informe o valor da pesquisa");
                    int valor = leitor.nextInt();
                    System.out.println("Existe dois numeros que somam esse valor : " + function8(vetor, valor));
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Erro, voltando para o menu");

                    break;
            }
         }while(comando!=0);

         leitor.close();
    }



       public static void function2(int[]vetor){
        System.out.println();
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");

        }
        System.out.println();
       } 

       public static int function3(int[]vetor,int num){

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == num){
                
                return i;
                
            }
        }
        return -1;
           
       }

    public static int function4(int[]vetor){

        int maior = 0;
    
    for(int i = 0; i < vetor.length; i++){
        if(vetor[i] > maior){

            maior = vetor[i];
            
        }
    }
        return maior;
        
    }

    public static int function5(int[]vetor){

        int par = 0;
        int c = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){

                par++;
            }
            c = par + c;
            
        }
        return c;
        
    }

       public static int function6(int[] vetor){
        int perc_imp = 0;

        for(int i = 0; i<vetor.length;i++){
            if(vetor[i]%2 != 0){
            perc_imp++;
            }
         }
         return perc_imp*100/vetor.length;
       }

       public static int function7(int[] vetor){

        int maiorN = 0;
        int menorN = 9999;
        int maiorNpos = 0;
        int menorNpos = 0;
        int media_centralizada = 0;

        for(int i = 0;i<vetor.length;i++){
            if(vetor[i]>maiorN){
                maiorN = vetor[i];
                maiorNpos = i;
            }
            if(vetor[i]<menorN){
                menorN = vetor[i];
                menorNpos = i;
            }
        }

        vetor[maiorNpos] = 0;
        vetor[menorNpos] = 0;

        for(int j = 0;j<vetor.length;j++){
            media_centralizada += vetor[j];
        }

        return media_centralizada/(vetor.length-2);
    }


       public static boolean function8(int[] vetor, int valor){
        boolean existe = false;

        for(int i = 0;i<vetor.length;i++){
            for(int j = 0; j < vetor.length;j++){
                if(vetor[i] + vetor[j] == valor && i!=j){
                existe = true;
                }
            }
        }

        return existe;
       }
}
