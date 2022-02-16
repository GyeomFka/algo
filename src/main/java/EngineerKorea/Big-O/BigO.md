### What is Big-O?
- 알고리즘의 성능을 수학적으로 표현해주는 표기법
- 알고리즘의 시간&공간 복잡도 표현
- 실제 러닝타임은 아니며, 트래픽에 따른 알고리즘의 성능을 예측
  - 상수 = 1

#### 알고리즘의 스피드를 어떻게 표현하는지
- 수행하는 하드웨어에 따라 다름
- 따라서 "완료까지 걸리는 절차의 수"로 결정됨

#### O(1) : `데이터가 증가해도 처리시간에 영향을 주지 않음`
```
F(int[] n) {
    return (n[0]==0)? true:false;
}
```

#### O(n) : `입력 데이터의 크기 비례해서 처리시간 걸리는 알고리즘`
```
F(int[] n) {
    for i=0 to n.length
        print i
}
```

#### O(n^2)
```
F(int[] n) {
    for i=0 to n.length
        for j=0 to n.length
            print i+j;
}
```

#### O(nm) : N != M
```
F(int[] n, int[] m) {
    for i=0 to n.length
        for j=0 to m.length
            print i+j;
}
```

#### O(n^3)

#### O(2^n) : Fibonacci
#### O(m^n)
#### O(logN) : binary search

### 상수는 버린다
