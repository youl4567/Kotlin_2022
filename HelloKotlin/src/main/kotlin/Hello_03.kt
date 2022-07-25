
// 두 개의 정수형 매개변수를 받고
// int 형 return 하는 함수 선언
fun add(num1: Int, num2: Int) : Int {
    return num1 + num2;
}
fun main() {
    var result = add(num1=100 ,num2=200);
    println(result)

    var radius = 30
    println("반지름: $radius")
    println("원의 둘레: (${radius * 2 * Math.PI}")
    println("원의 넓이 ${radius * radius * Math.PI}")

    // 문자열을 배열처럼 부분 문자 추출 가능
    var nation = "Korea"
    println("${nation[1]}")
    println("${nation[2]}")
    println("${nation[3]}")

    // raw 문자열
    nation = """
        republic of Korea
        대한민국
        우리나라
    """
    // 앞 쪽의 빈칸 제거하기
    // 줄 바꿈은 그대로 유지
    println(nation.trimIndent())

    // 자바에서는 배열은 모든 요소가 타입이 같아야 한다
    // kotlin 은 요소의 타입이 달라도 된다.
    val arr = arrayOf(1, "Korea", true)
    println("${arr[0]}, ${arr[1]}")

    // 배열.size = 배열의 개수
    // 배열.get(첨자) = 첨자 위치의 값 일기
    //      사용하지 말것을 권장
    println("${arr.size}, ${arr.get(0)}")

    // 정수형 배열 선언하고 값 초기화 하기
    val arr1 = intArrayOf(3,4,5,6,7,8,9)

    // 3개의 요소를 갖는 배열을 선언하고
    // i = 0~2 일때 i * 10 을 각각 계산하여 요소에 저장하기
    var arr2 = Array<Int>(size = 3, { i-> i * 10})
    for( a in arr2) {
        println(a)
    }

    // 정수형 배열 5개를 선언하고
    // 각각의 요소에 i+10, 1+ 10 2+ 10 저장
    var arr3 = IntArray(size = 5, {i-> + 10})
    
    // 자바의 List<String> 타입의 데이터
    // 데이터를 변경할 수 있는 리스트
    var mutableList = mutableListOf("Korea", "대한민국")
    // 데이터를 변경할 수 없는 리스트
    var immutableList = ListOf<String>("Korea", "대한민국")
}