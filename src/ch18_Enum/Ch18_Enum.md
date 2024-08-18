# Chapter18 Enum

## 1. 열거형
> - 서로 관련 있는 상수들을 모아 놓고 대표할 수 있는 이름을 정의한 것을 열거형이라고 한다.

```
enum 이름 {
    // 요소 나열
}
```

<br>

### 1.1 final 상수를 사용했을 때 모호함

> 인터페이스 변수 앞에는 public static final이 생략된 것이다.

#### 예제: Ex01_Constants
> 실수로 다른 의미의 상수값을 인수로 넘겼지만 에러는 발생하지 않는다.

<br>

### 1.2 열거형으로 모호함 피하기

#### 예제: Ex02_Enum
> - 열거형 데이터 값을 설정한 후 이름을 정하고 사용할 데이터 종류만 넣으면 된다.

```
class Customer {
    enum Gender { MALE, FEMALE }
    
    public Gender gen;
    
    public String toString() {
        if(gen == Gender.MALE)
            return "Thank you, Mr " + name;
        else
            return "Tahnk you, Ms " + name;
    }
}
```
> - 클래스 안에 열거형이 정의되어있다.
> - 클래스 내에서 열거형을 사용할 수 있지만 다른 클래스에서는 사용할 수 없다.

<br>
<br>

## 2. 가변 인수
> - 가변 인수(variable length argument)란 메서드 인수 개수가 가변적인 것을 말한다.
> - 예를들어 System.out.printf
> - 가변 인수에는 다음과 같이 말줄임표 ...를 붙인다.

```
PrintStream printf(String format, Object ... args)
```
> 가변 인수가 아닌 인수와 함께 사용할 때는 가변 인수 매개변수가 항상 마지막에 와야 한다.

> 가변인수

```
public static void helloEverybody(String...vargs) {...}

public static void main(String[] args)
{
    helloEverybody("홍길동");
    helloEverybody("홍길동", "전우치");
    helloEverybody("홍길동", "전우치", "손오공");
}
```

> 배열

```
public static void helloEverybody(String[] vargs) {...}

public static void main(String[] args)
{
    helloEverybody(new String[]{"홍길동"});
    helloEverybody(new String[]{"홍길동", "전우치"});
    helloEverybody(new String[]{"홍길동", "전우치", "손오공"});
}
```

### 예제: Ex03_Varargs

<br>
<br>

## 3. 어노테이션

> - 자바 어노테이션(Annotation)은 자바 소스 코드에 추가하여 사용할 수 있는 메타 데이터의 일종이다.
> - @ 기호를 앞에 붙여서 사용한다.

<br>

### 3.1 @Override
> - 오버라이딩을 올바르게 했는지 컴파일러가 체크한다.
> - 오버라이딩할 때 메서드명을 잘못 적는 실수를 하는 경우가 많은데 이런 점을 방지하는 데 사용한다.

#### 예제: Ex04_Override

<br>

### 3.2 @Deprecated
> - 이 어노테이션이 적용된 메서드는 문제의 발생 소지가 있거나 개선된 기능의 다른 것으로 대체되어서 더 이상 필요 없게 되었음을 뜻한다.
> - 아직은 호환성 유지를 위해서 존재하지만 이후에 사라질 수 있는 클래스 또는 메서드를 가리켜 Deprecated되었다고 한다.

#### 예제: Ex05_Deprecated

<br>

### 3.3 @SuppressWarnings

> - 자바의 버전업에 따른 Deprecated 메시지는 하위 호환성을 위해 메시지만 표시되고 실제로 메서드가 없어지고 그러진 않고 있다.
> - 그런데 Deprecated되었다는 경고는 계속 발생한다.
> - SuppressWarnings 어노테이션에 deprecation 관련 경고 등 특정 메시지를 지정하면 해당 경고 메시지를 출력하지 말라는 의미다.

#### 예제: Ex06_SuppressWarnings
> @Deprecated된 메서드를 사용하면 경고 메세지를 내라고 한 것이기 때문에 사용하는 곳마다 @SuppressWarnings를 사용해주어야 한다.

<br>
<hr>

## 출처
이재환의 자바 프로그래밍 입문