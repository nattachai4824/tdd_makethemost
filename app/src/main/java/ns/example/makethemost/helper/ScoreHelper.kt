package ns.example.makethemost.helper

import kotlin.random.Random

class ScoreHelper {

    companion object {

//        // Initial state before testing
//        fun calculate(firstScore: Int, secondScore: Int): Int {
//            return 0
//        }
//
//        // Before refactor
//        fun calculate(firstScore: Int, secondScore: Int): Int {
//            val addedValue = firstScore + secondScore
//            if (addedValue < 10) {
//                return addedValue
//            } else if (addedValue == 10) {
//                return 0
//            } else {
//                return addedValue % 10
//            }
//        }

        // After Refactor
         fun calculate(firstScore: Int, secondScore: Int) = (firstScore + secondScore) % 10

        // Score Random
         fun random() = Random.nextInt(0, 10)
    }
}