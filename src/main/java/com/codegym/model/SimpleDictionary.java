package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary implements IDictionary {
    static Map <String, String>map = new HashMap<>();
    static {
        map.put("hello", "xin chao");
        map.put("bye", "tam biet");
        map.put("book", "quyen sach");
        map.put("phone", "dien thoai");
        map.put("computer", "may tinh");
        map.put("wall", "buc tuong");

    }

    @Override
    public String search(String keyWord) {
        return map.get(keyWord);
    }
}
