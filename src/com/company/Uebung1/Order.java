package com.company.Uebung1;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = new Article[capacityOrder];
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

    public void addArticle(Article a) {
        articles[nrArticles++] = a;
    }

    public int findMostExpensiveArticle() {

        int mostExpensiveItem = 0;
        double highestPrice = 0;

        for (int i = 0; i < articles.length; i++) {
            if (articles[i].getPrice() > highestPrice) {
                highestPrice = articles[i].getPrice();
                mostExpensiveItem = i;
            }
        }
        return mostExpensiveItem + 1;
    }

    public int findMostExpensiveOrderPosition() {
        int index = 0;
        double mult = 0;

        for (int i = 0; i < articles.length; i++) {
            if (articles[i].getPrice() * articles[i].getNumber() > mult) {
                mult = articles[i].getPrice() * articles[i].getNumber();
                index = i;
            }
        }
        return index + 1;
    }

    public double sumOrder() {
        double summe = 0;
        for (Article a : articles) {
            summe += a.getPrice();
        }
        return summe;
    }

    public double calculateTax() {
        double sum = 0;
        for (Article a : articles) {
            if (a.getPrice() < 20) {
                sum += 5 * a.getPrice() / 100;
            }
            if (a.getPrice() > 20) {
                sum += 20 * a.getPrice() / 100;
            }
        }
        return sum;
    }

    public void sumOrderWithTax() {
        int sum = 0;
        for (Article a : articles) {

        }

    }

}
