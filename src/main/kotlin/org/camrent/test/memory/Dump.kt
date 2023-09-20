package org.camrent.test.memory


fun debugIntVariable(name: String, value: Int) {
    println("$name: Int($value)")
    println("size: ${Integer.SIZE / 8} bytes")
    println("data: 0x${value.toString(16).padStart(8, '0')}")
}

fun debugStringVariable(name: String, value: String) {
    println("$name: String(\"$value\")")
    println("size: ${value.length} bytes")
    println("data details:")

    var line = "[ "
    value.forEachIndexed { index, char ->
        line += "0x${char.code.toString(16).padStart(8, '0')}, "
        if ((index + 1) % 4 == 0 || index == value.length - 1) {
            line = line.dropLast(2) // Remove the trailing comma and space
            line += " ]"
            println(line)
            if (index != value.length - 1) {
                line = "[ "
            }
        }
    }
}

fun main() {
    // ประกาศตัวแปร
    val a: Int = 10
    val b: String = "Hello, world!"

    // แสดงข้อมูลเกี่ยวกับตัวแปร a
    debugIntVariable("a", a)

    // แสดงข้อมูลเกี่ยวกับตัวแปร b
    println()
    debugStringVariable("b", b)
}
