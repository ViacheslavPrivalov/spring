package com.example.spring.controller;

import com.example.spring.model.Item;
import com.example.spring.service.BucketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
    public Item[] add(@RequestParam(value = "ID") Integer... IDs) {
        return bucketService.add(IDs);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return bucketService.get();
    }
}
