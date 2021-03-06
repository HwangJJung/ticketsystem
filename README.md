

# 기차 티켓팅 시스템

# 2014.10.01

## 테스트 방법

    1. editable 패키지 안에 바꿀 수 있는 값들이 들어있습니다. 
    2. editable.Simulator 안에서 몇 초동안 프로그램을 돌릴지 정할 수 있습니다.
    3. ClientQueue에서 고객을 더 추가하거나 줄일 수 있습니다.
    4. StationCollection에서 역을 더 추가할 수 있습니다. 
    다만 역을 더 추가할 경우, 따로 클래스로 구현했기 때문에 
    상당히 여러군데 손을 보아야합니다. 총 4군데나 손대야하기때문에 수정이 필요할 것 같습니다. 
    팩토리 패턴을 염두해보았지만, 오버엔지니어링의 느낌인지라 일단은 이렇게 구현해두었습니다. 



## 명세사항

 1.박은종 교수님 분반의 티켓시스템을 목표로 구현하였습니다.
 2.그러나 아직 프로그램이 제대로 돌아가지 않습니다. 
 3. 한번 소스파일이 날아가서 디컴파일링해서 소스를 복구한 터라 주석이 거의 없습니다. 
 달아보도록 하겠습니다.
 3. 수정 및 구현 요구사항은 다음과 같습니다.

### 구현사항

> 1. 고객들을 각 역으로 보내줄 수 있습니다. 
> 2. 고객들의 시간에 맞추어 티켓팅을 진행시킬 수 있습니다. 
> 3. 실제 고객들의 프로세스 진행시간을 구할 수 있습니다. 
> 4. 다중 스레드 프로그램으로 여러 역과 여러 명의 티켓박스를 동시에 돌릴 수 있습니다. 
> 5. 티켓박스가 비었을 경우, 고객의 티켓팅을 진행할 수 있습니다.

    
### 비구현사항

> 1. 엑셀 데이터를 활용하는 FileIO부분이 구현되지 않았습니다.
> 2. 고객들이 티켓까지만 받고 실제로 열차에 탑승하는 부분은 구현되지 않았습니다. 
> 3. 고객들을 처리하는 알고리즘을 구현되지 않았습니다. (선착순대로_티켓팅이 진행됩니다. )
> 4. 열차가 운행하는 부분의 알고리즘이 구현되지 않았습니다.
> 5. 각 역마다의 고유의 값들(연결된 역, 정책 등등)이 구현되지 않았습니다.
> 6. 예외처리가 잘 되어있지 않습니다. 구멍막는데 급급한 느낌입니다.
> 7. 이외 이슈가 더 있을 것으로 예상됩니다. 

### 버그 및 수정이 필요한 사항

> 1. 디버깅이 잘 이루어지지 않아 자잘한 버그가 아직 다수 존재합니다. 
> 2. 클래스, 패키지간 의존관계가 잘 정리되지 않았습니다. 
> 상당히 어지러워 구조를 파악하기가 매우 어렵습니다. 
> 3. 티켓박스가 비었을 경우엔 옵저버 패턴을 활용해 고객을 티켓박스로 보내줄 수 있으나 고객이 역에 
> 들어왔을 때는 갱신이 이루어지지 않아 다른 방식으로 구현해보려했으나... 코드가 꼬여버렸습니다. 
> 옵저버 패턴은 사실상 예외처리 되었습니다. 살려볼 방법을 찾아보겠습니다.
> 4. ticketingTime이 찍히지 않습니다. 
> 5. 시작할 때 스레드인가 인덱스 에러가 납니다만, 무리없이 진행은 됩니다.
> 6. 스테이션 선언할때 순서를 지켜야 에러가 나지 않습니다.
> 7. 추상화가 되다가 말았습니다. 상당히 지저분합니다. 
> 8. 특히나 Abstract 클래스들을 의미없이 좀 사용한 감이 많습니다. 
> 9. 복잡도를 좀 낮출 방법을 찾아야할 듯 싶습니다.

### 후기

    너무 어려웠습니다. 다른 분반에 비해 배움이 적었다는 생각에 무리해서라도 도전해보고자 기차를 골랐지만
    어휴.... 이렇게 복잡할 줄은 몰랐습니다. 아니 이렇게 복잡하게 밖에 구현을 못할 줄은.....
    스레드들간 문제도 있었고, 조영호 교수님께 배웠던 도메인 중심, 객체지향적 코드를 나름 지향하고자 
    디자인 패턴도 배우지 않았지만 공부해서 적용시켜보려고 꽤 노력을 기울였습니다. 그런데, 정말이지 
    실제로 적용하기가 너무 힘들었습니다. TDD도 익숙하지 않아 디버깅하는것도 너무 어려웠습니다.
    시간이 나면 계속적으로 개선해 나가보아야겠습니다. 

