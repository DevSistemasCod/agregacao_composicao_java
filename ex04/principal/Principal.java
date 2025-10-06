package principal;

import entidades.Produto;
import entidades.ItemDeLinha;

public class Principal {
     public static void main(String[] args) {
    	 Produto produto1 = new Produto(1, "Arroz", "Grãos Prato Fino");
         Produto produto2 = new Produto(2, "Leite", "Integral tipo 2");

         ItemDeLinha item1 = new ItemDeLinha(1, 10, produto1);
         ItemDeLinha item2 = new ItemDeLinha(2, 5, produto2);

         System.out.println(item1);
         System.out.println(item2);
     }
}
