public class Main {
    public static void main(String[] args) {
        var tv = new SmartTV();

        System.out.println("\nINFOS ----------");
        System.out.printf("\tEstado: %s\n", tv.ligada ? "ligada" : "desligada");
        System.out.printf("\tCanal atual: %d\n", tv.canal);
        System.out.printf("\tVolume atual: %d\n", tv.volume);

        tv.desligar();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mudarCanal();

        System.out.println("\nINFOS ----------");
        System.out.printf("\tEstado: %s\n", tv.ligada ? "ligada" : "desligada");
        System.out.printf("\tCanal atual: %d\n", tv.canal);
        System.out.printf("\tVolume atual: %d\n", tv.volume);

        tv.mudarCanal(24);
        tv.ligar();

        System.out.println("\nINFOS ----------");
        System.out.printf("\tEstado: %s\n", tv.ligada ? "ligada" : "desligada");
        System.out.printf("\tCanal atual: %d\n", tv.canal);
        System.out.printf("\tVolume atual: %d\n", tv.volume);

    }
}