package com.StoryKitchen.KitchenStory.Service.impl;

import com.StoryKitchen.KitchenStory.Entity.ProductEntity;
import com.StoryKitchen.KitchenStory.Entity.UserEntity;
import com.StoryKitchen.KitchenStory.Repository.ProductRepository;
import com.StoryKitchen.KitchenStory.Repository.UserRepository;
import com.StoryKitchen.KitchenStory.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceImpl implements Service {
    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    @Override
    public List<ProductEntity> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> GetAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findSingleUser(Integer id) {
        return userRepository.findById(id);
    }


}
