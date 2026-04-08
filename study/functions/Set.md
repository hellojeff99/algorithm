# Set

## 자주 쓰는 패턴

```java
// 중복 제거
int[] arr = {1, 2, 2, 3, 3};
Set<Integer> set = new HashSet<>();
for (int n : arr) set.add(n);
// set = {1, 2, 3}

// add() 반환값으로 중복 체크
if (set.add(num)) {
    // 처음 등장한 값일 때만 실행
    result.add(num);
}

// 방문 체크 (BFS/DFS)
Set<Integer> visited = new HashSet<>();
if (!visited.contains(node)) {
    visited.add(node);
    // 처리
}
```
