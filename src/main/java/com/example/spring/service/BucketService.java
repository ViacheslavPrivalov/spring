package com.example.spring.service;

import com.example.spring.model.Item;

import java.util.List;

public interface BucketService {
    List<Item> add(Integer... IDs);

    List<Item> get();
}
