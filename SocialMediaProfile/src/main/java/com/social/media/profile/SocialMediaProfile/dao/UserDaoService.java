package com.social.media.profile.SocialMediaProfile.dao;

import com.social.media.profile.SocialMediaProfile.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int idCount = 0;//will migrate this to the db

    static {
        users.add(new User(++idCount, "Maria", 40));
        users.add(new User(++idCount, "James", 40));
        users.add(new User(++idCount, "Tim", 40));
    }

    public List<User> getAll() {
        return users;
    }

    public User getById(Integer id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);

    }

    public void save(User user) {
        idCount++;
        user.setId(idCount);
        users.add(user);
    }


    public void deleteById(Integer id) {
        users.removeIf(user -> user.getId() == id);
    }
}
