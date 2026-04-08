# String

## String 주요 메서드

```java
String s = "Hello World";

s.indexOf("o");          // 4 — 첫 번째 위치
s.lastIndexOf("o");      // 7 — 마지막 위치

// 변환
s.trim();                // 앞뒤 공백 제거
s.replace("World", "Java"); // "Hello Java"
s.replaceAll("[aeiou]", "*"); // 정규식 치환

// 분리
s.split(" ");            // ["Hello", "World"]
s.split(" ", 2);         // ["Hello", "World"] — 최대 2개로 분리

// 비교
s.equalsIgnoreCase("hello world"); // true — 대소문자 무시
s.compareTo("Hello");          // 양수 (사전순 비교)

// 확인
s.startsWith("Hello"); // true
s.endsWith("World");   // true
s.isEmpty();           // false
s.isBlank();           // false (공백만 있어도 true)
```

------

## String ↔ 변환

```java
// String → List<Character>
List<Character> list = new ArrayList<>();
for (char c : s.toCharArray()) list.add(c);
```

------

## StringBuilder — 문자열 조작

```java
// String + 연산은 반복 시 O(n²) → StringBuilder 사용
StringBuilder sb = new StringBuilder();

sb.insert(5, ",");       // 인덱스 5에 삽입 → "Hello, World"
sb.delete(5, 6);         // 인덱스 5~5 삭제 → "Hello World"
sb.deleteCharAt(0);      // 인덱스 0 삭제
sb.replace(0, 5, "Hi");  // 0~4를 "Hi"로 교체
sb.reverse();            // 뒤집기
sb.toString();           // String으로 변환
sb.length();             // 길이
sb.charAt(0);            // 문자 접근
sb.setCharAt(0, 'h');    // 문자 수정
```

------

## StringTokenizer — 빠른 문자열 분리

```java
// split()보다 빠름 — 대용량 입력에 유리
StringTokenizer st = new StringTokenizer("1 2 3 4 5");
while (st.hasMoreTokens()) {
    int n = Integer.parseInt(st.nextToken());
}

// 구분자 지정
StringTokenizer st2 = new StringTokenizer("a,b,c", ",");
```

------

## 자주 쓰는 패턴

```java
// 문자 빈도 카운트
int[] freq = new int[26];
for (char c : s.toCharArray())
    freq[c - 'a']++;

// 팰린드롬 체크
String rev = new StringBuilder(s).reverse().toString();
boolean isPalindrome = s.equals(rev);

// 문자열 정렬
char[] chars = s.toCharArray();
Arrays.sort(chars);
String sorted = new String(chars);

// 특정 문자 제거
s.replaceAll("[^a-zA-Z0-9]", ""); // 영숫자만 남기기
```
