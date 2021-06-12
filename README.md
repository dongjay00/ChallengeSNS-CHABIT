# CHABIT

:computer:**UCC** - [링크](https://www.youtube.com/watch?v=_UvQ4FGphfI)

## :family: 팀소개

- 팀명 : 살찐개
- **참여자**
  - 팀장 : 김민혁
  - 팀원 : 윤지해, 이동훈, 백정현, 이아름
- **역할 분담**
  - **프론트**  
     이아름, 이동훈, 윤지해, 백정현
  - **백엔드**  
     백정현, 김민혁
  - **QA**  
     백정현, 윤지해, 이동훈
  - **UI/UX 디자이너**  
     백정현
  - **테크리더**  
     김민혁
  - **기획**  
     이아름

## :book: 주제

### CHABIT

- **Challenge to Habit - 새로운 습관에 도전하다.**

## :wrench: 주요 기능

- 새로운 습관을 만들거나 꾸준함을 목표로 하는 사람들을 위해<br>다른 사람들과 함께 도전 할 수 있는 챌린지를 제공합니다.

- 챌린지 성공 시 인증서와 포인트를 통해 동기부여를 얻습니다.

- 리뷰를 통해 다른 유저들과의 소통과 취미 또는 습관에 대한 공유 기능을 제공합니다.

- 챌린지 인증을 하기 위해 랜덤으로 제시되는 손동작을 함께 올리도록 합니다.

## :tv: 실행 화면

|                         챌린지 생성                          |                         챌린지 상세                          |                         챌린지 인증                          |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| ![image-20210612120910589](./README.assets/image-20210612120910589.png) | ![image-20210612120948614](./README.assets/image-20210612120948614.png) | ![image-20210612121040479](./README.assets/image-20210612121040479.png) |
|                           **랭킹**                           |                       **업적 & 뱃지**                        |                      **날짜별 챌린지**                       |
| ![image-20210612121220292](./README.assets/image-20210612121220292.png) | ![image-20210612121307424](./README.assets/image-20210612121307424.png) | ![image-20210612121503241](./README.assets/image-20210612121503241.png) |
|                           **리뷰**                           |                        **유저 검색**                         |                       **챌린지 검색**                        |
| ![image-20210612121728315](./README.assets/image-20210612121728315.png) | ![image-20210612121702388](./README.assets/image-20210612121702388.png) | ![image-20210612121636955](./README.assets/image-20210612121636955.png) |



## 개발환경

|   분류   |                                        정보                                         |
| :------: | :---------------------------------------------------------------------------------: |
| 운영체제 |                                     Windows 10                                      |
| 개발 툴  | Spring Tools 4.9.0 - WINDOWS 64-BIT<br>IntelliJ IDEA Ultimate<br>Visual Studio Code |
|   JDK    |                                     JAVA 8이상                                      |

## 기술 스택

|    분류    |                          기술                           |
| :--------: | :-----------------------------------------------------: |
| 프론트엔드 |           Vue.js, Vuex <br /> HTML5, CSS3, JS           |
|   백엔드   | Spring Boot <br /> H2 (개발, 테스트) <br /> MySQL(배포) |
|   DevOps   |    Jira, mattermost <br /> GitLab <br /> Docker, AWS    |

## 시스템 구성도

![시스템 구성](./산출물/최종시스템구성도_CHABIT.png)

### 디렉토리 구조

**Spring Boot**

```bash
backend
├─ .gitignore
├─ build.gradle
└─ src
   ├─ main
   │  ├─ java
   │  │   └─ chabit
   │  │       ├─ controller
   │  │       ├─ service
   │  │       ├─ repository
   │  │       ├─ domain
   │  │       ├─ config
   │  │       ├─ exception
   │  │       └─ ChabitApplication.java
   │  └─ resources
   │     ├─ application.yml   설정 파일
   │     └─ ...
   └─ test                    테스트 파일

```

**Vue**

```bash
frontend
├─ README.md
├─ package.json
└─ src
   ├─ main.js
   ├─ App.vue
   ├─ components        컴포넌트
   │  ├─ common
   │  ├─ include
   │  └─ user
   │     └─ snsLogin
   │
   ├─ router            라우터
   │  └─ index.js
   │
   ├─ views             라우터 페이지
   │  ├─ challenge
   │  ├─ feed
   │  ├─ follow
   │  ├─ home
   │  ├─ ranking
   │  ├─ setting
   │  └─ user
   │
   ├─ vuex              상태 관리
   │  ├─ actions.js
   │  ├─ getter.js
   │  ├─ mutations.js
   │  └─ store.js
   │
   ├─ api               api 함수
   │  ├─ UserApi.js
   │  └─ ...
   │
   └─ assets            기타 자원
      ├─ css            스타일 시트
      │  ├─ common.css
      │  └─ ...
      ├─ img            이미지
      └─ ...
```



