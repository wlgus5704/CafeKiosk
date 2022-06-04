![image](https://user-images.githubusercontent.com/101785677/171644252-181f0ead-1acc-4fe4-9bcc-27dfbfe83548.png)
☕융합프로그래밍2 <바리스타융> 윤종연, 이건회, 이민희, 이지현


제작연도 : 2022 <br/> 
사용기술 : JAVA(swing, awt etc..) <br/> 
제작목표 : 
- Swing 컴포넌트의 Jframe과 Jpanel을 이용해 자바 GUI 구현하기
- 클래스와 객체의 관계를 이용하여 실생활의 복잡한 문제를 해결하기
- 다양한 조건문과 반복문 익히기

프로젝트 구조:<br/> 
<br/> 
![image](https://user-images.githubusercontent.com/101785677/171644956-60156a47-a53e-4b88-9ef6-c54d479dd601.png)
<br/> <br/> 

<img src = "https://user-images.githubusercontent.com/101785677/171650842-a0b2090f-7090-4a5e-8962-a55a21c706e5.png" height="100">

<img src = "https://user-images.githubusercontent.com/101785677/171651710-547d30ee-19b4-41fd-a7e9-226b7597b576.png" height="600">
 Main 화면 - Take out or here/관리자 화면(soldout class로 연결) - 오른쪽 상단 작은 네모 <br/> 
 
 
 <img src = "https://user-images.githubusercontent.com/101785677/171650696-5a727419-fc0b-474d-b563-9a3f3f6471f8.png" height="100">
 <img src = "https://user-images.githubusercontent.com/101785677/171649626-17e09791-0750-4d83-a768-473eec513b69.png" height="600">
 Menu 화면 - 주문수량을 받아오는 class <br/>
 <img src = "https://user-images.githubusercontent.com/101785677/171647605-219d6118-224a-4256-a98d-5ba45cb93ad8.png" height="600">
Menu 미선택시, Error창 <br/>
 <img src = "https://user-images.githubusercontent.com/101785677/171649739-1c58aab9-3758-4532-8771-bf6b5a6a4265.png" height="600">
주문수량을 입력<br/>


 <img src = "https://user-images.githubusercontent.com/101785677/171650624-37de26c3-1661-46cc-8f01-38f7ab44cff7.png" height="100">
  <img src = "https://user-images.githubusercontent.com/101785677/170823522-27de4945-794f-4b52-ba6c-957340b962a3.png" height="600">
<br/>개업이벤트<차별성을 위한 class><br/>
<img src = "https://user-images.githubusercontent.com/101785677/171651137-6f1cf7d9-b0bd-486a-8d6b-64cdc871336c.png" height="600">
<br/> 랜덤 문자열 발생 <br/>


<img src = "https://user-images.githubusercontent.com/101785677/171651979-315b5a90-940f-4d5f-b71d-95c2ab259b58.png" height="100">
<img src = "https://user-images.githubusercontent.com/101785677/171651359-2e1d02f8-750e-48ac-92f1-aba6e66bf32a.png" height="600">
매장에서 먹고가는 경우 +랜덤문자열(꽝인경우 다음과 같이 표시되지않음)<br/>
<img src = "https://user-images.githubusercontent.com/101785677/171652434-6f81e267-e24e-43a4-ad4e-ebd74a94cc66.png" height="600">
Take out은 천원할인된 금액+랜덤문자열<br/>
<img src = "https://user-images.githubusercontent.com/101785677/171651487-aaeb014c-d109-46be-baa2-a4c31d306966.png" height="600">
Card버튼 누를시 다음과 같이 결제완료창 발생/BACK버튼시 다시 MENU클래스로<br/>


<img src = "https://user-images.githubusercontent.com/101785677/171652586-e38b8fd8-3dd6-4e14-b138-f03ba2a6e66b.png" height="100">
<img src = "https://user-images.githubusercontent.com/101785677/171639531-ddf7e46e-ffa9-4e88-ad37-a90da74d3d65.png" height="600">
초기화버튼시 Menu클래스 초기화면과 같은 화면<br/>
<img src = "https://user-images.githubusercontent.com/101785677/171653219-002af9e1-acb1-4063-a6db-000fade68b2b.png" height="600">
품절시 다음과 같이 MENU클래스에서 메뉴 삭제<단, 같은행에서 중복 삭제할 경우 초기화버튼 누른 후 같은행 품절 다시 눌러주어야함>즉, 품절진행시 이미 품절된 상품이 있을경우, 초기화버튼을 누른 후, 품절된 모든 상품 다시 눌러주는 것을 권장.
