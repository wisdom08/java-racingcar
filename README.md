# 자동차 경주 게임
## 1단계 - String 클래스에 대한 학습 테스트
### 요구사항 
요구사항1
- "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.

요구사항 2
- "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.

요구사항 3
- "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다. 
- String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다. 
- JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

### 기능 목록
요구사항1
- [ ] 콤마를 기준으로 숫자를 분리한다.
- [ ] 숫자가 하나인 경우, 그 하나의 숫자만을 포함하는 배열을 반환한다. 

요구사항2 
- [ ] 주어진 값에서 괄호 제거

요구사항3
- [ ] 특정 위치의 문자를 가져온다.
- [ ] 위치 값을 벗어나면 StringIndexOutOfBoundsException 발생
- [ ] @DisplayName 활용해서 의도 드러내기
