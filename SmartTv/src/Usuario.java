public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ? "+smartTv.ligada);
       
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: "+smartTv.canal);
    }
}
