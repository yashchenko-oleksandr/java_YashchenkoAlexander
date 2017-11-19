package com.company.task17;

public class Product implements Comparable<Product> {
    private String name;
    private int price, rating;

    public Product() {
        name = "Продукт";
        price = 1;
        rating = 1;
    }

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (rating != product.rating) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        return String.format("(Название продукта - %s, Цена = %d, Рейтинг - %d)", name, price, rating);

    }

    @Override
    public int compareTo(Product o) {
        int anotherProductPrice = o.getPrice();
        return this.price - anotherProductPrice;
    }

}
