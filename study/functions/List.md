# List

## 주요 메서드

```java
List<Integer> list = new ArrayList<>();

// 추가
list.add(1);           // 맨 뒤에 추가
list.add(0, 99);       // 인덱스 0에 삽입 (기존 요소 밀림)

// 조회
list.contains(1);      // 포함 여부 — O(n)
list.indexOf(1);       // 첫 번째 인덱스, 없으면 -1

// 수정
list.set(0, 99);       // 인덱스 0의 값을 99로 변경

// 삭제
list.remove(0);              // 인덱스로 삭제
list.remove(Integer.valueOf(1)); // 값으로 삭제 (int 그대로 쓰면 인덱스 삭제)

// 정렬
list.sort((a, b) -> a - b);              // 오름차순
list.sort((a, b) -> b - a);              // 내림차순
list.sort(Comparator.naturalOrder());    // 오름차순
list.sort(Comparator.reverseOrder());    // 내림차순
```

------

## 변환

```java
// List → int[]
int[] arr = list.stream().mapToInt(i -> i).toArray();

// List → Integer[]
Integer[] arr2 = list.toArray(new Integer[0]);

// int[] → List (primitive 직접 변환 불가)
int[] arr = {1, 2, 3};
List<Integer> list = new ArrayList<>();
for (int n : arr) list.add(n);

// Integer[] → List
List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

// List → String
String str = list.stream()
    .map(String::valueOf)
    .collect(Collectors.joining(", ")); // "1, 2, 3"
```

------

## 자주 쓰는 패턴

```java
// 2차원 List
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++)
    graph.add(new ArrayList<>());

graph.get(0).add(1); // 0번 노드에 1 추가

// 중복 제거
List<Integer> deduped = list.stream().distinct().collect(Collectors.toList());
```

------

## 주의사항[]

```java
// remove(int) vs remove(Object) 혼동 주의
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
list.remove(1);               // 인덱스 1 삭제 → [1, 3]
list.remove(Integer.valueOf(1)); // 값 1 삭제 → [2, 3]

// Arrays.asList는 고정 크기
List<Integer> fixed = Arrays.asList(1, 2, 3);
fixed.add(4); // UnsupportedOperationException
// add/remove 필요하면 new ArrayList<>(Arrays.asList(...)) 로 감싸기
```