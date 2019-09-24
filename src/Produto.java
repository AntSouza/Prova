public class Produto {
    private double preco;
    
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double p){
        this.preco = p;
    }
    
    public double calculaDesconto(double p){
        double result;
        result = getPreco() * 0.75;
        return result;
    }
}
