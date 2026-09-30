import java.util.Scanner;

class DetectorDeGolpe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;

        System.out.println("=== DETECTOR DE GOLPES ===");

        System.out.print("A mensagem pede dinheiro ou transferencia? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pontos += 20;
        }

        System.out.print("Pede senha ou CPF? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pontos += 20;
        }

        System.out.print("Contém erro de escrita ou links? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pontos += 10;
        }

        System.out.print("Promessa de dinheiro ou prêmio? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pontos += 10;
        }

        System.out.print("Contém ameaça de bloqueio de conta? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pontos += 10;
        }

        System.out.println("\nPontuação de risco: " + pontos);

        if (pontos >= 50) {
            System.out.println("Alto risco: essa mensagem possui fortíssimas características de golpe.");
        } else if (pontos >= 20) {
            System.out.println("Atenção: essa mensagem pode ser suspeita.");
        } else {
            System.out.println("Baixo risco: não foram identificadas muitas características de golpe.");
        }

        scanner.close();
    }
}
