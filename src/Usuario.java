public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " +smartTv.ligada);
        System.out.println("Canal: " +smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status: TV ligada? " +smartTv.desligada);    
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Canal: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " +smartTv.canal);




    }
}
