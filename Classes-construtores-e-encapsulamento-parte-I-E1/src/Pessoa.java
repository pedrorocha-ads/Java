import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String CPF;
    private double anoNascimento;
    private double altura;

    public Pessoa(String nome, String CPF, double anoNascimento, double altura){
        this.nome = nome;
        this.CPF = CPF;
        this.anoNascimento =anoNascimento;
        this.altura = altura;
    }
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public double getAnoNascimento(){
        return anoNascimento;
    }
    public double getAltura(){
        return altura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public double calcularIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome
        + "\nCPF : " + CPF
        + "\nAnoNascimento : " + anoNascimento
        + "\nAltura : " + altura
        + "\nIdade : " + calcularIdade());
    }
}
