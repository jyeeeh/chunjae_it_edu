# 프로젝트 소개



CRUD 기능이 포함되어있는 게시판입니다.

키보드 입력을 받아 메인, 보조메뉴 선택을 하며 이동합니다.

# 기술 스택
<img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=MariaDB&logoColor=white">
<img src="https://img.shields.io/badge/IntelliJIDEA-000000?style=for-the-badge&logo=IntelliJIDEA&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">



# 화면 구성



**[메인페이지]**

게시물 목록을 보여주며

1. Create | 2. Read | 3. Clear | 4. Exit 中 입력을 받아 실행
 
![1](https://github.com/jyeeeh/Project/assets/145963612/39e9a043-db1a-4dbd-bc87-fdc75888078b)

**[1. Create]**

- 새 게시물 입력 - 제목, 내용, 작성자 순으로 입력

![2](https://github.com/jyeeeh/Project/assets/145963612/4a1f98cc-130b-4a51-8175-d7c8ab1d6bc2)

전체 입력 후 보조메뉴를 통해 1. Ok, 2. Cancel 중 선택하게 하며 1번 클릭 시 게시물 리스트에 업로드 2번은 취소

![3](https://github.com/jyeeeh/Project/assets/145963612/f30bf309-255b-486a-9a74-e14fa47ca061)

**[2. Read]**

- 게시물 읽기 - 게시물 목록에 no(게시물 리스트 번호)를 선택하면 해당 게시물의 제목, 내용, 작성자, 작성일자가 출력
- 보조메뉴로 1. Update | 2. Delete | 3. List 출력

![4](https://github.com/jyeeeh/Project/assets/145963612/594c7ea6-f2fe-4594-b51c-5768e38664ba)

-1) Update 

선택한 게시물의 수정 내용(수정, 내용, 작성자)를 입력받고 Update 실행

![5](https://github.com/jyeeeh/Project/assets/145963612/dff98313-f11a-4be1-84b9-84aa5fdb8d9b)

-2) Delete 

선택 게시물 삭제

![6](https://github.com/jyeeeh/Project/assets/145963612/e56d163f-68de-4325-b94e-3c197dfc0c69)

-3) List

현재 게시물 목록 리스트 출력

**[3. Clear]**

- 게시물 전체 삭제 - 보조메뉴로 삭제할건지 한번 더 물어보고 전체삭제 진행

![7](https://github.com/jyeeeh/Project/assets/145963612/72a022fb-ef92-45a1-89d4-57b7ea9ba7fb)

**[4. Exit]**

- 게시판 실행 종료

![8](https://github.com/jyeeeh/Project/assets/145963612/87b3eaf6-a5ef-46cd-8d32-d2103954be82)