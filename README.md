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

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위해 사전에 필요한 준비 사항들을 적어주세요.**
>
https://www.jetbrains.com/ko-kr/idea/
1. 위 링크로 들어가서 오른쪽 위에 있는 다운로드 버튼을 클릭한다.
2. 클릭을 하게 되면 위에는 Ultimate가 있고, 아래로 내려가면 Community Edition가 있다.
3. 그 중에서 아래에 있는 Community Edition를 할거이다.
4. 다운로드를 하기 전에 다움로드 버튼 오른쪽에 있는 dmg가 보일 것이다. 클릭하게 되면 intel과 apple이 보일것이다.
5. 만약 자신이 맥이라면 apple을 클리하여 다운로드 버튼을 누르고, 윈도우라면 intel를 눌러서 다운로드 버튼을 클릭한다.
   - 맥의 경우(윈도우는 아래에 있는 '왼도우의 경우' 로 확인해주세요)
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

    - 윈도우
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
15. create new project를 누른다.
![image](https://github.com/user-attachments/assets/f7737565-8952-4807-8190-270542041646)
16. 왼쪽 상단에 Java를 선택하고 Next를 클릭해주자
![image](https://github.com/user-attachments/assets/0e1bdfce-a5fe-40bd-a937-242cb4f68074)
17. next 클릭
![image](https://github.com/user-attachments/assets/1145b978-5192-45be-a58b-5dfaa3bc1001)
18. 위에서 부터 이름, 경로이다. 자신의 취향대로 정하면 된다.
![image](https://github.com/user-attachments/assets/05ca6759-3fa1-4a17-967b-3ec797a3395c)
19. 이렇게 나오면 끝!

**코드를 가져오는 방법**
![image](https://github.com/user-attachments/assets/c99e72be-a30f-48f6-97c3-41afd993184d)
여기 기본 화면에서
![image](https://github.com/user-attachments/assets/737ae020-9af6-4978-975d-f76d15fe1f96)
사진과 같이 왼쪽 데각선 위에 있는 상자를 클릭한다.
그 다음에 open...을 클릭하면
![image](https://github.com/user-attachments/assets/c954cfaf-5ef8-4aed-b971-789c78e1189f)
위에 사진과 같이 열릴것이다.
그러면 자신이 가져오고 싶은 코드가 담긴 폴더를 선택하고 확인을 누르면
![image](https://github.com/user-attachments/assets/cc08437d-7a0d-45cd-a7ca-8f5158e18c5e)
사진과 같이 열린다!
(맥과 윈도우는 거의 일치해서 상관이 없다)
## 시작하기
1. 터미널에
![image](https://github.com/user-attachments/assets/0e6faac6-fa30-4f33-8ecc-8f5778811d7a)
(위 사진에 가르키는 게 터미널)
azd auth login --use-device-code=false <- 이거 한줄 치고 엔터를 눌러 로그인, 선택사항이 나올 경우 계속 엔터
az login <- 이거 한줄 치고 엔터를 눌러 로그인, 선택사항이 나올 경우 계속 엔터
GITHUB_TOKEN= <- 밑에 줄과 함께 치고 엔터를 눌러 로그인 선택사항이 나올 경우 계속 엔터
gh auth login

2.터미널에
azd auth login --check-status <- 이거 한줄 치고 엔터 눌러 로그인 확인
az account show <- 이거 한줄치고 엔터 눌러 로그인 확인
gh auth status <- 이거 한줄치고 엔터 눌러 로그인 확인

3.터미널에
AZURE_ENV_NAME="{{ GITHUB_ID }}"
azd init -e $AZURE_ENV_NAME
두줄을 함께 친다. 중요한 것은 {{ GITHUB_ID }}는 자신의 GitHub 아이디로 변경하여 예를 들어 GitHub 아이디가 Azure-Samples라면 {{ GITHUB_ID }}를 Azure-Samples로 변경해야한다.

4.배포 환경 초기화 방법을 물어보면 Use code in the current directory를 선택하여 엔터를 칩니다.
Azure Container Apps를 사용해 배포한다고 물어보면 Confirm and continue initializing my app 옵션을 선택하여 엔터를 칩니다.
그러면 .azure 디렉토리와 next-step.md, azure.yaml 파일이 생성된다.

5. 터미널에 azd up을 입력하여 엔터를 칩니다.
어떤 Azure 구독을 사용할 것인지 물어봅니다. 사용할 구독을 선택합니다.
어느 지역에 배포할 것인지 물어봅니다. 아무 지역이나 선택해도 되지만, 여기서는 Korea Central을 선택하여 엔터를 칩니다.
터미널에 글자들이 나오고 오랜시간 동안 기다리면 
![image] (https://github.com/hackersground-kr/aspire-app-dev-in-a-day-ko/blob/main/docs/images/04-azure-deployment-02.png) 다음과 같은 화면이 나와요.


> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**
