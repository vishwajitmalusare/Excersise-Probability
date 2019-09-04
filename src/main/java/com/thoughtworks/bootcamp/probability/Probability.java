package com.thoughtworks.bootcamp.probability;

public class Probability {
    private final float value;

    public Probability(float value){
        this.value=value;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Probability)){
            return false;
        }

        Probability that = (Probability)object;
        return this.value == that.value;
    }
}
