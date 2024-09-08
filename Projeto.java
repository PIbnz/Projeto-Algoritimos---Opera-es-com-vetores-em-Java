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

        int comando = 0; /* guarda a escolha do usuário, "1 obrigatório", 2,3,5 e etc... */
        int n = 0; /* guarda o tamanho do vetor */
        int m = 0; /* guarda o maior valor dentro do vetor */
        

        System.out.printf(    /*Apresenta no terminal o menu de opções */
        "**************************************************\n"+
        "***Bem vindo ao sistema de operação com vetores***\n"+
        "**************************************************\n"+
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

            
            do {              /* o programa só inicia caso a função 1 seja escolhida */
                System.out.println("**Por favor escolha a primeira função para assim poder utilizar as proximas**");
                comando = leitor.nextInt();
            }while (comando!=1);

                System.out.println("Qual tamanho deseja para no seu vetor ?");

                do{

                n = leitor.nextInt();
                                              
                if(n<0){             /* validação dos valores dentro da variável */
                    System.out.println("Porfavor, tome cuidado, não é possivel criar vetores negativos. Tente colocar um numero positivo");
                }

                if(n>1000){
                    System.out.println("Ops, este programa tem como limite maximo do vetor 1000, escolha um numero menor.");
                }

                }while(n<0 || n>1000);

                System.out.println("Qual o maior numero desse vetor?");

                do{

                m = leitor.nextInt();

                if(m<0){               /* validação dos números dentro variável */
                    System.out.println("O numero maximo tem que ser um numero inteiro positivo");
                }

                }while (m<0);
                                /* criação e preenchimento do vetor dado os valores que o usuario deu */
            int[] vetor = new int[n];              
            for(int i = 0; i < vetor.length; i++){

            vetor[i] = random.nextInt(m);
            }

            do{

                System.out.printf(
        "**************************************************\n"+
        "***Bem vindo ao sistema de operação com vetores***\n"+
        "**************************************************\n"+
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

            switch (comando) {  /* chama as funções de acordo com a escolha do usuário e imprime no terminal */
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
                    System.out.printf(
                        "**************************************************\n"+
                        "Saindo do programa\n"+
                        "**************************************************\n"
                    );
                    break;
                default:
                    System.out.println("Erro, voltando para o menu");

                    break;
            }
         }while(comando!=0);

         leitor.close();
    }



       public static void function2(int[]vetor){  /* imprime os elementos de um vetor de inteiros */
        System.out.println();                    /* Esta função itera sobre cada elemento do vetor de inteiros fornecido como parâmetro e 
                                                  imprime cada elemento na mesma linha, separado por um espaço. */
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

    public static int function4(int[]vetor){ /*  verifica o maior valor dentro do vetor */
                                                /* a função compara cada elemento dentro 
                                                do vetor com o maior valor e ao final retorna o maior valor */     
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
        int cont = 0;

        for(int i = 0; i < vetor.length; i++){ /* verifica os numeros pares, acumula na variavel par e faz uma média aritmética */
            if(vetor[i] % 2 == 0){              /* ao fim retorna o valor da média dos números */
                par += vetor[i];
                cont++;
            } 
        }
        return par/cont;
        
    }

       public static int function6(int[] vetor){ /* Calcula a porcentagem de números ímpares do vetor */
        int perc_imp = 0;                        /* percorre cada elemento e verifica se é impar, */
                                                  /* aumenta o contador a cada impar e calcula a porcentagem desses números */
        for(int i = 0; i<vetor.length;i++){       /* em relação ao tamnho total do vetor*/
            if(vetor[i]%2 != 0){
            perc_imp++;
            }
         }
         return perc_imp*100/vetor.length;
       }

       public static int function7(int[] vetor){ /* calcula uma média centralizada one o primeiro e ultimo valor */
                                                  /* são desconsiderados */
        int maiorN = 0;       /* guarda o maior número */
        int menorN = 9999; /* guarda o menor número */
        int maiorNpos = 0; /* guarda a posição do maior número */
        int menorNpos = 0;  /* guarda a posição do menor número */
        int media_centralizada = 0;   /* guarda o valor da média */
                              
        for(int i = 0;i<vetor.length;i++){
            if(vetor[i]>maiorN){      /* percorre o vetor e verifica o maior número e sua posição */
                maiorN = vetor[i];
                maiorNpos = i;
            }
            if(vetor[i]<menorN){ /* percorre o vetor e verifica o menor número e sua posição */
                menorN = vetor[i];
                menorNpos = i;
            }
        }

        vetor[maiorNpos] = 0; /* atribui os valores a zero para não mudar o resultado do calculo*/
        vetor[menorNpos] = 0;

        for(int j = 0;j<vetor.length;j++){    /* soma todos os elementos do vetor */
            media_centralizada += vetor[j];
        }

        return media_centralizada/(vetor.length-2);/* Divide a soma pela quantidade de elementos do vetor e retorna o resulatdo */
    }


       public static boolean function8(int[] vetor, int valor){
        boolean existe = false;

        for(int i = 0;i<vetor.length;i++){
            for(int j = 0; j < vetor.length;j++){         
                if(vetor[i] + vetor[j] == valor && i!=j){  /* verifica se a soma dos dois valores resulta */
                existe = true;               /* no valor inserido anteriormente e retorna caso verdadeiro ou falso */
                }
            }
        }

        return existe;
       }
}
