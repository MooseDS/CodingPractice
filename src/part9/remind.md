# 복습

## 에라토스테네스의 체 (소수 판별법)

// 제곱의 수부터 배수 제거 방법
2*2 = 4 
3*3 = 9 
5*5 = 25 

```
var isPrime = BooleanArray(n+1) {true}
isPrime[0] = false
isPrime[1] = false

var i = 2
while (i * i < n + 1) {
    if (isPrime[i]) {
        var j = i * i
        while (j < 10001) {
            isPrime[j] = false
            j += i
        }
    }
    i++
}
```