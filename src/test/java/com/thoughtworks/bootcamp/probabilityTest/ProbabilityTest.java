package com.thoughtworks.bootcamp.probabilityTest;

import com.thoughtworks.bootcamp.probability.Probability;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//This class is written to test Event Probabilities
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

    @Test
    void givenProbabilityOfZeroOccurance_whenCheckUnoccuranceProbability_thenReturnOne(){
        assertEquals(certainEvent,impossibleEvent.not());
    }

    @Test
    void givenProbabilityForOccurance_whenCheckingUnoccuranceProbablility_thenReturnZero(){
        assertEquals(impossibleEvent,certainEvent.not());
    }
    @Test
    void givenProbabilityAsZero_whenCheckingProbabilityOfEventTogether_theRetunProbabilityZero(){
        assertEquals(impossibleEvent,impossibleEvent.and(impossibleEvent));
    }
    @Test
    void giveProbabilityOneforOneEvnets_whenCheckingProbabilityOfEventOccureTogether_thenReturnProbabilityDotTen() {
        Probability dotOneProbability = new Probability(0.10f);
        assertEquals(new Probability(0.10f), dotOneProbability.and(certainEvent));
    }
    @Test
    void givenPobabilityZero_whenCalculatingEitherTwoEventsOccuring_thenReturnZero(){
        assertEquals(impossibleEvent,impossibleEvent.or(impossibleEvent));
    }
    @Test
    void givenProbabilityOfGettingHeadAndProbabilityOfGettingSixInDice_whenCalculatingEitherOccuraredProbability_thenReturn(){
        assertEquals(new Probability(0.75f),new Probability(0.5f).or(new Probability(0.5f)));
    }
}
