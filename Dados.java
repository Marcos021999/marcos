package dados;

import java.util.Random;
import java.util.Scanner;


/*
 * @author Marcos
 * 14/11/2019
 */
public class Dados {

    public static void main(String[] args) {

        //objetos
        Random escolha = new Random();
        Scanner digita = new Scanner(System.in);

        //variáveis
        int resultado, result;
        float dinheiro, dinheiro1;
        float aposta;
        int volta = 1, pontuacao = 0, pontuacao2 = 0;

        System.out.print("Valor do depósito:");
        dinheiro = digita.nextFloat();
        dinheiro1 = dinheiro;

        /////////////////////////////////////// //////////////////////////////  while (volta == 1)///////////////////
        while (volta == 1) {

            System.out.print("Valor da aposta:");
            aposta = digita.nextFloat();
            

            
            if (dinheiro < aposta )//fica ligado nisso MESMO OLHAR DIA 15/11/19
            {
                System.out.println("O USUÁRIO  não tem dinheiro suficiente para apostar. Faça uma nova aposta.");
            }
           else if( dinheiro1 < aposta ){
                
                System.out.println("A MÁQUINA   não tem dinheiro suficiente para apostar. Faça uma nova aposta.");
            }
            
            
            else if (dinheiro >= aposta) {
                 if (dinheiro < aposta || dinheiro1 <= 0 || dinheiro <= 0)//fica ligado nisso MESMO OLHAR DIA 15/11/19
            {
                System.out.println("O USUÁRIO ou a MÁQUINA não têm dineiro suficiente para apostar. Faça uma nova aposta.");
            }

                int a = (escolha.nextInt(6) + 1);
                int b = (escolha.nextInt(6) + 1);
                int c = (escolha.nextInt(6) + 1);
                int d = (escolha.nextInt(6) + 1);

                System.out.println("JOGUE OS DADOS");

                System.out.println("  /==============/");
                System.out.println(" /   MÁQUINA    /");
                System.out.println("/==============/");

                System.out.println("Face do dado: " + a);
                System.out.println("Face do dado: " + b);

                resultado = (a + b);
                System.out.println("A SOMA é " + resultado);

                System.out.println("  /============/");
                System.out.println(" /  USUÁRIO   /");
                System.out.println("/============/");

                System.out.println("Face do dado: " + c);
                System.out.println("Face do dado: " + d);
                result = (c + d);
                System.out.println("A SOMA é " + result);

                if (resultado > result) {//A MÁQUINA venceu//////////////////A MÁQUINA venceu//////////////////////

                    dinheiro1 = dinheiro1 + aposta;
                    dinheiro = dinheiro - aposta;

                    System.out.println("|.=.=.=.=.=.=.=.=.=|");
                    System.out.println("| A MÁQUINA venceu!|");
                    System.out.println("|.=.=.=.=.=.=.=.=.=|");

                    System.out.println("O crédito do MÁQUINA é " + dinheiro1 + " R$");

                    System.out.println("O crédito do USUÁRIO é " + dinheiro + " R$");

                    pontuacao2++;//maquina venceu
                    if (pontuacao2 > pontuacao) {

                        System.out.println("o PLACAR é : " + pontuacao2 + " à " + pontuacao + " Para a MÁQUINA");
                    }
                    else if(pontuacao2==pontuacao){
                    
                    System.out.println("O Placar é :"+pontuacao2+ " à "+pontuacao);
                }
                    else {
                        System.out.println("o PLACAR é : " + pontuacao + " à " + pontuacao2 + " Para o USUÁRIO");

                    }

                }//MAQUINA VENCEU

                if (resultado < result) {//USUÁRIO venceu////////////////////////USUÁRIO venceu//////////////////////////

                    System.out.println("|.=.=.=.=.=.=.=.=.|");
                    System.out.println("|O USUÁRIO venceu!|");
                    System.out.println("|.=.=.=.=.=.=.=.=.|");

                    dinheiro = dinheiro + aposta;
                    dinheiro1 = dinheiro1 - aposta;

                    System.out.println("O crédito do USUÁRIO é " + dinheiro + " R$");
                    System.out.println("o crédito da MÁQUINA é : " + dinheiro1 + " R$");

                    pontuacao++;
                    if (pontuacao2 < pontuacao) {
                        System.out.println("o PLACAR é : " + pontuacao + " à " + pontuacao2 + " Para o USUÁRIO");
                    } 
                     else if(pontuacao2==pontuacao){
                    
                    System.out.println("O Placar é :"+pontuacao2+ " à "+pontuacao);
                }
                    else {
                        System.out.println("o PLACAR é : " + pontuacao2 + " à " + pontuacao + " Para a MÁQUINA");
                    }
                }//usuário venceu
   
               

                if (resultado == result ) {//EMPATE////////////////////////////////EMPATE/////////////////EMPATE////////////
                    System.out.println("Deu EMPATE");
                    if (pontuacao2 < pontuacao) {

                        System.out.println("A pontuação continua igual: " + pontuacao + " à " + pontuacao2 + " Para o USUÁRIO");
                        
                    } else if (pontuacao2 == pontuacao) {
                        System.out.println("A pontuação continua igual: " + pontuacao + " à " + pontuacao2);

                    } else {
                        System.out.println("A pontuação continua igual: " + pontuacao2 + " à " + pontuacao + " Para a MÁQUINA");
                    }

                }//empate
                
                //else if (dinheiro >= aposta)

                System.out.println("Deseja jogar novamente ?\n1 - SIM\n2 - NÃO ");
                System.out.print("Digite aqui: ");
                volta = digita.nextInt();

                if (dinheiro1 <= 0 || dinheiro <= 0) {
                    if (dinheiro1 <= 0) {
                        System.out.println("A MÁQUINA não tem mais dinheiro para apostar");
                        break;
                    }
                    if (dinheiro <= 0) {
                        System.out.println("O USUÁRIO não tem mais dinheiro para apostar");
                        break;
                    }

                }
                 
         

            }

        }// while (volta == 1)

        if (volta == 2) {
            System.out.println("FIM DAS APOSTAS");
        }//if fim do programa

    }//main

}//class

