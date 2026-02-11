fun computeScore(baseValue: Int, multiplier: Int, extraBonus: Int): Int {
    val points = baseValue * multiplier * extraBonus
    return if (points >= 0) points else 0
}

fun main() {

    var playerScore = 5
    println("Score au début : $playerScore")

    playerScore += computeScore(8, 2, 1)
    println("Score après première étape : $playerScore")

    playerScore += computeScore(25, 1, 3)
    println("Score après deuxième étape : $playerScore")

    playerScore += computeScore(-20, 1, 2)
    println("Score final du joueur : $playerScore")
}
