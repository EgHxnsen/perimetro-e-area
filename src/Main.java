import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        // Exibir o menu antes do loop
        exibirMenu();

        do {
            System.out.println("Digite sua preferencia:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Quadrado");
                    System.out.println("Digite o valor do lado do quadrado");
                    double l = sc.nextDouble();
                    System.out.println("O valor da área do quadrado é: " + (l * l));
                    System.out.println("O valor do perímetro do quadrado é: " + (4 * l));
                    break;
                case 2:
                    System.out.println("Você escolheu Losango");
                    System.out.println("Digite o valor da diagonal menor do losango");
                    double d = sc.nextDouble();
                    System.out.println("Digite o valor da diagonal maior do losango");
                    double D = sc.nextDouble();
                    System.out.println("Digite o valor do lado do losango");
                    double f = sc.nextDouble();
                    System.out.println("O valor da área do losango é: " + (d * D) / 2);
                    System.out.println("O valor do perímetro do losango é: " + (4 * f));
                    break;
                case 3:
                    System.out.println("Você escolheu Triângulo");
                    System.out.println("Digite o valor do lado A do triângulo");
                    double a = sc.nextDouble();
                    System.out.println("Digite o valor do lado B do triângulo");
                    double b = sc.nextDouble();
                    System.out.println("Digite o valor do lado C do triângulo");
                    double c = sc.nextDouble();
                    double p = (a + b + c) / 2;
                    System.out.println("O valor da área do triângulo é: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                    System.out.println("O valor do perímetro do triângulo é: " + (a + b + c));
                    break;
                case 4:
                    System.out.println("Você escolheu Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            if (opcao != 4) {
                System.out.println("Digite 1 para comparar áreas e 2 para comparar perímetros");
                int comparativo = sc.nextInt();
                if (comparativo == 1) {
                    System.out.println("Digite o valor da primeira área");
                    double area1 = sc.nextDouble();
                    System.out.println("Digite o valor da segunda área");
                    double area2 = sc.nextDouble();
                    if (area1 > area2) {
                        System.out.println("A primeira área é maior que a segunda");
                    } else if (area1 < area2) {
                        System.out.println("A segunda área é maior que a primeira");
                    } else {
                        System.out.println("As áreas são iguais");
                    }
                } else if (comparativo == 2) {
                    System.out.println("Digite o valor do primeiro perímetro");
                    double perimetro1 = sc.nextDouble();
                    System.out.println("Digite o valor do segundo perímetro");
                    double perimetro2 = sc.nextDouble();
                    if (perimetro1 > perimetro2) {
                        System.out.println("O primeiro perímetro é maior que o segundo");
                    } else if (perimetro1 < perimetro2) {
                        System.out.println("O segundo perímetro é maior que o primeiro");
                    } else {
                        System.out.println("Os perímetros são iguais");
                    }
                } else {
                    System.out.println("Opção inválida");
                }
            }

        } while (opcao != 4);

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("\nDigite sua preferência:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Losango");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Sair");
    }
}
