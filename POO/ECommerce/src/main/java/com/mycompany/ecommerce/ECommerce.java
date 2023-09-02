package com.mycompany.ecommerce;

public class ECommerce {

    public static void main(String[] args) {
        Produto livro1 = new Livro("Harry potter", 50, "J. K. Rowling");
        System.out.println(livro1.toString());
        Eletronico eletronico1 = new Eletronico("Fone", 200, "JBL", "JBL231");
        System.out.println(eletronico1.toString());
    }
}
