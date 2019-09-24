public class TestaFilme {
    public static void main(String[] args){
        Data dataFilme = new Data();
        Filme filmeTeste = new Filme();
        
        dataFilme.setDia(12);
        dataFilme.setMes(03);
        dataFilme.setAno(1999);
        filmeTeste.setNome("Yellow");
        filmeTeste.setNota(7.5);
        filmeTeste.setDataDeLancamento(dataFilme);
        dataFilme.imprimir();
    }
}
