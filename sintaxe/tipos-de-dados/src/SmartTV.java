public class SmartTV {
    boolean ligada = true;
    int canal = 12;
    int volume = 20;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mudarCanal() {
        canal++;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}