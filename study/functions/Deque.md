# Deque

## ArrayDeque — Stack / Queue

## PriorityQueue — 힙

```java
// 최소힙 (default) — 작은 값 먼저
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// 최대힙 — 큰 값 먼저
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// [1] 내림차순, 같으면 [0] 오름차순
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
    a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]
);
```

------

## 자주 쓰는 패턴

```java
// K번째 최솟값 — 최대힙으로 크기 K 유지
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
for (int num : arr) {
    pq.offer(num);
    if (pq.size() > k) pq.poll(); // k 초과 시 가장 큰 값 제거
}
int kthMin = pq.peek(); // 힙의 top = k번째 최솟값

// 다익스트라 기본 구조
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // 거리 오름차순
pq.offer(new int[]{start, 0}); // {노드, 거리}
while (!pq.isEmpty()) {
    int[] cur = pq.poll();
    // ...
}
```

------

## 주의사항

```java
// PriorityQueue는 contains()가 O(n) — 빈번한 탐색엔 부적합
pq.contains(5); // O(n)

// 중간 요소 우선순위 변경 불가 — 꺼내고 다시 넣어야 함
pq.remove(target); // O(n)
pq.offer(newTarget);

// iteration 순서는 힙 순서가 아님 — poll()로만 순서 보장
for (int n : pq) // 순서 보장 안 됨
```