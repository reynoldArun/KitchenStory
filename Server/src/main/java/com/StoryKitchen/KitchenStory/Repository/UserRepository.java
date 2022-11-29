package com.StoryKitchen.KitchenStory.Repository;

import com.StoryKitchen.KitchenStory.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Integer> {
}
