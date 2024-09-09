public class Pessoa {
    private String nome;
    private int nascimento;
    private double peso;
    private double altura;

    public Pessoa(String nome, int nascimento, double peso, double altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
        this.altura = altura;
    }
    public String IMC(){
        double imc = peso / (altura * altura);
        return String.format("%.2f", imc);
    }
    public int getIdade(){
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - nascimento;
    }
    public String getNome(){
        return nome;
    }
    public double calcularLitrosDiarios(){
        double litrosDiarios = (peso * 35) / 1000;
        return (int) Math.round(litrosDiarios);
    }
}
