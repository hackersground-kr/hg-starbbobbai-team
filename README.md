# 별뽀빠이 - 농담터

해커그라운드 해커톤에 참여하는 '별뽀빠이' 팀의 `농담터`입니다.

## 참고 문서

> 아래 두 링크는 해커톤에서 앱을 개발하면서 참고할 만한 문서들입니다. 이 문서들에서 언급한 서비스 이외에도 더 많은 서비스들이 PaaS, SaaS, 서버리스 형태로 제공되니 참고하세요.

- [순한맛](./REFERENCES_BASIC.md)
- [매운맛](./REFERENCES_ADVANCED.md)

## 제품/서비스 소개

<!-- 아래 링크는 지우지 마세요 -->
[제품/서비스 소개 보기](TOPIC.md)
<!-- 위 링크는 지우지 마세요 -->

## 오픈 소스 라이센스

<!-- 아래 링크는 지우지 마세요 -->
[오픈소스 라이센스 보기](./LICENSE)
<!-- 위 링크는 지우지 마세요 -->

## 설치 방법

> **아래 제공하는 설치 방법을 통해 심사위원단이 여러분의 제품/서비스를 실제 Microsoft 애저 클라우드에 배포하고 설치할 수 있어야 합니다. 만약 아래 설치 방법대로 따라해서 배포 및 설치가 되지 않을 경우 본선에 진출할 수 없습니다.**

### 사전 준비 사항
### 인텔리제이(intellj) 설치하는 방법

https://www.jetbrains.com/ko-kr/idea/
1. 위 링크로 들어가서 오른쪽 위에 있는 다운로드 버튼을 클릭한다.
2. 클릭을 하게 되면 위에는 Ultimate가 있고, 아래로 내려가면 Community Edition가 있다.
3. 그 중에서 아래에 있는 Community Edition를 할거이다.
4. 다운로드를 하기 전에 다움로드 버튼 오른쪽에 있는 dmg가 보일 것이다. 클릭하게 되면 intel과 apple이 보일것이다.
5. 만약 자신이 맥이라면 apple을 클리하여 다운로드 버튼을 누르고, 윈도우라면 intel를 눌러서 다운로드 버튼을 클릭한다.
   - 애플 사용자(윈도우는 아래에 있는 '왼도우 사용자' 로 확인해주세요)
