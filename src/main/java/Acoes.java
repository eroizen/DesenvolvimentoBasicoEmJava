public class Acoes {
    public static void main(String[] args) {
        Carro carro = new Carro();
        int i;
        for(i=0;i<5;i++){
            System.out.println("Número de Passageiros é "+carro.getPassageiros());
            carro.setPassageiros(carro.getPassageiros() + 1);
        }
        for(i=5;i>-1;i--){
            System.out.println("Número de Passageiros é "+carro.getPassageiros());
            carro.setPassageiros(carro.getPassageiros() - 1);
        }
    }
}
