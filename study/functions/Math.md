# Math

## 기본 메서드

```java
Math.max(3, 5);       // 5
Math.min(3, 5);       // 3
Math.abs(-5);         // 5
Math.pow(2, 10);      // 1024.0 — double 반환
Math.sqrt(16);        // 4.0    — double 반환
Math.floor(3.7);      // 3.0    — 내림
Math.ceil(3.2);       // 4.0    — 올림
Math.round(3.5);      // 4      — 반올림
```

------

## 정수 관련 상수

```java
Integer.MAX_VALUE;   //  2,147,483,647 (약 21억)
Integer.MIN_VALUE;   // -2,147,483,648
Long.MAX_VALUE;      //  9,223,372,036,854,775,807
Long.MIN_VALUE;      // -9,223,372,036,854,775,808

// 합산 시 int 범위 초과 주의
long sum = 0;
for (int n : arr) sum += n; // int끼리 더하면 overflow 가능
```

------

## 진법 변환

```java
// 10진수 → n진수 문자열
Integer.toBinaryString(10);   // "1010" (2진수)
Integer.toOctalString(10);    // "12"   (8진수)
Integer.toHexString(10);      // "a"    (16진수)
Integer.toString(10, 3);      // "101"  (3진수)

// n진수 문자열 → 10진수
Integer.parseInt("1010", 2);  // 10
Integer.parseInt("ff", 16);   // 255
```

------

## GCD / LCM

```java
// 유클리드 알고리즘 — GCD
int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

// LCM
int lcm(int a, int b) {
    return a / gcd(a, b) * b; // overflow 방지: 나누기 먼저
}
```