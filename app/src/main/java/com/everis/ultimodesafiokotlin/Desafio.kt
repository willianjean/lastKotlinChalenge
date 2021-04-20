package com.everis.ultimodesafiokotlin

import java.util.Scanner

fun main(args: Array<String>) {

}

fun oJogoMatematicoDePaula(){
    val N = readLine()!!.toInt()
    var N1 = 0
    var N2 = 0
    var N3 = 0
    for (i in 1..N) {
        var v = readLine()!!
        val N1 = v[0].toString().toInt()
        val N2 = v[2].toString().toInt()
        val N3 = v[1]
        if(N1 == N2)
            println(N1.times(N2))
        else if (N3.toUpperCase()==v[1])
            println(N2.minus(N1))
        else
            println(N2.plus(N1))
    }
}

fun conversaoSimplesDeBase(){
    //converte decimal pra hexadecimal e vice e versa, o que entrar ele inverte
    var s : String
    var n : Int
    val r = """0x.*""".toRegex()
    while(true) {
        var temp = readLine()!!
        if (r.containsMatchIn(temp)) {
            s = temp.replace("0x", "").trim()
            n = Integer.parseInt(s,16)
            println(n)
        }
        else if (temp.toInt() > 0) {
            var temp2 = Integer.toHexString(temp.toInt()).toUpperCase()
            println("0x$temp2")
        } else break
    }
}

fun bobConduite(){
    //sem comentarios kkkk
    val input = Scanner(System.`in`)
    for (i in 1..input.nextInt()) {
        var raio1 = input.nextInt()
        var raio2 = input.nextInt()
        println(raio1 + raio2)
    }
}
