public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(4, 3);
        Ponto2D ponto2 = new Ponto2D(2,6);

        ponto1.exibirCoordenadas();
        ponto2.exibirCoordenadas();

        if(ponto1.equals(ponto2)){
            System.out.println("Pontos iguais");
        }else{
            System.out.println("Pontos são diferentes");
        }

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre os pontos " + String.format("%.2f", distancia));
    }
}