package aoc2020

import aoc2020.Day01
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.File

class Day01Test {

    private val solution = Day01()

    @Test fun solvePart1_sampleInput() {
        val input = solution.readInput(File("src/test/resources/aoc2020/day01.sample"))
        assertThat(solution.solvePart1(input)).isEqualTo(514579)
    }

    @Test fun solvePart2_sampleInput() {
        val input = solution.readInput(File("src/test/resources/aoc2020/day01.sample"))
        assertThat(solution.solvePart2(input)).isEqualTo(241861950)
    }

}