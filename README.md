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
5. 만약 자신이 맥이라면 apple을 클리하여 다운로드 버튼을 누르고, 윈도우라면 intel를 눌러서 다운로드 버튼을 클릭한다. 우리는 apple을 선택해서 다운로드를 해보자
6. 아래의 이미지 처럼 빨간색 화살표가 가르키는 것을 클릭한다.
![image](https://github.com/user-attachments/assets/d5f633ff-5f67-4312-8a06-488fe10011c4)
7. 클릭하게 되면 흰색 배경에 왼쪽과 오른쪽에 아이콘 같은게 뜰것이다.
8. 이때 왼쪽에 있는걸 두번 클릭한다,
9. 화면에 뭐가 뜰텐데 위에서 첫번째꺼 누르면 된다.
10. 이렇게 하면 인텔리제이가 열릴것이다.
11. 왼쪽 위에 new project를 클릭한다.
12. 영어로 뭐가 많이 적혀있을 것이다.
13. 맨위에는 이름이니 하고 싶은 이름을 작성한다.
14. 그 아래에는 위치를 선택할 수 있는데 처음에는 그대로 두는 것을 추천한다,
15. 또 아래로 내려가게 되면 3가지 선택할 수 있는 버튼들이 있을것이다
16. 이때 제일 왼쪽에 있는 버튼을 클릭한다.
17. 그 아래에 jdk이라고 써져있을것이다.
18. 이름 옆에 박스를 클릭한다.
19. 많가 많이 있지만 그 중에서 Download JDK...를 선택한다.
20. 클릭하게 되면 위에서 부터 버전, 종류, 위치를 선택할 수 있다.
21. 순서대로 버전 : 22, 종류 : Oracle OpenJDK, 위치는 자유
22. 선택하게 되면 오른쪽 아래 파란색 버튼을 클릭한다.
23. 그리고 한번더 오른쪽 아래 파란색 버튼을 클릭한다.
24. 그러면 환경설정이 다 되었다.

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
