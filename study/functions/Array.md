# Array

## Arrays 주요 메서드

```java
import java.util.Arrays;

int[] arr = {3, 1, 4, 1, 5};

// 정렬
Arrays.sort(arr);                          // 오름차순 [1, 1, 3, 4, 5]
Arrays.sort(arr, 1, 4);                    // 인덱스 1~3 범위만 정렬

// Integer[] 내림차순 (primitive int[]는 불가)
Integer[] arr2 = {3, 1, 4};
Arrays.sort(arr2, (a, b) -> b - a);        // [4, 3, 1]

// 채우기
Arrays.fill(arr, 0);                       // 전체 0으로
Arrays.fill(arr, 1, 4, -1);               // 인덱스 1~3을 -1로

// 복사
int[] copy = Arrays.copyOf(arr, 3);        // 앞에서 3개 복사
int[] copy2 = Arrays.copyOfRange(arr, 1, 4); // 인덱스 1~3 복사

// 비교
Arrays.equals(arr, copy);                  // 값 기준 비교 (== 는 주소 비교)

// 출력
System.out.println(Arrays.toString(arr));          // [1, 1, 3, 4, 5]
System.out.println(Arrays.deepToString(matrix));   // 2차원 배열 출력

// 배열 → List
List<Integer> list = Arrays.asList(1, 2, 3);  // 고정 크기 List (add/remove 불가)
```

------

## 자주 쓰는 패턴

```java
// 배열 → ArrayList (add/remove 가능)
List<Integer> list = new ArrayList<>(Arrays.asList(arr2));

// 2차원 배열 정렬 (첫 번째 원소 기준)
int[][] points = {{3,2},{1,5},{2,1}};
Arrays.sort(points, (a, b) -> a[0] - b[0]);  // [[1,5],[2,1],[3,2]]

// 두 번째 원소 기준 정렬, 같으면 첫 번째 기준
Arrays.sort(points, (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);

// int[] → stream
int sum = Arrays.stream(arr).sum();
int max = Arrays.stream(arr).max().getAsInt();
```

------

## 주의사항

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

a == b            // false — 주소 비교
Arrays.equals(a, b) // true  — 값 비교

// Set에 int[] 넣으면 값 기준 중복 제거 안 됨
Set<int[]> set = new HashSet<>();
set.add(new int[]{1,2});
set.add(new int[]{1,2});
set.size(); // 2 — 주소가 다르므로 중복 아님
// → 값 기준 중복 제거는 List<Integer> 사용
```