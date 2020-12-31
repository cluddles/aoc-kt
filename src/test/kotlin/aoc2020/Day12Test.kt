package aoc2020

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.File

class Day12Test {

    private val solution = Day12()

    @Test fun solvePart1_sampleInput() {
        assertThat(solution.solvePart1(File("src/test/resources/aoc2020/day12.sample"))).isEqualTo(25)
    }

    @Test fun solvePart2_sampleInput() {
        assertThat(solution.solvePart2(File("src/test/resources/aoc2020/day12.sample"))).isEqualTo(286)
    }

}