7. 아래의 이미지 처럼 빨간색 화살표가 가르키는 것을 클릭한다.
![image](https://github.com/user-attachments/assets/d5f633ff-5f67-4312-8a06-488fe10011c4)

8. 클릭하게 되면 흰색 배경에 왼쪽과 오른쪽에 아이콘 같은게 뜰것이다.
9. 이때 왼쪽에 있는걸 두번 클릭한다,
10. 화면에 뭐가 뜰텐데 위에서 첫번째꺼 누르면 된다.
11. 이렇게 하면 인텔리제이가 열릴것이다.
12. 왼쪽 위에 new project를 클릭한다.
13. 영어로 뭐가 많이 적혀있을 것이다.
14. 맨위에는 이름이니 하고 싶은 이름을 작성한다.
15. 그 아래에는 위치를 선택할 수 있는데 처음에는 그대로 두는 것을 추천한다,
16. 또 아래로 내려가게 되면 3가지 선택할 수 있는 버튼들이 있을것이다
17. 이때 제일 왼쪽에 있는 버튼을 클릭한다.
18. 그 아래에 jdk이라고 써져있을것이다.
19. 이름 옆에 박스를 클릭한다.
20. 많가 많이 있지만 그 중에서 Download JDK...를 선택한다.
21. 클릭하게 되면 위에서 부터 버전, 종류, 위치를 선택할 수 있다.
22. 순서대로 버전 : 22, 종류 : Oracle OpenJDK, 위치는 자유
23. 선택하게 되면 오른쪽 아래 파란색 버튼을 클릭한다.
24. 그리고 한번더 오른쪽 아래 파란색 버튼을 클릭한다.
25. 그러면 환경설정이 다 되었다.

    - 윈도우 사용자
![image](https://github.com/user-attachments/assets/8dac641c-7429-4be9-9dce-a95ad0213304)

6. 다운로드를 클릭했다면 아래와 같이 InteliJ가 다운로드 되고 있을 것이다.
7. 다운 받고 폴더 열기를 누른다.
![image](https://github.com/user-attachments/assets/946b344a-7714-47bb-b2c3-954a7c4f61df)

8. 오른쪽 아래에 next를 누른다.
9. 계속해서 오른쪽 아래에 있는 next를 누른다.
10. 계속 누르다보면 다운을 받게 될것이다.
![image](https://github.com/user-attachments/assets/7b9c92ee-83e6-47eb-b3e3-59d20509190d)

11. 설치가 끝났다면 Reboot now를 체크하고 컴퓨터를 한번 재부팅 해주자
12. 바탕화면에 설치된 intellij를 두번 클릭한다.
![image](https://github.com/user-attachments/assets/a3f47fb1-f494-41cb-b5cb-a7d024ba914d)

13. 이러한 화면이 나오지만 I confirm that I have read and accept the terms of this User Agreement를 체크하고 continue를 클릭한다.
![image](https://github.com/user-attachments/assets/dd75db42-fa31-427e-b21f-0adc8b51c1a1)

14. 로그인 하라고 나올것이다. 계정이 없으면 회원가입을 한다.
![image](https://github.com/user-attachments/assets/bad5a453-6557-470a-9503-ab7ea1c914c5)

15.https://github.com/hackersground-kr/hg-starbbobbai-team 이 링크를 클릭하여 들어간다. 
![image](https://github.com/user-attachments/assets/41bd5dc5-0d77-4679-b919-83a920af6eb1) 이렇게 생긴 모양의 버튼을 눌러 server를 선택한다.

16. ![image](https://github.com/user-attachments/assets/7b9fae75-8948-45d6-8499-71c77b4ec503) code 라고 적힌 초록색 버튼을 클릭하고 download zip 이라고 적힌 것을 클릭한다.
17. create new project를 누른다.
![image](https://github.com/user-attachments/assets/f7737565-8952-4807-8190-270542041646)

18. 왼쪽 상단에 Java를 선택하고 Next를 클릭해주자
![image](https://github.com/user-attachments/assets/0e1bdfce-a5fe-40bd-a937-242cb4f68074)

19. next 클릭
![image](https://github.com/user-attachments/assets/1145b978-5192-45be-a58b-5dfaa3bc1001)

20. 위에서 부터 이름, 경로이다. 자신의 취향대로 정하면 된다.
![image](https://github.com/user-attachments/assets/05ca6759-3fa1-4a17-967b-3ec797a3395c)

21. 이렇게 나오면 끝!

### 도커(Docker) 설치하기
도커란? 애플리케이션을 개발, 배포 및 실행하기 위한 플랫폼 및 도구 모음입니다. 주요 목적은 소프트웨어를 컨테이너라고 불리는 표준화된 유닛 내에서 패키징하여, 코드가 일관된 환경에서 실행될 수 있도록 하는 것입니다.

- 애플 사용자 (윈도우 사용자는 아래에 자료를 참고해주세요)
1. 공식 사이트에서 다운로드를 합니다. 

```M1 기준 프로세스 기기로 설치하기에 ‘Docker Desktop for Mac with Apple slicon’으로 설치를 해줍니다.```
https://docs.docker.com/desktop/install/mac-install/
![image](https://github.com/user-attachments/assets/4948f8b7-b43e-4af8-b714-2cc53e57bff9)

2. 다운로드한 파일을 클릭합니다.
![image](https://github.com/user-attachments/assets/c0cf11c0-fa51-4f6e-a626-379e3d4c2abc)

3. 왼쪽 아이콘을 오른쪽으로 드레그하라고 나옵니다.
4. 왼쪽 아이콘에 마우스를 갖다 대고 꾹 눌러서 오른쪽 아이콘까지 끌고 갑니다.
5. application이라는 파일에 도커가 들어갑니다!
![image](https://github.com/user-attachments/assets/65d036cf-6440-42b9-98c4-037a4b454f31)

6. 도커라는 아이콘을 클릭합니다.
7. 클릭 했을 때 어떤 창이 나올겁니다. 맨 위에 있는 열기를 클릭합니다.
8. 아래 사진 처럼 나오게 됩니다. 오른쪽 아래에 있는 Accecpt 버튼을 클릭합니다.
![image](https://github.com/user-attachments/assets/6174e14c-ed7b-4d00-af73-e32931c77e7b)

9. 아래 사진 처럼 선택해주고 오른쪽 아래에 있는 finish 버튼을 선택합니다.
![image](https://github.com/user-attachments/assets/1a194fd5-73df-42a5-a13b-901f3d03d9d2)

10. 도커 기능을 이용하기 위해서 회의가입을 진행합니다. + 간단한 설문도 있습니다.(자유롭게 하시면 됩니다.)
![image](https://github.com/user-attachments/assets/b5c420ee-fa72-43df-a964-1731ca89f346)

11. 여기까지 잘 따라오면 아래 사진과 화면이 똑같이 나올겁니다.
![image](https://github.com/user-attachments/assets/c04819dd-192c-4745-9103-fda4cc068536)

- 윈도우 사용자 전용
1. 나의 컴퓨터 사양 알아보기
![image](https://github.com/user-attachments/assets/23b95f04-46d3-4222-8c7f-3ff3530fe170)
사진과 같이 하단에 돋보기를 눌러서 검색을 합니다.

2. 자신의 컴퓨터가 어떤지 아래 사진과 같이 알 수 있습니다.
![image](https://github.com/user-attachments/assets/3ee24b15-56bd-4851-b904-0860417a3ffa)

사진 예시에는 window 11 pro라고 나옵니다.
여기서 Windows Pro, Enterprise, 또는 Education 버전이 필요합니다.(다른 버진일 경우 설치가 가능하지만 기능이 적습니다.)

3. 다시 한번 돋보기로 관리자 권한이라고 검색합니다.
4. 그리고 아래와 같이 명령어를 순차적으로 복사 붙여넣기 합니다.
```dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart```
```dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestar```

![image](https://github.com/user-attachments/assets/1956d644-a0a3-40a3-855f-555a7725ce48)
입력하게 되면 위 사진과 같이 나올겁니다.

5. 컴퓨터 껐다가 킨 다음 왼쪽 아래 돋보기를 클릭하여 작업 관리자를 검색한 다음 클릭합니다.
6. 그리고 거기에 wsl 을 적습니다.
![image](https://github.com/user-attachments/assets/b86983f4-c18e-4bfd-af44-a207df914c05)

https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi
7. 위 링크를 클릭하여 다운로드를 합니다.
8. 실행하여 아이디와 비밀번호를 정합니다.
![image](https://github.com/user-attachments/assets/60645398-2a41-4105-b225-b600c7ee9bbb)

9. 다시 돋보기를 통해서 작업 관리자를 엽니다.
10. wsl -l -v 를 적은 후 사진과 동일하게 나오는지 확인합니다,

11. 하단 링크를 클릭합니다.
https://docs.docker.com/desktop/install/windows-install/

12. 화면에 파란색 버튼 Docker Desktop for Windows를 클릭하여 다운로드를 합니다.

13. 실행을 합니다.
![image](https://github.com/user-attachments/assets/224856c5-7934-4b0d-8fc1-22d92a2080a8)

안내에 따라 모두 체크하고 오른쪽 아래에 있는 OK버튼을 클학합니다.

14.사진과 같이 설치가 완료 되었다면 close and logout 파란색 버튼을 클릭합니다. 그러면 재부팅이 됩니다.

15. 재부팅 후 도커 아이콘을 눌러서 실행합니다.
16. 도커를 실행되면 가이드가 나타납니다.
![image](https://github.com/user-attachments/assets/5e8c95d0-4e1c-4ddb-ba09-e99a35c6e5d5)

17. 이후 아래 사진과 같은 화면이 나올겁니다.
![image](https://github.com/user-attachments/assets/d42cc1ed-e2d8-4897-aa0b-05266c32367c)

18. 오른쪽 상단에 톱니바퀴를 클릭합니다.
19. General 설정에 Use the WSL 2 based engine가 체크가 되었는지 확인합니다. 체크가 안되어있으면 체크를 하고 아래 하단에 Apply & Restart 버튼을 클릭합니다.
20. 이상으로 도커를 설치하고 환경 설정을 했습니다!
    
## 시작하기
1. 터미널에
![image](https://github.com/user-attachments/assets/a6176bbc-9c82-4c54-85d7-efe12f30488b)

(위 사진에 가르키는 게 터미널) azd auth login --use-device-code=false <- 이거 한줄 치고 엔터를 눌러 로그인, 선택사항이 나올 경우 계속 엔터 az login <- 이거 한줄 치고 엔터를 눌러 로그인, 선택사항이 나올 경우 계속 엔터 GITHUB_TOKEN= <- 밑에 줄과 함께 치고 엔터를 눌러 로그인 선택사항이 나올 경우 계속 엔터 gh auth login

2.터미널에 azd auth login --check-status <- 이거 한줄 치고 엔터 눌러 로그인 확인 az account show <- 이거 한줄치고 엔터 눌러 로그인 확인 gh auth status <- 이거 한줄치고 엔터 눌러 로그인 확인

3.터미널에 AZURE_ENV_NAME="{{ GITHUB_ID }}" azd init -e $AZURE_ENV_NAME 두줄을 함께 친다. 중요한 것은 {{ GITHUB_ID }}는 자신의 GitHub 아이디로 변경하여 예를 들어 GitHub 아이디가 Azure-Samples라면 {{ GITHUB_ID }}를 Azure-Samples로 변경해야한다.

4.배포 환경 초기화 방법을 물어보면 Use code in the current directory를 선택하여 엔터를 칩니다. Azure Container Apps를 사용해 배포한다고 물어보면 Confirm and continue initializing my app 옵션을 선택하여 엔터를 칩니다. 그러면 .azure 디렉토리와 next-step.md, azure.yaml 파일이 생성된다.

터미널에 azd up을 입력하여 엔터를 칩니다. 어떤 Azure 구독을 사용할 것인지 물어봅니다. 사용할 구독을 선택합니다. 어느 지역에 배포할 것인지 물어봅니다. 아무 지역이나 선택해도 되지만, 여기서는 Korea Central을 선택하여 엔터를 칩니다. 터미널에 글자들이 나오고 오랜시간 동안 기다리면![image](https://github.com/user-attachments/assets/3ae48bad-e609-4065-98ff-0ca208734fc1)
다음과 같은 화면이 나와요.
> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**
