public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
     
    SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

            System.out.println("volume Atual :" + smartTv.volume);

        
            System.out.println("Canal Atual :" + smartTv.canal);
        smartTv.mudarCanal(13);
            System.out.println("Canal Atual :" + smartTv.canal);


            System.out.println("TV Ligada ?" + smartTv.ligada);
            System.out.println("Canal Atual :" + smartTv.canal);
            System.out.println("Volume Atual :" + smartTv.volume);
        
        
        smartTv.ligar();
            System.out.println(" Novo Status -> TV Ligada ?" + smartTv.ligada);


        smartTv.desligar();
            System.out.println(" Novo Status -> TV ligada ?" + smartTv.ligada);

    }
}