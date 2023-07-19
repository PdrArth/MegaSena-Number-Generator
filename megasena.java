import java.util.Random;
import java.util.Scanner;

public class megasena {
    public static void main(String[] args) {
        Random generate = new Random ();
        Scanner escolha = new Scanner(System.in);
        var numeros = 0;
        var seisjogadas = 0;
        var setejogadas = 0;
        var oitojogadas = 0;
        var novejogadas = 0;

        final int SEIS = 6;
        final int SETE = 7;
        final int OITO = 8;
        final int NOVE = 9;

        var continuar = true;

        while (continuar)  {
            System.out.println("Bem vindo ao gerador de números da mega sena. Abaixo insirar quantos números voce desejar jogar.");
            System.out.printf("você pode jogar 6,7,8 ou 9 números, quantos deseja jogar: ");
            numeros = escolha.nextInt();


            seisjogadas = numeros;
            setejogadas = numeros;
            oitojogadas = numeros;
            novejogadas = numeros;



            if (seisjogadas == SEIS) {
                System.out.println("Cada jogo deste custa R$ 5,00");
                System.out.println("Caso ganhe aceito uma parte :)");
                for (int i = 0;i < 6 ;i++){
                    int number = generate.nextInt(60);
                    System.out.printf(" %2d | ",number);

                }
            }
            else if (setejogadas == SETE) {
                System.out.println("Cada jogo deste custa R$ 35,00");
                System.out.println("Caso ganhe aceito uma parte :)");
                for (int i = 0;i <7 ;i++){
                    int number = generate.nextInt(60);
                    System.out.printf(" %2d | ",number);

                }
            }
            else if (oitojogadas == OITO) {
                System.out.println("Cada jogo deste custa R$ 140,00");
                System.out.println("Caso ganhe aceito uma parte :)");
                for (int i = 0;i <8 ;i++){
                    int number = generate.nextInt(60);
                    System.out.printf(" %2d | ",number);

                }
            }

            else if (novejogadas == NOVE) {
                System.out.println("Cada jogo deste custa R$ 420,00");
                System.out.println("Caso ganhe aceito uma parte :)");
                for (int i = 0;i <9 ;i++){
                    int number = generate.nextInt(60);
                    System.out.printf(" %2d | ",number);

                }
            } else {
                System.out.println("Opção inválida! Digite novamente por favor");
            }
            System.out.printf("\n Deseja fazer outra consulta? (S para sim, outra tecla para sair):  ");
            var resposta = escolha.next();
            continuar = resposta.equalsIgnoreCase("S");
        }
        System.out.print("Obrigado por usar nosso progama.");
        escolha.close();
    }
}







