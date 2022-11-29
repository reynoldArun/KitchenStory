package com.StoryKitchen.KitchenStory.Service;

import com.StoryKitchen.KitchenStory.Entity.ProductEntity;
import com.StoryKitchen.KitchenStory.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface Service {
    List <ProductEntity> findAll();
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findByName(String name);

    UserEntity createUser(UserEntity user);

    List<UserEntity> GetAllUser();

    Optional<UserEntity> findSingleUser(Integer id);


}
