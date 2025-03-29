package org.songeun

enum class Nationality(val description: String) {
    KOREA("한국"),
    FRANCE("프랑스"),
    JAPANESE("일본")
    ; // semicolon is required !

    fun printDescription() = println(this.description)
}