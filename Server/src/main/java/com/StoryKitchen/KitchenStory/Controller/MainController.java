package com.StoryKitchen.KitchenStory.Controller;

import com.StoryKitchen.KitchenStory.Entity.ProductEntity;
import com.StoryKitchen.KitchenStory.Entity.UserEntity;
import com.StoryKitchen.KitchenStory.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MainController {

    private final Service service;

    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> GetAllProducts() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/products")
    public ResponseEntity createProducts(@RequestBody ProductEntity product) {
        return ResponseEntity.ok(service.createProduct(product));
    }

    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserEntity user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> GetAllUser() {
        return ResponseEntity.ok(service.GetAllUser());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<UserEntity>> GetUserById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findSingleUser(id));
    }

    @GetMapping("products/{name}")
    public ResponseEntity<List<ProductEntity>> SearchByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByName(name));
    }
}
