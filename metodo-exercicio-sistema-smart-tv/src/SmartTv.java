public class SmartTv {
    boolean ligada=false;
    static int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) {
          canal = novoCanal;
        
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        //pode-se utilizar desta forma: volume = volume +1;
        System.out.println("aumentando o volume para"+ volume);

      }

    public void diminuirVolume(){
        volume--;
        //pode-se utilizar desta forma: volume = volume -1;
        System.out.println("diminuindo o volume para"+ volume);

    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
