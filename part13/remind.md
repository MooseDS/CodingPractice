# 정렬

## 메모리 사용방법
~~~
0 ~ n // 입력 최대 값 n
arr[n] // 입력 값 중복이 없는 경우 메모리 사용으로 해결 가능
~~~ 


## 선택 selection sort

- i번째에 들어갈 최소값을 찾는다, 바깥 i는 확정 자리 / 안쪽 j는 탐색

```
// 최소 (오름차순), 최대 (내림차순)
for (int i=0; i<size-1; i++) {
    int temp = i;
    for (int j=i+1; j<size; j++) {
        if (arr[temp] >= arr[j]) temp = j
    }
    swap(arr[i], arr[temp])
} 
```

## 삽입 insert sort

왼쪽은 정렬돼있다고 가정하고 끼워넣는다, 밀고 → 빈자리에 key 삽입

```
for (int i=1; i<size; i++) {
    int key = arr[i]
    int j = i-1;
    while(j>=0 && key < arr[j]) {
        arr[j+1] = arr[j]
        j--;
    }
    arr[j+1] = key
}
```

## 버블 bubble sort
: 큰 값이 뒤로 밀려난다, j < n-1-i ← 이게 핵심 포인트

```
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            swap(arr, j, j + 1);
        }
    }
}
```

## 합병 merge sort

```
function mergeSort(arr, start, end) {
    if start < end
        mid = (start + end) / 2
        mergeSort(arr, start, mid)
        mergeSort(arr, mid + 1, end)
        merge(arr, start, mid, end)
}

function merge(arr, start, mid, end) {
    size1 = mid - start + 1
    size2 = end - mid

    left[1..size1], right[1..size2]
    
    for i = 1 to size1:
        left[i] = arr[start + i - 1]
    
    for j = 1 to size2:
        right[j] = arr[mid + j]

    i = 1, j = 1
    k = start

    while i <= size1 and j <= size2
        if left[i] <= right[j]
            arr[k] = left[i]
            i = i + 1
        else 
            arr[k] = right[j]
            j = j + 1
        k = k + 1

    // 남은 요소 복사
    while i <= size1:
        arr[k] = left[i]
        i = i + 1
        k = k + 1

    while j <= size2:
        arr[k] = right[j]
}
```


## 퀵 quick sort

```
void quickSort(int[] arr, int left, int right) {
    if (left >= right) return;

    int pivot = arr[(left + right) / 2];
    int l = left;
    int r = right;

    while (l <= r) {
        while (arr[l] < pivot) l++;
        while (arr[r] > pivot) r--;

        if (l <= r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }

    quickSort(arr, left, r);
    quickSort(arr, l, right);
}
```

## 힙 heap sort


## count 정렬
시간 알고리즘 O( n * k ) // n 갯수 k 최대값 (n 보다 k 가 낮아야 의미가 있음)
 
```
// 1. 원소의 최댓값을 포함할 수 있는 배열 설정
// 2. 각각의 원소가 몇 번 등장하는지 카운팅 
// count 배열의 인덱스 = 원소 값, count 배열의 값 = 등장 횟수
// 3. count 배열을 누적합으로 만들어주기
// 4. 정렬되지 않은 배열(초기값) 의 뒤에서부터 돌면서, 
// 원소의 값과 동일한 인덱스가 가리키는 곳에 원소 배치해주기

val arr[n] // 기존 배열
val sortedArr[n] // 정렬 배열
val cntArr[maxValue + 1] //  count 배열

for (i=0; i<arr.size; i++) {
    cntArr[arr[i]]++
}

for (i=1; i<cntArr.size; i++) {
    cntArr[i] += cntArr[i-1]
}

for (i=arr.size-1; i>=0; i--) {
    cntArr[arr[i]]--
    sortedArr[cntArr[arr[i]]] = arr[i] // 핵심 **
}
```


## Radix 정렬


## stable sort
정렬을 했을 때 중복된 값들의 순서가 변하지 않으면 Stable, 아니면 Unstable

대표적인 Stable
- Insertion Sort
- Merge Sort
- Bubble Sort
- Counting Sort

Unstable Sort
- Selection Sort
- HeapSort
- Shell Sort
- Quick Sort