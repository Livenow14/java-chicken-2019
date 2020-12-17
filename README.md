# java-chicken-2019

## 📌 Livenow14 프로그램 구현

## 객체 협력 
- "사장"에게 주문이 들어온다.
- "포스기"는 "사장"에게 테이블을 입력할 것을 요청한다.
- "사장"은 입력을 함으로써 "포스기"의 요청에 응답한다.
- "포스기"는 "사장"에게 메뉴를 입력할 것을 요청한다.
- "사장"은 입력을 함으로써 "포스기"의 요청에 응답한다.
- "포스기"는 "사장"에게 수량을 입력할 것을 요청한다.
- "사장"은 입력을 함으로써 "포스기"의 요청에 응답한다.

- "사장"에게 결제 요청이 들어온다.
- "포스기"는 "사장"에게 테이블을 입력할 것을 요청한다.
- "사장"은 입력을 함으로써 "포스기"의 요청에 응답한다.
- "포스기"는 메뉴 수량 금액을 보여주고, "사장"에게 입력할 것을 요청한다. 
- "사장"은 입력을 함으로써 "포스기"의 요청에 응답한다.
- "포스기"는 최종 결제 금액을 보여준다. 

<br>

## 객체 역할 & 책임 (아는것과 하는것)
### **사장(사용자)**
- 아는 것

<br>

- 하는 것 
    - 포스기 조작
    - 주문등록
        - 주문 테이블 입력 요청
        - 주문 메뉴 입력 요청
        - 주문 수량 입력 요청
    - 결제
        - 결제수단 입력 요청

## **포스기**
- 아는 것
    - 메뉴 목록
    - 테이블 목록
    - 주문 목록
    
<br>

- 하는 것
    - 주문등록
        - 테이블 목록 출력 요청
        - (사장에게) 주문 테이블 입력 요청
        - 메뉴 목록 출력 요청   
        - (사장에게) 주문 메뉴 입력 요청
        - (사장에게) 주문 수량 입력 요청
    - 결제
        - 결제 금액 출력 요청
        - 결제수단 입력 요청

## **메뉴**
- 아는 것
    - 메뉴 번호
    - 음식 카테고리
    - 이름
    - 가격
<br>

- 하는 것 

## **테이블**
- 아는 것
    - 테이블 번호

<br>

- 하는 것

## **주문**
 - 아는 것
     - 메뉴
     - 주문 수량
     - 테이블 번호
 
 <br>
 
 - 하는 것

## **주문수량**
- 아는 것
    - 수량
<br>

- 하는 것 

## **결제금액**
- 아는 것
    - 금액 
<br>

- 하는 것 

## **할인조건**
- 아는 것
    - 할인 조건(들)
<br>

- 하는 것 
    - 할인 금액 반환

## 구현할 기능 목록
- [x] 객체 모델링
## **메인화면**
- [x] 메인 화면 출력
- [x] 보장된 숫자 입력
    - 보장된 숫자(1,2,3 만을 허용)
    - 보장된 숫자가 아닐 시 `InputViewException`
- [x] 1을 입력 시 주문등록 화면 
- [ ] 2를 입력 시 결제하기 화면
- [ ] 3을 입력 시 종료

### **주문등록**
- [x] 테이블 목록 출력
- [x] 테이블 선택에 보장된 숫자 입력
    - 보장된 숫자(테이블에 등록된 숫자만 허용)
- [X] 등록된 메뉴 선택에 보장된 숫자 입력
    - 보장된 숫자(메뉴에 포함된 숫자만 허용)
- [x] 메뉴의 수량 선택에 보장된 숫자 입력
- [x] 주문 등록 
- [x] 주문 등록 테스트
- [x] 동일한 메뉴의 주문이 들어올 시 동일한 메뉴의 수량이 증가 해야한다.
- [x] 총 주문수량이 99개가 넘어가면 에러가 발생한다.


### **결제하기**
- [ ] 테이블 선택에 보장된 숫자 입력
    - 보장된 숫자(주문이 된 숫자)
    - 주문이 되지 않은 테이블 선택시 `에러 발생`
- [ ] 주문 내역 출력
- [ ] 결제 수단 입력에 보장된 숫자 입력
    - (결제 수단에 등록된 숫자만 허용)
- [ ] 최종 결제 금액 출력