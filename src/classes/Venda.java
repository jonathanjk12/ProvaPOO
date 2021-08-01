package classes;
public class Venda{
    private String dataVenda;
    private int qtdVendida;
    private String nomeProdutoVendido;
    private int codigoProdutoVendido;

    public Venda(String dataVenda, Produto produtoVendido, int qtdVendida){
        this.dataVenda = dataVenda;
        this.qtdVendida = qtdVendida;
        this.setNomeProdutoVendido(produtoVendido.getNome());
        this.setCodigoProdutoVendido(produtoVendido.getCodigo());
        vender(produtoVendido);
    }
    public void vender(Produto produtoVendido){
        if(produtoVendido.getQtdEstoque() == 0 || produtoVendido.getQtdEstoque() < qtdVendida){
            System.out.println("Quantidade Solicitada Indisponível ");
        }
        else{
            produtoVendido.setQtdEstoque(produtoVendido.getQtdEstoque() - qtdVendida); 
        }
    }
    public int getCodigoProdutoVendido() {
        return codigoProdutoVendido;
    }
    public void setCodigoProdutoVendido(int codigoProdutoVendido) {
        this.codigoProdutoVendido = codigoProdutoVendido;
    }
    public String getNomeProdutoVendido() {
        return nomeProdutoVendido;
    }
    public void setNomeProdutoVendido(String nomeProdutoVendido) {
        this.nomeProdutoVendido = nomeProdutoVendido;
    }
    
    
    
    public String getDataVenda() {
        return dataVenda;
    }
    public int getQtdVendida() {
        return qtdVendida;
    }
    public void setQuantidadeVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
    
    public void setDataVenda(String dataVenda){
        this.dataVenda = dataVenda;
    }

}