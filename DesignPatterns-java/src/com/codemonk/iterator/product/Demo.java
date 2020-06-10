package com.codemonk.iterator.product;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void show() {
        var collection = new ProductCollection();
        collection.add(new Product(1, "Laptop"));
        collection.add(new Product(2, "Phones"));
        collection.add(new Product(3, "Books"));
        collection.add(new Product(4, "Coffee"));
        collection.add(new Product(3, "Cables"));

        Iterator iterator = collection.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }
    public static void main(String[] args) {
        show();
    }
}
