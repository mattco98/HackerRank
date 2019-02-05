package algorithms

import ch.tutteli.atrium.api.cc.en_GB.toBe
import org.junit.Test
import ch.tutteli.atrium.verbs.*

class ClimbingTheLeaderboardTest {
    @Test
    fun test1() {
        val leaderboard = arrayOf(100, 100, 50, 40, 40, 20, 10)
        val scores = arrayOf(5, 25, 50, 120)
        val answer = listOf(6, 4, 2, 1)

        val ranks = ClimbingTheLeaderboard().climbingTheLeaderboard(leaderboard, scores).toList()

        assert(ranks).toBe(answer)
    }

    @Test
    fun test2() {
        val leaderboard = arrayOf(100 downTo 0 step 10)
        val scores = arrayOf(41, 99, 0, 100, 50)
        val answer = listOf(7, 2, 11, 1, 6)
    }
}