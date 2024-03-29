# WALAB_Project2

## 프로젝트 개요
- WALAB_Project2는 CRUD(Create, Read, Update, Delete) 기능과 파일 I/O를 통해 데이터를 관리하는 Java 프로젝트입니다.
- 이 프로젝트는 기존의 Project1을 확장하여 파일 기반 데이터 관리 기능을 추가하였습니다. 또한 Project1의 논리적, 구조적 결함을 개선하였습니다.
- 인프런 홈페이지의 강의, 유저 데이터 관리를 콘솔 프로그램으로 제작하였습니다. https://www.inflearn.com/

## 사용된 클래스 & 라이브러리

### 클래스
- main
    - Main: 프로그램의 시작점, 로그인 전, 관리자 모드, 일반 유저 모드의 흐름을 제어합니다.
- models
    - UserModel: 사용자 정보의 schema를 정의합니다.
    - LectureModel: 강의 정보의 schema를 정의합니다.
- controllers
    - UserController: 사용자 정보(수강 정보)를 관리합니다.
    - LectureController: 강의 정보를 관리합니다.
- views
    - UserView: 사용자 정보를 출력합니다.
    - LectureView: 강의 정보를 출력합니다.
  
### 라이브러리
- lombok: Java 클래스의 보일러플레이트 코드를 줄이기 위해 사용합니다.(getter, setter, constructor)
- json-simple: JSON 데이터 포맷을 사용하여 데이터를 읽고 쓰는 기능을 구현하는 데 사용합니다.

### 데이터 저장 포맷
- JSON (JavaScript Object Notation) 포맷을 사용하여 사용자 데이터와 강의 정보를 파일에 저장하고 관리합니다.

- readData(lectureData.json, userData.json) 미리 저장하여 읽기 위한 강의, 유저 데이터입니다.
<img width="467" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/4b68d9af-de73-4eac-b432-7729d7a7d287">

- writeData(lectureData.json, userData.json) -> 회원가입, 회원 탈퇴, 정보 수정 등 / CUD 발생 시 파일로 저장합니다.
<img width="824" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/dc23a9e5-8e23-4218-8a63-4e140fdc015b">

## 스크린샷
<img width="1031" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/7b581191-f15d-4add-ba51-c7670acb6a20">
<img width="369" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/ef4a99b1-369b-4969-a3f5-7294ad9b1d9e">
<img width="1051" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/e4b3ccc8-c8d0-442a-9172-687e62e23a9e">
<img width="1053" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/7a758578-20d7-47d8-85c0-4fdd7b0c6f93">
<img width="1036" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/e005f603-b610-4a69-8c9b-8c686d00f6cd">
<img width="1032" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/afaf21fa-b3c4-4fc6-9627-f403a872ca45">
<img width="741" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/e1824f4e-77d1-4a05-aabe-6352e6cd3267">
<img width="711" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/984ad1f2-086a-45e5-bcec-b35c25218f6b">
<img width="713" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/fde14202-c064-47dd-99e6-8533150e52bc">
<img width="718" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/a44c40ab-1ccc-439b-86cd-5f176a9edd04">
<img width="710" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/9e38044f-a25c-489c-838b-3eba0c5e4299">
<img width="712" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/fcb0b9dd-10fd-4584-9719-1b20bcf1db75">
<img width="553" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/4f9211d3-66b3-462e-af3d-a3f8480c5b3a">
<img width="372" alt="image" src="https://github.com/eunoia-jason/WALAB_Project2/assets/62330979/3f738873-f925-4711-9ee4-5026ad1f7f57">
