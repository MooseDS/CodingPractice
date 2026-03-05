# 약수, 배수, 소수

## 배수 (유클리드 호제법)


## 소수 판별볍
booleanArray로 판별이 아닌 
해당 N 이 소수인지 판별 하는 방법

```
if (n == 0 || n == 1) false
if (n % 2 == 0) false

// 홀수에 대해서만 판별
var i = 3
while (i * i <= n) {
    if (n % i == 0) {
        return false
    }
    i += 2
}
return true
```