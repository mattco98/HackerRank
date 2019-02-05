package algorithms

class ClimbingTheLeaderboard {
    fun climbingTheLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
        val leaderboard = scores.groupingBy { it }.eachCount().keys

        return alice.map { score ->
            if (score > leaderboard.last())
                leaderboard.withIndex().indexOfFirst { it.value <= score } + 1
            else
                leaderboard.size + 1
        }.toTypedArray()
    }
}