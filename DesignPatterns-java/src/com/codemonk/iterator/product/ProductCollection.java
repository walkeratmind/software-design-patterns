package com.codemonk.iterator.product;

import java.util.ArrayList;
import java.util.List;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product>{

        private ProductCollection collection;
        private int index;

        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public boolean isDone() {
            return (index >= collection.products.size());
        }
    }
}
