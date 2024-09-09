public class Empregado {
    public String nome;
    public String sobrenome;
    public int salario;

    public Empregado(String nome, String sobrenome, int salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public int getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public void Salario(){
        if (salario <= 0){
            System.out.println("0");
        }else{
            System.out.println(salario);
        }
    }
    public double forneceAumento(int salario){
        return this.salario * 0.10;

    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome +"\nSobrenome : " + sobrenome + "\nSalario : " + salario + "\nAumento de : " + forneceAumento(salario));
    }
}
