package com.thoughtworks.bootcamp.probabilityTest;

import com.thoughtworks.bootcamp.probability.Probability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    @Test
    void giventEventProbabilitiesOfTwoeEventsIsZero_whenCheckingEquality_thenReturnTrue() {

        Probability ProbabilityObject = new Probability(0.0f, 0.0f);
        assertEquals(ProbabilityObject, ProbabilityObject);
    }
}
