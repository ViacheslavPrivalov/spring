package com.example.spring.service;

import com.example.spring.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@SessionScope
public class BucketServiceImpl implements BucketService{

    private List<Item> bucket = new ArrayList<>();
    @Override
    public List<Item> add(Integer... IDs) {
        List<Item> items = Arrays.stream(IDs)
                .map(Item::new)
                .collect(Collectors.toList());
        bucket.addAll(items);
        return items;
    }

    @Override
    public List<Item> get() {
        return bucket;
    }
}
