package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}

@RestController
@RequestMapping("/items")
class ItemController {
    private final List<Item> items = new ArrayList<>();

    @GetMapping
    public List<Item> getAllItems() {
        return items;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        item.setId(UUID.randomUUID().toString());
        items.add(item);
        return item;
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody Item updatedItem) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                item.setName(updatedItem.getName());
                item.setDescription(updatedItem.getDescription());
                return item;
            }
        }
        throw new RuntimeException("Item not found");
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable String id) {
        items.removeIf(item -> item.getId().equals(id));
    }
}

class Item {
    private String id;
    private String name;
    private String description;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
