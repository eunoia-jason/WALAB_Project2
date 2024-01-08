package org.example;

import org.example.controllers.LectureController;
import org.example.views.LectureView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LectureController lectureController = new LectureController();
        LectureView lectureView = new LectureView(in, lectureController);

        while (true) {
            System.out.println("[1]강의 등록 [2]강의 목록 [3]강의 수정 [4]강의 삭제 [5]강의명 검색 [6]별점순 검색 [0]종료");
            int select = in.nextInt();
            in.nextLine();

            switch (select) {
                case 1 -> lectureView.createLecture();
                case 2 -> lectureView.listAllLectures();
                case 3 -> lectureView.updateLecture();
                case 4 -> lectureView.deleteLecture();
                case 5 -> lectureView.searchLectures();
                case 6 -> lectureView.sortLectures();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    in.close();
                    return;
                }
                default -> System.out.println("다시 입력해 주세요.");
            }
        }
    }
}