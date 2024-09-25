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









Atividade1
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Informe o valor de A:");
        a = sc.nextInt();
        System.out.println("Informe o valor de B:");
        b = sc.nextInt();
        System.out.println("Informe o valor de C:");
        c = sc.nextInt();

        int resultado = soma(a, b);

        if (resultado<c) {
            System.out.println("A soma de " + a + " + " + b + " = " + resultado + ", e menor que " + c);
        } else {
            System.out.println("A soma de " + a + " + " + b + " = " + resultado + ",nao e menor que " + c);
        }

    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
}







Atividade2
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o seu sexo(M, F)");
        String sexo = sc.nextLine();
        System.out.println("Digite o seu estado civil");
        String estadoCivil = sc.nextLine();

        if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
            System.out.println("Digite a qunatos anos voce esta casada");
            int anos = sc.nextInt();
        }

    }
}



//Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja
//“F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).







