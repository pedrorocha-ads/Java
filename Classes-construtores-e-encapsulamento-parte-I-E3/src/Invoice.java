public class Invoice {
    public String produto;
    public int quantidade;
    public double preco;

    public Invoice(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getProduto() {
        return produto;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public double calcularValorFatura() {
        return preco * quantidade;
    }
    public void setQuantidade(){
        this.quantidade = (quantidade > 0 ) ? quantidade : 0;
    }
    public void setPreco(){
        this.preco = (preco > 0 ) ? preco : 0;
    }
    public void exibirDetalhes(){
        System.out.println("Produto: " + produto +
                "\nQuantidade : " + quantidade +
                "\nPreço : " + preco +
                "\nValor Fatura : " + calcularValorFatura());
    }
}
