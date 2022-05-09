package com.company.Uebung1;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int nrArticles, int capacityOrder, Article[] articles) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        for (Article a : articles) {


            return "The Order contains these articles: " +
                    Arrays.toString(articles);
        }
        return null;
    }

    public void addArticle (Article a) {
        articles[nrArticles] = a;
    }

    public void findMostExpensiveArticle


}
