public class Produto{
    String nome;
    String marca;
    double custo;
    double venda;

    public Produto(String nome, String marca, double custo, double venda){
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }

    public String calculador(){
        String lucro = String.valueOf(this.venda - this.custo);
        return
           lucro;

    }
}

