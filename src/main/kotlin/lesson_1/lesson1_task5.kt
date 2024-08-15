package org.example.lesson_1

const val secondsPerHour: Int = 3600
const val secondsPerMinute: Int = 60

fun main() {

    val secondsOfCosmos: Int = 6_480

    val hours: Int = secondsOfCosmos / secondsPerHour
    val minutes: Int = secondsOfCosmos % secondsPerHour / secondsPerMinute
    val seconds: Int = secondsOfCosmos % secondsPerHour % secondsPerMinute

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}