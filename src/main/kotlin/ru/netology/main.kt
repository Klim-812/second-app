package ru.netology

fun main (){
    val minComission = 3500
    val maxComission = (0.75/100)
    val amount = 500000

    val totalMaxComission = amount * maxComission

    val comission = if(totalMaxComission<minComission) minComission else totalMaxComission
    println(comission)
}