package com.codemonk.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
//        urls.add(url);
        urls[count] = url;
        count++;
    }

    public String pop() {
        return urls[--count];
    }

//    public String pop() {
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//
//        return lastUrl;
//    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

//    public List<String> getUrls() {
//        return urls;
//    }


    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean isDone() {
            return (index >= history.count);
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String currentItem() {
            return urls[index];
        }
    }

//    public class ListIterator implements Iterator<String> {
//
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//
//        @Override
//        public boolean isDone() {
//            return (index >= 10);
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String currentItem() {
//            return history.urls.get(index);
//        }
//    }
}
