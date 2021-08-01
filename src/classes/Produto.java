package classes;
public class Produto{
    private int codigo;
    private String nome;
    private float valor;
    private int qtdEstoque;

    public Produto (String nome, int codigo, float valor, int qtdEstoque){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }
    public void mostrarProduto(){
        System.out.printf("%s %d %d %d", nome, codigo, valor, qtdEstoque);
        
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    } 
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }
}



 