import java.util.ArrayList;
import java.util.Scanner;

import classes.*;


public class App {
    
    public static void main(String[] args) throws Exception {
        int opcao;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        Scanner in =  new Scanner(System.in);
  
        do{
            System.out.print("\nMenu \n\n1- Incluir Produto\n2- Consultar Produto \n3- Listagem de Produtos \n4- Vendas por Produto \n5- Realizar Venda \n0- Sair\n\nOpção:  ");
        
            opcao = in.nextInt();
            in.nextLine();
          
            switch(opcao){
            
                case 1: 
                    System.out.print("Nome do produto: ");
                    String nome1 = in.nextLine();
                    System.out.print("Numero do código: ");
                    int codigo1 = Integer.parseInt(in.nextLine());
                    System.out.print("Valor do produto: ");
                    Float valor1 = Float.parseFloat(in.nextLine());
                    System.out.print("Quantidade em estoque: ");
                    int qtdEstoque1 = Integer.parseInt(in.nextLine());
                     produtos.add(new Produto(nome1, codigo1, valor1, qtdEstoque1));
                    System.out.println("Digite enter para continuar: ");
                     in.nextLine();
                    break;
                case 2:
                    System.out.println("Digite o nome do produto desejado: ");
                    String nome2 = in.nextLine();
                    boolean flag =  false;
                    for(int i = 0; i<produtos.size(); i++){
                        String aux = produtos.get(i).getNome();
                        if(nome2.equals(aux)){
                            System.out.println("Produto encontrado!\n\n ");
                            System.out.printf("Nome do produto: %s\n", produtos.get(i).getNome());
                            System.out.printf("Código do produto: %d\n", produtos.get(i).getCodigo());
                            System.out.printf("Valor: %.2f\n", produtos.get(i).getValor());
                            System.out.printf("Quantidade em estoque: %d\n", produtos.get(i).getQtdEstoque());
                            System.out.println();  
                             
                            flag = true; 
                        }
                    }
                    if(!flag){
                        System.out.println("Produto não encontrado! \n");
                    }
                    break;
                case 3:
                    
                    System.out.println("             Listagem de Produtos:        \n\n");
                    Float soma = 0f;
                    Float valorMax = 0f;
                    Float valorMin = 999999999f;

                    for(int i = 0; i< produtos.size(); i++) {
                        
                        System.out.printf("Nome do produto: %s\n", produtos.get(i).getNome());
                        System.out.printf("Código do produto: %d\n", produtos.get(i).getCodigo());
                        System.out.printf("Valor: %.2f\n", produtos.get(i).getValor());
                        System.out.printf("Quantidade em estoque: %d\n", produtos.get(i).getQtdEstoque());
                        System.out.println(); 

                        soma += produtos.get(i).getValor();

                        if (valorMax < produtos.get(i).getValor()){
                            valorMax = produtos.get(i).getValor();
                        }
                        if (valorMin > produtos.get(i).getValor()){
                            valorMin = produtos.get(i).getValor();
                        }
                    } 
                    soma /= produtos.size(); 

                    System.out.printf("A média dos valores é: %.2f\n", soma);
                    System.out.printf("O valor máximo dos produtos é: %.2f\n", valorMax);
                    System.out.printf("O valor mínimo dos produtos é: %.2f\n\n", valorMin);

                    break; 
                case 4:
                    System.out.println("             Vendas por período:        \n\n");
                    for(int i = 0; i< vendas.size(); i++) {
                        
                    System.out.printf("Produto Vendido:  %s\n", vendas.get(i).getNomeProdutoVendido());
                    System.out.printf("Código do produto: %d\n", produtos.get(i).getCodigo());
                    System.out.printf("Valor: %.2f\n", produtos.get(i).getValor());
                    System.out.println(); 
                    }
                    break;
                case 5:
                    System.out.println("Produto vendido: ");
                    String produtoVendido1 = in.nextLine();
                    System.out.println("Quantidade do produto: ");
                    int qtdVendida1 = Integer.parseInt(in.nextLine());
                    System.out.println("Data da venda: ");
                    String dataVenda1 = in.nextLine();

                    for(int i = 0; i<produtos.size(); i++){
                       if(produtoVendido1.equals(produtos.get(i).getNome())){
                            vendas.add(new Venda(dataVenda1, produtos.get(i), qtdVendida1));
                       }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }while(opcao < 5 || opcao > 0);
        in.close();
        
        

    }

   
}
