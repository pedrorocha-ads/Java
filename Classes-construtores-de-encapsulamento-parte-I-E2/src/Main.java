public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Pedro", "Rocha",1900);
        Empregado e2 = new Empregado("Bruno", "Rocha", 0);

        e1.exibirDetalhes();

        System.out.println(" ");

        e2.exibirDetalhes();

    }
}