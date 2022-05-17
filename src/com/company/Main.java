package com.company;

import com.company.Uebung1.Article;
import com.company.Uebung1.Order;

public class Main {

    public static void main(String[] args) {
        Article schocko = new Article("Schocko", 5, 10.99);
        Article kekse = new Article("Kekse", 2, 4.99);
        Article sojamilch = new Article("Sojamilch", 3, 3.99);
        Article teuereSache = new Article("Ich bin eine teuere Sache", 6, 130.99);
        Order order = new Order(4);

        order.addArticle(schocko);
        order.addArticle(kekse);
        order.addArticle(sojamilch);
        order.addArticle(teuereSache);

        System.out.println(order);
        System.out.println(order.findMostExpensiveArticle());
        System.out.println(order.findMostExpensiveOrderPosition());
        System.out.println(order.sumOrder());

        System.out.println("*****");
        System.out.println(order.calculateTax());
    }
}
