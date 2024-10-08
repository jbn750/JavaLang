# Chapter05 콘솔 출력과 입력
***

## 1. 콘솔 출력
> - 콘솔: 컴퓨터를 대상으로 데이터를 입력하는 입력 및 출력하는 장치
>   - ex) 키보드, 모니터

> ```System.out.printf("포맷 문자열", 데이터, 데이터, 데이터, ...);```
> 
> ```System.out.print("정수 : %d, 실수 : %f, 글자 : %c 글자들 : %s", 10, 3.14, 'A', "홍길동");```
> 
> 출력결과
> 정수 : 10, 실수 : 3.14, 글자 : A, 글자들 : 홍길동

| 서식 지정자 | 출력의 형태                    |
|--------|---------------------------|
| %d     | 10진수 정수 형태 출력             |
| %o     | 8진수 정수 형태 출력              |
| %x     | 16진수 정수 형태 출력             |
| %f     | 실수 출력                     |
| %e     | e 표기법 기반 실수 출력            |
| %g     | 출력 대상에 따라서 %e 또는 %f 형태 출력 |
| %s     | 문자열 출력                    |
| %c     | 문자 출력                     |

> e 표기법
> - 0.0000000001 이런 수를 수학에서는 보기 편하게 1.0 * 10<sup>-10</sup> 처럼 표기한다
> - 문석 작성기에서는 이런 표현이 가능하나 프로그래밍 언어에서는 쓸 수 없기 때문에 e 문자를 사용하며 지수를 표현한다.
> - 1.0e-10

<br><br>

## 2. 콘솔 입력
> Scanner
> - 콘솔(키보드) 입력 기능 제공
> - 여러 데이터가 한 번에 입력되면 입력된 내용은 공백이나 탭으로 구분

### 예제 : Ch05_Ex02_Scanner1
### 예제 : Ch05_Ex03_Scanner2

> ```nextLine();```
> - 입력된 값을 Enter가 입력될 때 한 번에 줄 단위로 입력
>
> ```next();```
> - 입력받은 값을 일단 버퍼에 넣고 공백(스페이스)이나 탭으로 구분하여 입력을 구분하여 처리

<br>
<hr>

## 출처
이재환의 자바 프로그래밍 입문