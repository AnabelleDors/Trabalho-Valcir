import java.util.ArrayList;
import java.util.List;

public class OrdemDeProduto {
    private List<Produto> produtos;

    public OrdemDeProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
