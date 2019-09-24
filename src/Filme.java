public class Filme {
    private String nome;
    private double nota;
    private Data dataDeLancamento;
    
    public String getNome(){
        return this.nome;
    }
    public double getNota(){
        return this.nota;
    }
    public Data getDataDeLancamento(){
        return this.dataDeLancamento;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setNota(double n){
        this.nota = n;
    }
    public void setDataDeLancamento(Data d){
        this.dataDeLancamento = d;
    }
}
