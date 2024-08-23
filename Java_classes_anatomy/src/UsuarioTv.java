

public class UsuarioTv {
    
    public static void main(String[] args) throws Exception{
        
      SmartTv smartTv = new SmartTv();

      // Simulação de entrada de dados do user
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      
      // Execução
      smartTv.ligar ();
      System.out.println("A Tv está ligada? " + smartTv.ligada);

      smartTv.desligar ();
      System.out.println("A Tv está ligada? " + smartTv.ligada);

      smartTv.mudarCanal (20);
      System.out.println("Qual é o canal que está passando? " + smartTv.canal);

      smartTv.aumentarCanal();
      System.out.println("Qual é o canal que está passando? " + smartTv.canal);

      smartTv.diminuirCanal();
      System.out.println("Qual é o canal que está passando? " + smartTv.canal);

      smartTv.aumentarVolume ();
      System.out.println("Em qual volume a TV está? " + smartTv.volume);

      smartTv.diminuirVolume ();
      System.out.println("Em qual volume a TV está? " + smartTv.volume);


    }

}
