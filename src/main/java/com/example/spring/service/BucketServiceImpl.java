package com.example.spring.service;

import com.example.spring.model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Scope("request")
public class BucketServiceImpl implements BucketService{

    private List<Item> bucket = new ArrayList<>();
    @Override
    public Item[] add(Integer... IDs) {
        Item[] items = new Item[IDs.length];
        for (int i = 0; i < IDs.length; i++) {
            Integer id = IDs[i];
            Item item = new Item(id);
            bucket.add(item);
            items[i] = item;
        }
        return items;
    }

    @Override
    public List<Item> get() {
        return bucket;
    }
}
