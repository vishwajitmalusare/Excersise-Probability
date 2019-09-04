package com.thoughtworks.bootcamp.probabilityTest;

import com.thoughtworks.bootcamp.probability.Probability;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProbabilityTest {
    private static Probability impossibleEvent;
    private static Probability certainEvent;
    @BeforeAll
    static void setup(){
        impossibleEvent = new Probability(0.0f);
        certainEvent = new Probability(1.0f);
    }
    @Test
    void giventEventProbabilitiesOfTwoeEventsIsZero_whenCheckingEquality_thenReturnTrue() {
        Probability probabilityZeroEvnet = new Probability(0.0f);
        assertEquals(impossibleEvent,probabilityZeroEvnet);
    }
    @Test
    void givenProbabilityForEventOneIsZeroEventTwoZero_whenCheckingEquality_tehenReturnFalse(){
        assertNotEquals(impossibleEvent,certainEvent);
    }
}
