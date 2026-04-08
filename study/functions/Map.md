# Map

## HashMap — 기본 Map

```java
Map<String, Integer> map = new HashMap<>();

// 조회
map.get("a");              // 2, 없으면 null
map.getOrDefault("b", 0);  // 없으면 0 반환
map.containsKey("a");      // true
map.containsValue(2);      // true

// 삭제
map.remove("a");

// 순회
for (String key : map.keySet()) { }
for (int val : map.values()) { }
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    entry.getKey();
    entry.getValue();
}
```

------

## 핵심 메서드

```java
// merge — 빈도 누적할 때
// key 없으면 put(key, value), 있으면 remappingFunction 적용
map.merge("a", 1, Integer::sum);   // 없으면 1, 있으면 기존값 + 1
map.merge("a", plays[i], Integer::sum); // 장르별 총합 누적

// computeIfAbsent — Map<K, List<V>> 패턴
// key 없으면 함수 실행해서 생성 + 저장 + 반환
map.computeIfAbsent("a", k -> new ArrayList<>()).add(1);

// putIfAbsent — key 없을 때만 put
map.putIfAbsent("a", 0); // 이미 있으면 무시
```

------

## LinkedHashMap — 순서 보장 Map

```java
// Insertion Order (default) — 삽입 순서 유지
Map<String, Integer> map = new LinkedHashMap<>();

// Access Order — LRU Cache
LinkedHashMap<String, Integer> lru = new LinkedHashMap<>(16, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
        return size() > CACHE_SIZE; // 초과 시 가장 오래된 entry 자동 제거
    }
};

lru.put("a", 1); // [a]
lru.put("b", 2); // [a, b]
lru.get("a");    // [b, a] — a가 최근 접근으로 맨 뒤 이동
```

------

## TreeMap — 정렬된 Map

```java
TreeMap<Integer, String> tmap = new TreeMap<>();

tmap.firstKey();        // 최솟값 key
tmap.lastKey();         // 최댓값 key
```

------

## 자주 쓰는 패턴

```java
// 빈도 카운트
for (String s : arr)
    map.merge(s, 1, Integer::sum);

// 그루핑 (장르별 곡 목록, 그래프 인접 리스트)
for (int i = 0; i < n; i++)
    songMap.computeIfAbsent(genres[i], k -> new ArrayList<>())
           .add(new int[]{i, plays[i]});

// Map을 value 기준 내림차순 정렬
List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
entries.sort((a, b) -> b.getValue() - a.getValue());
```
