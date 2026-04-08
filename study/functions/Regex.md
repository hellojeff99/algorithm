# Regex

```java
// 1. 숫자만 추출
String text = "Price: 12345 won";
System.out.println(text.replaceAll("[^0-9]", "")); // 12345

// 2. 정수 또는 소수 검증
String num = "3.14";
System.out.println(num.matches("\\d+(\\.\\d+)?")); // true

// 3. 이메일 검증
String email = "user@example.com";
System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")); // true

// 4. 전화번호 검증
String phone = "010-1234-5678";
System.out.println(phone.matches("\\d{3}-\\d{3,4}-\\d{4}")); // true

// 5. 한글만 추출
String mixed = "안녕하세요 hello 반갑습니다";
System.out.println(mixed.replaceAll("[^가-힣]", "")); // 안녕하세요반갑습니다

// 6. 영문만 추출
String text2 = "Java123Python456";
System.out.println(text2.replaceAll("[^a-zA-Z]", "")); // JavaPython

// 7. 공백 제거 (시작/끝)
String padded = "  hello world  ";
System.out.println(padded.replaceAll("^\\s+|\\s+$", "")); // hello world

// 8. 특수문자 제거
String special = "Hello@World#123!";
System.out.println(special.replaceAll("[^a-zA-Z0-9]", "")); // HelloWorld123

// 9. split() 사용
String date = "2024.05.15";
String[] parts = date.split("\\.");
System.out.println(parts[0] + "-" + parts[1] + "-" + parts[2]); // 2024-05-15

// 10. comma + 공백 제거
String csv = "apple, banana , orange";
String[] items = csv.split(",\\s*");
System.out.println(items[0]); // apple
System.out.println(items[1]); // banana
```

```java
// 메타문자 이스케이프 (중요!)
String pattern1 = "\\."; // 온점 매칭
String pattern2 = "\\\\"; // 백슬래시 매칭

// 이메일 검증
String email = "test@example.com";
boolean isValid = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

// 숫자만 추출
String text = "Price: 12345 won";
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher(text);
while (m.find()) {
    System.out.println(m.group()); // 12345
}
```

