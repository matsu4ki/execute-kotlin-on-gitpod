fun main(args: Array<String>) {
    // 参考
    // https://qiita.com/SYABU555/items/7cc5909c119ec9ab0288#for-index

    // if
    println("===========================")
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
    
    // for
    println("===========================")
    for (x in 1..10) {
        println("hello" + x)
    }

    // index取りたいとき
    println("===========================")
    val array = listOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    // 範囲指定の方法
    println("===========================")
    for (i in 1..100) { println(i) } // closed range: includes 100
    println("---------------------------")
    for (i in 1 until 100) { println(i) } // half-open range: does not include 100 
    println("---------------------------")
    for (x in 2..10 step 2) { println(x) }
    println("---------------------------")
    for (x in 10 downTo 1) { println(x) }
    println("===========================")
}