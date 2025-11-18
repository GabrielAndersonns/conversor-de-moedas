import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        ConsultaMoeda consulta = new ConsultaMoeda();
        Scanner scan = new Scanner(System.in);
        String coin;
        double valor;

        System.out.println("Digite que tipo de conversão você deseja fazer!");
        System.out.println("1 = BRL - Real Brasileiro -> EUR - Euro");
        System.out.println("2 = EUR - Euro -> USD - Dólar ");
        System.out.println("3 = JPY - Yen Japones -> USD - Dólar");
        System.out.println("4 = GBP - Libra Britânica -> JPY - Yen Japones");
        System.out.println("5 = BRL - Real brasileiro -> EUR - Euro");
        System.out.println("6 = BRL - Real brasileiro -> USD - Dólar");
        int opcao = scan.nextInt();
        switch (opcao){
            case 1:
                coin = "BRL";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [EUR] é: "+consulta.converter(valor, "EUR", coin));

            case 2:
                coin = "EUR";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [USD] é: "+consulta.converter(valor, "USD", coin));

            case 3:
                coin = "JPY";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [USD] é: "+consulta.converter(valor, "USD", coin));

            case 4:
                coin = "GBP";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [JPY] é: "+consulta.converter(valor, "JPY", coin));

            case 5:
                coin = "BRL";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [EUR] é: "+consulta.converter(valor, "EUR", coin));

            case 6:
                coin = "BRL";
                System.out.println("Digite o valor:");
                valor = scan.nextDouble();
                consulta.buscaMoeda(coin);
                System.out.println("O valor de " + valor +" ["+ coin +"] em [USD] é: "+consulta.converter(valor, "USD", coin));

        }
    }
}
