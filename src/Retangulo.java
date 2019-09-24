public class Retangulo {
    public double base;
    public double altura;
    
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setBase(double b){
        this.base = b;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    
    public double calcularArea(){
        double result;
        result = getAltura() * getBase();
        return result;
    }
}
