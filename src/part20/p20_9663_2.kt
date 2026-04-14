fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val full = (1 shl n) - 1

}

private var cnt = 0
private fun search(full: Int, cols: Int, diag1: Int, diag2: Int) {
    // cols 이 가득 차면 배치 완료
    // avail 공간 찾기
    // 1. avail 가장 오른쪽 1 을 bit로 지정
    // 2. avail 가장 오른쪽 1 을 제거
    // 3. dfs 탐색
    // 4. avail 모두 0 이 될때까지 반복 한다
}