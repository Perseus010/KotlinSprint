package org.example.lesson_1

fun main() {

    val secondsOfCosmos: Int = 6_480

    val hours: Int = secondsOfCosmos / 3600
    val minutes: Int = secondsOfCosmos % 3600 / 60
    val seconds: Int = secondsOfCosmos % 3600 % 60

    println("$hours".padStart(2, '0') + ":" + "$minutes".padStart(2, '0') + ":" + "$seconds".padStart(2, '0'))

}