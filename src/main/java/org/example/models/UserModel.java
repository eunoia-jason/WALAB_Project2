package org.example.models;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private int id;
    private String email;
    private String password;
    private String name;
    private List<LectureModel> lectureList;
    private String regDate;
    private String recentLoginDate;

    public UserModel(
            int id,
            String email,
            String password,
            String name
    ) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;

        this.lectureList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.regDate = LocalDateTime.now().format(formatter);
        this.recentLoginDate = LocalDateTime.now().format(formatter);
    }
}
