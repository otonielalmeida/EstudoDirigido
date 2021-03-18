package visao;
import java.util.List;
import java.util.Scanner;
import modelo.Produtos;
import java.util.ArrayList;
public class Carrinhos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Produtos p1 = new Produtos();

        ArrayList<Produtos> itens = new ArrayList<>();
        System.out.println("Cadastro: ");
        do{
            System.out.println("Codigo: ");
            p1.setCodigo(read.nextInt());
            System.out.println("Descricao produto");
            p1.setDescProduto(read.nextLine());
            System.out.println("Preco: ");
            p1.setPreco(read.nextFloat());
            System.out.println("Quantidade: ");
            p1.setQuantidade(read.nextInt());

        }while
        (p1.getCodigo() !=0);
        System.out.println(p1.ListarDados());
    }
}
