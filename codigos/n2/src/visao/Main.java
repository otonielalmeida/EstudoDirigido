package visao;
import projeto.Produto;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Produto p1= new Produto();
        System.out.println("Digite o nome do produto");
        p1.nome = read.nextLine();
        System.out.println("Digite o valor do produto");
        p1.valor = read.nextDouble();

        System.out.println("Nome: "+p1.nome);
        System.out.println("Valor com desconto : "+p1.calcularDesconto());
    }
}
