package org.example.controllers;

import org.example.models.LectureModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LectureController {
    private final ArrayList<LectureModel> lectures = new ArrayList<>();

    // 강의명 중복 확인
    public boolean isLectureExist(String title) {
        return lectures.stream().anyMatch(lecture -> lecture.getTitle().equals(title));
    }

    // 번호 범위 확인
    public boolean isIndexExist(int id) {
        return 0 >= id || id > lectures.size();
    }

    // 입력받은 정보 강의 생성
    public void createLecture(String title, String lecturer, String tag, double stars) {
        LectureModel newLecture = new LectureModel(title, lecturer, tag, stars);
        lectures.add(newLecture);
    }

    // 전체 강의 읽어오기
    public ArrayList<LectureModel> listAllLectures() {
        return new ArrayList<>(lectures);
    }

    // parameter들이 비어 있지 않을 때, 강의 정보 업데이트
    public void updateLecture(int id, String title, String lecturer, String category) {
        if (!title.isEmpty()) lectures.get(id-1).setTitle(title);
        if (!lecturer.isEmpty()) lectures.get(id-1).setLecturer(lecturer);
        if (!category.isEmpty()) lectures.get(id-1).setCategory(category);
    }

    // parameter의 index의 강의 삭제
    public void deleteLecture(int id) {
        lectures.remove(id-1);
    }

    // parameter의 강의명이 포함된 강의 검색
    public List<LectureModel> searchLectures(String title) {
        return lectures.stream().filter(lecture -> lecture.getTitle().contains(title)).toList();
    }

    // 별점이 높은 순서대로 강의 검색
    public List<LectureModel> sortLectures() {
        return lectures.stream().sorted(Comparator.comparing(LectureModel::getStars).reversed()).toList();
    }
}
