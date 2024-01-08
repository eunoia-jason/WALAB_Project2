package org.example.controllers;

import org.example.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private final List<UserModel> users = new ArrayList<>();

    // 이메일 중복 체크
    public boolean isEmailExist(String email) {
        return users.stream().anyMatch(user -> user.getEmail().equals(email));
    }

    public void createUser(int id, String email, String password, String name) {
        if (isEmailExist(email)) {
            throw new IllegalStateException("이미 존재하는 이메일입니다.");
        }

        UserModel newUser = new UserModel(id++, email, password, name);

        users.add(newUser);
    }

    // 유저 삭제
    public void removeUser(String email, String password) {
        users.removeIf(user -> user.getEmail().equals(email) && user.getPassword().equals(password));
    }

    // 유저 목록 조회
    public List<UserModel> listAllUsers() {
        return new ArrayList<>(users);
    }

    // 유저 찾기
    public UserModel findUser(String email, String password) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    // 유저 정보 수정
    public void updateUser(UserModel user, String email, String password, String name) {
        if (user != null) {
            if (email != null && !email.isEmpty()) user.setEmail(email);
            if (password != null && !password.isEmpty()) user.setPassword(password);
            if (name != null && !name.isEmpty()) user.setName(name);
        }
    }
}
