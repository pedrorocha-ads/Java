public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ponto2D(){
        this(0,0);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public boolean Iqual(Ponto2D outroPonto){
        return this.x == outroPonto.getX() && this.y == outroPonto.getY();
    }
    public double calcularDistancia(Ponto2D outroPonto){
        double deltaX = this.x - outroPonto.getX();
        double deltaY = this.y - outroPonto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public void exibirCoordenadas(){
        System.out.println("Ponto : ( " + this.x + " , " + this.y + " )");
    }
}
