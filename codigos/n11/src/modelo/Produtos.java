package modelo;

public class Produtos {
    int codigo, quantidade;
    String descProduto;
    float preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String ListarDados(){
        return("Codigo: "+codigo+
        "descricao produto: "+descProduto+
        "Preco: "+preco+
        "Quantidade: "+quantidade);
    }
}
