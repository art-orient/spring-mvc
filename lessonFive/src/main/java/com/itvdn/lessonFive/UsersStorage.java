package com.itvdn.lessonFive;

import com.itvdn.lessonFive.dtos.PutUserRequest;
import com.itvdn.lessonFive.dtos.UserDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersStorage {
    private List<UserDTO> users = new ArrayList<>();


    public void putUser (PutUserRequest putUserRequest) {
        long id = (long) users.size() + 1;
        users.add(new UserDTO(id,
                putUserRequest.getName(),
                putUserRequest.getSurname(),
                putUserRequest.getLogin(),
                putUserRequest.getPassword(),
                putUserRequest.getEmail()));
    }

    public UserDTO getUserById (int id) {
        return users.get(id - 1);
    }
}
