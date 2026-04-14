# remind

# 등차수열 합 (bfs랑 연결)
 
```
// n개의 원소에서 r 개의 원수 뽑기
// nCr = n! / (n-r)! * r!

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}


```