public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro Rocha", 1999, 105, 1.75);
        pessoa1.IMC();

        System.out.println("Nome : " + pessoa1.getNome());
        System.out.println("Idade : " + pessoa1.getIdade() + " anos");
        System.out.println("Seu IMC é de : " + pessoa1.IMC());
        System.out.println("Quantidade de litros de água diaramente recomendada de : " + pessoa1.calcularLitrosDiarios() + " Litros");
    }
}