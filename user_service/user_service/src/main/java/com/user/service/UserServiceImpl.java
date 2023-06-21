package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = Arrays.asList(
            new User(1311L, "Neelesh Sharma", "8675567856"),
            new User(1312L, "Shailesh Sharma", "9878767876"),
            new User(1314L, "Ravi Sharma", "9889898989")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
