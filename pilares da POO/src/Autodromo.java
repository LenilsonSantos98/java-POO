public class Autodromo {
    public static void main(String[] args) throws Exception {
       Carro jeep = new Carro();
       jeep.setChassi("8546211");
       jeep.ligar();

       Moto z400 = new Moto();
       z400.setChassi("4235546");
       z400.ligar();
        
    }
}
