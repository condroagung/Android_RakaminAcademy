package com.rakamin.myapplication

class Player(var aksi: String){

    val act = aksi
}

class Result(player1 : Player, player2 : Player){

    val playable1 = player1
    val playable2 = player2
    var hasil = ""

    fun getResult(){
        if (playable1.act == playable2.act){
            hasil = "Seri"
        } else if (playable1.act  == "Kertas" && playable2.act == "Batu"){
            hasil = "Player 1 Menang"
        } else if (playable1.act  == "Gunting" && playable2.act == "Kertas"){
            hasil = "Player 1 Menang"
        } else if (playable1.act  == "Batu" && playable2.act == "Gunting"){
            hasil = "Player 1 Menang"
        } else if (playable2.act == "Kertas" && playable1.act  == "Batu"){
            hasil = "Player 2 Menang"
        } else if (playable2.act == "Gunting" && playable1.act  == "Kertas"){
            hasil = "Player 2 Menang"
        } else  {
            hasil = "Player 2 Menang"
        }
        println(hasil)
    }
}


fun playGame(){
    var i = 0
    val list = listOf<String>("Batu","Gunting","Kertas")
    var hasil = ""
    while (i < 3) {
        println("GAME BATU GUNTING KERTAS")
        val player1 = Player(list.random())
        val player2 = Player(list.random())
        println("Player 1 ${player1.act}")
        println("Player 2 ${player2.act}")
        Result(player1,player2).getResult()
        i++
    }
}

fun main() {
    playGame()
}