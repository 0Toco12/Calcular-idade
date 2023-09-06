import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
        Scanner idade = new Scanner(System.in);

        int ano;
        int mes;
        int dia;

        System.out.println("Digite o ano do seu nascimento: ");
        ano = idade.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        mes = idade.nextInt();

        System.out.println("Digite o dia do seu nascimento: ");
        dia = idade.nextInt();

        int totalAno = 2023 - ano;
        int totalMes;
        int totalDias;

        if (mes < 7) {
            totalMes = 7 - mes;
        } else {
            totalMes = mes - 7;
        }

        if (dia < 12) {
            totalDias = 30 - dia;
        } else {
            totalDias = dia - 30;
        }

        System.out.println("Você tem " + totalAno + " anos, "+ totalMes + " meses e "+ totalDias + " dias de idade");
    }
}