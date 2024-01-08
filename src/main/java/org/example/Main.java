package org.example;

import org.example.controllers.LectureController;
import org.example.controllers.UserController;
import org.example.models.UserModel;
import org.example.views.LectureView;
import org.example.views.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LectureController lectureController = new LectureController();
        UserController userController = new UserController();
        LectureView lectureView = new LectureView(in, lectureController);
        UserView userView = new UserView(in, userController);

        UserModel loggedInUser = null;

        while (true) {
            if (loggedInUser == null) {
                System.out.println("[1]강의 목록 [2]강의 검색 [3]로그인 [4]회원가입 [0]종료");
                int select = in.nextInt();
                in.nextLine();

                switch (select) {
                    case 1 -> lectureView.listAllLectures();
                    case 2 -> lectureView.searchLectures();
                    case 3 -> loggedInUser = userView.login();
                    case 4 -> userView.createUser();
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다.");
                        in.close();
                        return;
                    }
                    default -> System.out.println("다시 입력해 주세요.");
                }
            } else {
                System.out.println("[1]수강 신청 [2]수강 목록 [3]수강 강의 검색 [4]회원정보 수정 [5]로그아웃 [6]회원 탈퇴");
                int choice = in.nextInt();
                in.nextLine();

                switch (choice) {
                    case 1 -> lectureView.addLectureToUser(loggedInUser);
                    case 5 -> {
                        loggedInUser = null;
                        System.out.println("-----로그아웃 되었습니다.-----");
                        System.out.println("-------------------------");
                    }
                    case 6 -> {
                        userView.removeUser();
                        loggedInUser = null;
                        System.out.println("-----회원탈퇴 되었습니다.-----");
                        System.out.println("-------------------------");
                    }
                }
            }
        }
    }
}